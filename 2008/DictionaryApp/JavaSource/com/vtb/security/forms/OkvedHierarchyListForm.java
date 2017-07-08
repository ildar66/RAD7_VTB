package com.vtb.security.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.Okved;

/**
 * Form bean for a Struts application(ОКВЭД компании).
 * @version 	1.0
 * @author
 */
public class OkvedHierarchyListForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String searchStr = new String("%");
	private String orderBy = "name";
	private String activeState = "Y";
	private Okved parent = new Okved(null);
	
	public String getActiveState() {
		return activeState;
	}

	public void setActiveState(String activeState) {
		this.activeState = activeState;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// Reset field values here.
		parent = new Okved(null);
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

	public Okved getParent() {
		return parent;
	}

	public void setParent(Okved parent) {
		this.parent = parent;
	}

	public Integer getParentID() {
		return getParent().getId();
	}

	public void setParentID(Integer parentID) {
		getParent().setId(parentID);
	}

}
