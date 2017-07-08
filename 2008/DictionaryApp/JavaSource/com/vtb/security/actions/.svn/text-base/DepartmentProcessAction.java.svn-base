package com.vtb.security.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.exception.NoSuchSpoSettingException;
import com.vtb.forms.DialogForm;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.DepartmentDialogForm;

/**
 * @version 1.0
 * @author
 */
public class DepartmentProcessAction extends Action

{

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		DepartmentDialogForm departmentsDialogForm = (DepartmentDialogForm) form;

		try {
			// Проверка кода:
			Integer code = departmentsDialogForm.getVo().getCode();
			if(code != null && code.intValue() > 99){
				errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", "Код должен быть двузначный !!!"));
				saveErrors(request, errors);
				return mapping.findForward("error");
			}			
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");
			String action = departmentsDialogForm.getAction();
			if (DialogForm.ACTION_ADD.equalsIgnoreCase(action)) {
				processor.addDepartment(departmentsDialogForm.getVo());
				departmentsDialogForm.setFlagOperation(true);
			} else if (DialogForm.ACTION_EDIT.equalsIgnoreCase(action)) {
				processor.updateDepartment(departmentsDialogForm.getVo());
				departmentsDialogForm.setFlagOperation(true);
			} else if (DialogForm.ACTION_DELETE.equalsIgnoreCase(action)) {
				// TODO !вынести в общий метод в один контекст транзакции:
				try {
					processor.removeSpoSetting(departmentsDialogForm.getVo().getId());
				} catch (NoSuchSpoSettingException e) {
					//нет SPO
				}
				processor.removeDepartment(departmentsDialogForm.getVo().getId());
				departmentsDialogForm.setFlagOperation(true);
			}
		} catch (Exception e) {
			// Report the error using the appropriate name and ID.
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt",
					e.toString()));
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

		}

		// Finish with
		return (forward);

	}
}
