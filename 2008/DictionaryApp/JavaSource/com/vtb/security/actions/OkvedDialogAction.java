package com.vtb.security.actions;

import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Okved;
import com.vtb.ejb.helper.OIDGeneratorHelper;
import com.vtb.exception.NoSuchOkvedException;
import com.vtb.forms.DialogForm;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.OkvedDialogForm;
import com.vtb.value.BeanKeys;


/**
 * @version 	1.0
 * @author ildar
 */
public class OkvedDialogAction extends SecurityAppAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		OkvedDialogForm dialogForm = (OkvedDialogForm) form;

		try {
			//addOwnershipFormTypeListBean(request);
			addIndustryListBean(request);
			addRegionListBean(request);
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			String action = dialogForm.getAction();
			if (DialogForm.ACTION_EDIT.equalsIgnoreCase(action) || DialogForm.ACTION_VIEW.equalsIgnoreCase(action) || DialogForm.ACTION_DELETE.equalsIgnoreCase(action)) {
				Okved okved = processor.findOkvedByKey(dialogForm.getVo().getId());
				initParentForOkved(request, processor, okved);
				dialogForm.setVo(okved);
			} else if (DialogForm.ACTION_ADD.equalsIgnoreCase(action)) {
				int id = OIDGeneratorHelper.getNextId("tables.OKVED");
				dialogForm.setVo(new Okved(id));
			}
		} catch (Exception e) {
			// Report the error using the appropriate name and ID.
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.toString()));
		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.isEmpty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as desired)
			forward = mapping.findForward("error");

		} else {

			// Forward control to the appropriate 'success' URI (change name as desired)
			forward = mapping.findForward("success");

		}

		// Finish with
		return (forward);

	}

	/**
	 * @param processor
	 * @param okved
	 */
	private void initParentForOkved(HttpServletRequest request, SecurityActionProcessor processor, Okved okved) {
		LinkedList<Okved> hierarchyList = new LinkedList<Okved>();
		int depth = 4;
		if(okved != null && okved.getParent().getId() != null){
			try {
				Okved parent = processor.findOkvedByKey(okved.getParent().getId());
				okved.setParent(parent);
				hierarchyList.add(parent);
				while (parent.getParent().getId() != null && depth > 0) {
					Integer parentKey = parent.getParent().getId();
					parent = processor.findOkvedByKey(parentKey);
					hierarchyList.addFirst(parent);
					depth--;
				}				
			} catch (NoSuchOkvedException e) {
				//okved.setParent(new Okved(null));
			}
		}
		// Add ValueBean to request context and forward response
		request.setAttribute(BeanKeys.OKVED_PARENT_HIERARCHY_LIST, hierarchyList);
		
	}
}
