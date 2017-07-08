package com.vtb.security.console.core.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * Form bean for a Struts application.
 * Users may access 3 fields on this form:
 * <ul>
 * <li>password - [your comment here]
 * <li>action - [your comment here]
 * <li>username - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class LogonForm extends ActionForm {
	public final static String ACTION_NONE = "none";
	public final static String ACTION_SECURE = "secure";

	private String password = null;
	private String action = ACTION_NONE;
	private String username = null;

	/**
	 * Get password
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set password
	 * @param <code>String</code>
	 */
	public void setPassword(String p) {
		this.password = p;
	}

	/**
	 * Get action
	 * @return String
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Set action
	 * @param <code>String</code>
	 */
	public void setAction(String a) {
		this.action = a;
	}

	/**
	 * Get username
	 * @return String
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set username
	 * @param <code>String</code>
	 */
	public void setUsername(String u) {
		this.username = u;
	}

	public void reset(ActionMapping mapping, HttpServletRequest request) {

		// Reset values are provided as samples only. Change as appropriate.

		password = null;
		action = null;
		username = null;

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
}
