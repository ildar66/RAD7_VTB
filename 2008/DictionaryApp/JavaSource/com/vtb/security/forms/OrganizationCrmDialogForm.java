package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Organization;
import com.vtb.forms.DialogForm;
import com.vtb.util.Formatter;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>OrganizationCrmDialogForm - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class OrganizationCrmDialogForm extends DialogForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Organization vo = new Organization(null, "", "");

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// Reset values are provided as samples only. Change as appropriate.
		super.reset(mapping, request);
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
	public Organization getVo() {
		return vo;
	}

	/**
	 * @param msUser
	 */
	public void setVo(Organization aVO) {
		vo = aVO;
	}

	/**
	 * @param string
	 */
	public void setIdCRM(String idCRM) {
		getVo().setAccountid(idCRM);
	}

	/**
	 * @return
	 */
	public String getDateOfRegistrationStr() {
		return Formatter.sqlDateFormat(getVo().getDate_of_registration());
	}

	/**
	 * @param string
	 */
	public void setDateOfRegistrationStr(String dateStr) {
		getVo().setDate_of_registration(Formatter.convertToSqlDate(dateStr));
	}
}
