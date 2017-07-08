package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.OrganizationGroup;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class GroupToOrganizationListForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String searchStr = new String("%");
	private String orderBy = "ORGANIZATIONNAME";
	private String activeState = "Y";
	private OrganizationGroup groupVO = new OrganizationGroup(null);
	
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

	public Integer getGroupID() {
		return getGroupVO().getId();
	}

	public void setGroupID(Integer groupID) {
		getGroupVO().setId(groupID);
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

	public OrganizationGroup getGroupVO() {
		return groupVO;
	}

	public void setGroupVO(OrganizationGroup groupVO) {
		this.groupVO = groupVO;
	}

}
