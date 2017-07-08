package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.OrganizationGroup;
import com.vtb.forms.DialogForm;
import com.vtb.util.Formatter;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>OrganizationGroup - [Группа клиентов]
 * </ul>
 * @version 	1.0
 * @author
 */
public class OrganizationGroupDialogForm extends DialogForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private OrganizationGroup vo = new OrganizationGroup(null);

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
	public OrganizationGroup getVo() {
		return vo;
	}

	/**
	 * @param msUser
	 */
	public void setVo(OrganizationGroup aVO) {
		vo = aVO;
	}

	/**
	 * @param string
	 */
	public void setId(Integer aId) {
		getVo().setId(aId);
	}
}
