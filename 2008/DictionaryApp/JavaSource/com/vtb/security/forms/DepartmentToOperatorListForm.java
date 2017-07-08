package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Department;

/**
 * Form bean for a Struts application.
 * 
 * @version 1.0
 * @author
 */
public class DepartmentToOperatorListForm extends ActionForm

{
	private String searchStr = new String("%");

	private String orderBy = "login";

	private String activeState = "Y";
	
	private Department departmentVO = new Department(null);
	
	public String getActiveState() {
		return activeState;
	}

	public void setActiveState(String activeState) {
		this.activeState = activeState;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset field values here.

	}

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

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
	public String getSearchStr() {
		return searchStr;
	}

	/**
	 * @param string
	 */
	public void setSearchStr(String string) {
		searchStr = string;
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

	public Department getDepartmentVO() {
		return departmentVO;
	}

	public void setDepartmentVO(Department departmentVO) {
		this.departmentVO = departmentVO;
	}
	
	/**
	 * @param string
	 */
	public void setDepartmentId(Integer aDepartmentId) {
		getDepartmentVO().setId(aDepartmentId);
	}
	
	/**
	 * @return Integer
	 */
	public Integer getDepartmentId() {
		return getDepartmentVO().getId();
	}		

}
