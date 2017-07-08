package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Department;
import com.vtb.domain.MQSchedulerSheet;
import com.vtb.forms.DialogForm;

/**
 * Form bean for a Struts application. Users may access 2 fields on this form:
 * <ul>
 * <li>MqSchedulerSheet - [your comment here]
 * </ul>
 * 
 * @version 1.0
 * @author
 */
public class MqSchedulerSheetDialogForm extends DialogForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MQSchedulerSheet vo = new MQSchedulerSheet(-1);

	private Department departmentVO = new Department(null);

	private int[] daysOfWeek = new int[0];// дни недели

	public Long getDepartmentId() {
		return getVo().getId_department();
	}

	public void setDepartmentId(Long departmentId) {
		getVo().setId_department(departmentId);
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// Reset values are provided as samples only. Change as appropriate.
		super.reset(mapping, request);
		departmentVO = new Department(null);
		daysOfWeek = new int[0];
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		// ActionErrors errors = super.validate(mapping, request);
		ActionErrors errors = new ActionErrors();
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		// errors.add("field", new
		// org.apache.struts.action.ActionError("error.field.required"));
		// }
		return errors;

	}

	/**
	 * @return
	 */
	public MQSchedulerSheet getVo() {
		return vo;
	}

	/**
	 * @param msUser
	 */
	public void setVo(MQSchedulerSheet aVO) {
		vo = aVO;
	}

	/**
	 * @param string
	 */
	public void setId(Long aId) {
		getVo().setId(aId);
	}

	public Department getDepartmentVO() {
		return departmentVO;
	}

	public void setDepartmentVO(Department departmentVO) {
		this.departmentVO = departmentVO;
	}

	public int[] getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(int[] aDaysOfWeek) {
		this.daysOfWeek = aDaysOfWeek;
	}

}
