package com.vtb.security.actions;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Okved;
import com.vtb.exception.ModelException;
import com.vtb.exception.NoSuchOkvedException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.OkvedHierarchyListForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 	1.0
 * @author ildar
 */
public class OkvedHierarchyListAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		try {
			// Look at the ActionForm object
			OkvedHierarchyListForm aForm = (OkvedHierarchyListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			//инит. родителя для списка ОКВЕД:
			Integer parentKey = aForm.getParentID();
			ArrayList list = processor.findOkvedHierarchyList(parentKey, aForm.getOrderBy());
			Okved parent = processor.findOkvedByKey(parentKey);			
			aForm.setParent(parent);
			//инит. иерархию для родителя:
			initParentForOkved(request, processor, parent);
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.OKVED_HIERARCHY_LIST, list); 
			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OkvedHierarchyListAction.execute:" + e);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
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
