package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Department;
import com.vtb.domain.Operator;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class OperatorToRoleListForm extends ActionForm {
	private Operator operatorVO = new Operator(null);
	private String orderBy = " name";
	private java.lang.String operation = "";
	private String selectedID = null;
	private Department departmentVO = new Department(null);
	private String processID = "ALL";

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		operation = "";
		selectedID = null;
		departmentVO = new Department(null);
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
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
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * @param string
	 */
	public void setOrderBy(String string) {
		orderBy = string;
	}

	/**
	 * @param Integer
	 */
	public void setId(Integer aId) {
		getOperatorVO().setId(aId);
	}

	/**
	 * @return Integer
	 */
	public Integer getId() {
		return getOperatorVO().getId();
	}

	/**
	 * @return
	 */
	public Operator getOperatorVO() {
		return operatorVO;
	}

	/**
	 * @param operator
	 */
	public void setOperatorVO(Operator operator) {
		operatorVO = operator;
	}

	/**
	 * @return
	 */
	public java.lang.String getOperation() {
		return operation;
	}

	/**
	 * @return
	 */
	public String getSelectedID() {
		return selectedID;
	}

	/**
	 * @param string
	 */
	public void setOperation(java.lang.String string) {
		operation = string;
	}

	/**
	 * @param integer
	 */
	public void setSelectedID(String idStr) {
		selectedID = idStr;
	}

	public Department getDepartmentVO() {
		return departmentVO;
	}

	public void setDepartmentVO(Department departmentVO) {
		this.departmentVO = departmentVO;
	}

	public String getProcessID() {
		return processID;
	}

	public void setProcessID(String processID) {
		this.processID = processID;
	}

}
