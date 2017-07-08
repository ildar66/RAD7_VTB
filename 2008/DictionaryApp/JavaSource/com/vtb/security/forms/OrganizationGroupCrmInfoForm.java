package com.vtb.security.forms;

import org.apache.struts.action.ActionForm;

import com.vtb.domain.OrganizationGroup;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>OrganizationGroupCrmInfoForm - [your comment here]
 * </ul>
 * @version 	1.0
 * @author IShafigullin
 */
public class OrganizationGroupCrmInfoForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private OrganizationGroup vo = new OrganizationGroup(null, "", "");

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
	public void setIdCRM(String idCRM) {
		getVo().setCrmID(idCRM);
	}	
}
