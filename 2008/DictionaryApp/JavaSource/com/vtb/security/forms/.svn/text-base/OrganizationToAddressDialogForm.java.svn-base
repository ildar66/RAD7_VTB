package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Address;
import com.vtb.domain.Organization;
import com.vtb.forms.DialogForm;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>OrganizationToAddressDialogForm - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class OrganizationToAddressDialogForm extends DialogForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Address vo = new Address(null);
	private Organization organizationVO = new Organization();

	public Integer getOrganizationID() {
		return getVo().getOrganizationID();
	}

	public void setOrganizationID(Integer organizationId) {
		getVo().setOrganizationID(organizationId);
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// Reset values are provided as samples only. Change as appropriate.
		super.reset(mapping, request);
		organizationVO = new Organization();
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
	public Address getVo() {
		return vo;
	}

	/**
	 * @param msUser
	 */
	public void setVo(Address aVO) {
		vo = aVO;
	}

	/**
	 * @param string
	 */
	public void setId(Integer aId) {
		getVo().setId(aId);
	}

	public Organization getOrganizationVO() {
		return organizationVO;
	}

	public void setOrganizationVO(Organization organizationVO) {
		this.organizationVO = organizationVO;
	}

}
