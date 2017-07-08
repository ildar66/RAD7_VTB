package com.vtb.security.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.MQSchedulerSheet;
import com.vtb.ejb.helper.OIDGeneratorHelper;
import com.vtb.exception.NoSuchMqSchedulerSheetException;
import com.vtb.forms.DialogForm;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.MqSchedulerSheetDialogForm;

/**
 * @version 1.0
 * @author
 */
public class MqSchedulerSheetDialogAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		MqSchedulerSheetDialogForm mqSchedulerSheetDialogForm = (MqSchedulerSheetDialogForm) form;

		try {
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");
			String action = mqSchedulerSheetDialogForm.getAction();
			if (DialogForm.ACTION_EDIT.equalsIgnoreCase(action) || DialogForm.ACTION_VIEW.equalsIgnoreCase(action) || DialogForm.ACTION_DELETE.equalsIgnoreCase(action)) {
				String key = mqSchedulerSheetDialogForm.getVo().getId().toString();
				mqSchedulerSheetDialogForm.setVo(processor.findMqSchedulerSheetByKey(Integer.valueOf(key)));
				// находим Филиал:
				String departmentKey = mqSchedulerSheetDialogForm.getVo().getId_department().toString();
				if (departmentKey != null) {
					mqSchedulerSheetDialogForm.setDepartmentVO(processor.findDepartmentByKey(Integer.valueOf(departmentKey)));
				}
				initDaysOfWeekArray(mqSchedulerSheetDialogForm);
			} else if (DialogForm.ACTION_ADD.equalsIgnoreCase(action)) {
				int id = OIDGeneratorHelper.getNextId("tables.MQ_SCHEDULER_SHEET");
				mqSchedulerSheetDialogForm.getVo().setId(new Long(id));
				// находим Филиал:
				String departmentKey = mqSchedulerSheetDialogForm.getVo().getId_department().toString();
				if (departmentKey != null) {
					mqSchedulerSheetDialogForm.setDepartmentVO(processor.findDepartmentByKey(Integer.valueOf(departmentKey)));
				}
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

		}

		// Finish with
		return (forward);

	}

	/**
	 * инит. массив дней недели:
	 * 
	 * @param aForm
	 */
	private void initDaysOfWeekArray(MqSchedulerSheetDialogForm aForm) {
		int[] daysOfWeekArray = new int[7];
		Integer daysOfWeek = aForm.getVo().getDaysOfWeek();
		if (daysOfWeek != null) {
			String daysOfWeekStr = String.valueOf(daysOfWeek);
			int numDaysOfWeek = daysOfWeekStr.length()-1;
			try {
				// ПНД:
				if ('1'==(daysOfWeekStr.charAt(numDaysOfWeek--))) {
					daysOfWeekArray[0] = 1;
				}
				// ВТР:
				if ('1'==(daysOfWeekStr.charAt(numDaysOfWeek--))) {
					daysOfWeekArray[1] = 10;
				}
				// СРД:
				if ('1'==(daysOfWeekStr.charAt(numDaysOfWeek--))) {
					daysOfWeekArray[2] = 100;
				}
				// ЧТВ:
				if ('1'==(daysOfWeekStr.charAt(numDaysOfWeek--))) {
					daysOfWeekArray[3] = 1000;
				}
				// ПТН:
				if ('1'==(daysOfWeekStr.charAt(numDaysOfWeek--))) {
					daysOfWeekArray[4] = 10000;
				}
				// СУБ:
				if ('1'==(daysOfWeekStr.charAt(numDaysOfWeek--))) {
					daysOfWeekArray[5] = 100000;
				}
				// ВСК:
				if ('1'==(daysOfWeekStr.charAt(numDaysOfWeek))) {
					daysOfWeekArray[6] = 1000000;
				}
			} catch (StringIndexOutOfBoundsException e) {
				//e.printStackTrace();
			}

		}
		aForm.setDaysOfWeek(daysOfWeekArray);
	}
}
