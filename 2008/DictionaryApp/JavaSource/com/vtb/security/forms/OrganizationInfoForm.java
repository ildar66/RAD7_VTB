package com.vtb.security.forms;

import org.apache.struts.action.ActionForm;

import com.vtb.domain.Organization;
import com.vtb.util.Formatter;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>OrganizationInfoForm - [your comment here]
 * </ul>
 * @version 	1.0
 * @author IShafigullin
 */
public class OrganizationInfoForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private Organization vo = new Organization(null, "", "");

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
	public void setId(Long aId) {
		getVo().setId_contractor(aId);
	}
	
	/**
	 * @return
	 */
	public String getDateOfRegistrationStr() {
		return Formatter.sqlDateFormat(getVo().getDate_of_registration());
	}	
}
