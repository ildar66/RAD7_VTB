package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Organization;


/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author ildar
 */
public class OrganizationToGovernListForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String searchStr = new String("%");
	private String orderBy = "name";
	private String activeState = "Y";
	private Organization organizationVO = new Organization();
	
	private java.lang.String operation = "";
	private String selectedID = null;	
	
	public java.lang.String getOperation() {
		return operation;
	}

	public void setOperation(java.lang.String operation) {
		this.operation = operation;
	}

	public String getSelectedID() {
		return selectedID;
	}

	public void setSelectedID(String selectedID) {
		this.selectedID = selectedID;
	}

	public Integer getOrganizationID() {
		return getOrganizationVO().getId_contractor().intValue();
	}

	public void setOrganizationID(Integer organizationID) {
		getOrganizationVO().setId_contractor(new Long(organizationID));
	}

	public String getActiveState() {
		return activeState;
	}

	public void setActiveState(String activeState) {
		this.activeState = activeState;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset field values here.

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

	public Organization getOrganizationVO() {
		return organizationVO;
	}

	public void setOrganizationVO(Organization organizationVO) {
		this.organizationVO = organizationVO;
	}

}
