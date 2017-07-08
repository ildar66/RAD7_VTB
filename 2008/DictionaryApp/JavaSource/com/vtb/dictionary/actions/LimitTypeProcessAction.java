package com.vtb.dictionary.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.dictionary.forms.LimitTypeDialogForm;
import com.vtb.forms.DialogForm;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.DictionaryActionProcessor;

/**
 * @version 	1.0
 * @author
 */
public class LimitTypeProcessAction extends Action

{

    public ActionForward execute(ActionMapping mapping, ActionForm form,
	    HttpServletRequest request, HttpServletResponse response)
	    throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		LimitTypeDialogForm limitTypeDialogForm = (LimitTypeDialogForm) form;

		try {
			// Get actionprocess (model) and delegate
			DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory.getActionProcessor("Dictionary");
			String action = limitTypeDialogForm.getAction();
			if (DialogForm.ACTION_ADD.equalsIgnoreCase(action)) {
				processor.addLimitType(limitTypeDialogForm.getVo());
				limitTypeDialogForm.setFlagOperation(true);
			} else if (DialogForm.ACTION_EDIT.equalsIgnoreCase(action)) {
				processor.updateLimitType(limitTypeDialogForm.getVo());
				limitTypeDialogForm.setFlagOperation(true);
			} else if (DialogForm.ACTION_DELETE.equalsIgnoreCase(action)) {
				processor.removeLimitType(limitTypeDialogForm.getVo().getId());
				limitTypeDialogForm.setFlagOperation(true);
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
}
