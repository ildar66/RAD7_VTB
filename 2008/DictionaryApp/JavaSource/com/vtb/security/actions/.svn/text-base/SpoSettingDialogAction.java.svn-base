package com.vtb.security.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.SPOSettings;
import com.vtb.exception.NoSuchSpoSettingException;
import com.vtb.forms.DialogForm;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.SpoSettingDialogForm;

/**
 * @version 1.0
 * @author
 */
public class SpoSettingDialogAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		SpoSettingDialogForm spoSettingDialogForm = (SpoSettingDialogForm) form;

		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
				.getActionProcessor("Security");
		String idStr = String.valueOf(spoSettingDialogForm.getVo().getId_department());
		// инит. Филиал:
		Integer departmentKey = new Integer(idStr);
		if (departmentKey != null) {
			spoSettingDialogForm.setDepartmentVO(processor.findDepartmentByKey(departmentKey));
		}
		SPOSettings spoSetting = null;
		try {
			spoSetting = processor.findSpoSettingByKey(departmentKey);
			// Если находим запись то редактируем:
			spoSettingDialogForm.setAction(DialogForm.ACTION_EDIT);
			spoSettingDialogForm.setVo(spoSetting);
		} catch (NoSuchSpoSettingException nso) {
			// Если не находим запись то создаем:
			spoSettingDialogForm.setAction(DialogForm.ACTION_ADD);
			spoSettingDialogForm.setVo(new SPOSettings(Long.parseLong(idStr)));
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

		}

		// Finish with
		return (forward);

	}
}
