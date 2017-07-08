package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Department;
import com.vtb.domain.Operator;
import com.vtb.forms.DialogForm;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>DepartmentToOperatorDialogForm - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class DepartmentToOperatorDialogForm extends DialogForm {

	private Operator vo = new Operator(null);
	private Department departmentVO = new Department(null);

	public Integer getDepartmentId() {
		return getVo().getDepartmentID();
	}

	public void setDepartmentId(Integer departmentId) {
		getVo().setDepartmentID(departmentId);
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// Reset values are provided as samples only. Change as appropriate.
		super.reset(mapping, request);
		departmentVO = new Department(null);
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		
		ActionErrors errors = super.validate(mapping, request);
		// Validate the fields in your form, adding
		// adding each error to this.errors as found, e.g.

		// if ((field == null) || (field.length() == 0)) {
		//   errors.add("field", new org.apache.struts.action.ActionError("error.field.required"));
		// }
		return errors;

	}
	/**
	 * @return
	 */
	public Operator getVo() {
		return vo;
	}

	/**
	 * @param msUser
	 */
	public void setVo(Operator aVO) {
		vo = aVO;
	}

	/**
	 * @param string
	 */
	public void setId(Integer aId) {
		getVo().setId(aId);
	}

	public Department getDepartmentVO() {
		return departmentVO;
	}

	public void setDepartmentVO(Department departmentVO) {
		this.departmentVO = departmentVO;
	}

}
