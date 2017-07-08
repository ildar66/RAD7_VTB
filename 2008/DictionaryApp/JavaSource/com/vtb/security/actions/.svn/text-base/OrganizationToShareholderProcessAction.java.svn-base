package com.vtb.security.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.forms.DialogForm;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.OrganizationToShareholderDialogForm;

/**
 * @version 1.0
 * @author
 */
public class OrganizationToShareholderProcessAction extends Action

{

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		OrganizationToShareholderDialogForm dialogForm = (OrganizationToShareholderDialogForm) form;

		try {
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");
			String action = dialogForm.getAction();
			if (DialogForm.ACTION_ADD.equalsIgnoreCase(action)) {
				processor.addShareholder(dialogForm.getVo());
				dialogForm.setFlagOperation(true);
			} else if (DialogForm.ACTION_EDIT.equalsIgnoreCase(action)) {
				processor.updateShareholder(dialogForm.getVo());
				dialogForm.setFlagOperation(true);
			} else if (DialogForm.ACTION_DELETE.equalsIgnoreCase(action)) {
				processor.removeShareholder(dialogForm.getVo().getId().intValue());
				dialogForm.setFlagOperation(true);
			}
		} catch (Exception e) {
			// Report the error using the appropriate name and ID.
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.toString()));
		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.isEmpty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as
			// desired)
			forward = mapping.findForward("error");

		} else {

			// Forward control to the appropriate 'success' URI (change name as
			// desired)
			forward = mapping.findForward("success");
			// forward = mapping.findForward(dialogForm.getForwardName());

		}

		// Finish with
		return (forward);

	}
}
