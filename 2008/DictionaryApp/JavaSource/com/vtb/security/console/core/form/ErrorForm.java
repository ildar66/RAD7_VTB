package com.vtb.security.console.core.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * Form bean for a Struts application.
 * @version 	1.0
 * @author
 */
public class ErrorForm extends ActionForm {
	private boolean showStackTrace;
	private String stackTrace;
	private String message;
	private int errorCode;
	private String requestUrl;
	

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
	public boolean getShowStackTrace() {
		return showStackTrace;
	}

	/**
	 * @param b
	 */
	public void setShowStackTrace(boolean b) {
		showStackTrace = b;
	}

	/**
	 * @return
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return
	 */
	public String getRequestUrl() {
		return requestUrl;
	}

	/**
	 * @return
	 */
	public String getStackTrace() {
		return stackTrace;
	}

	/**
	 * @param i
	 */
	public void setErrorCode(int i) {
		errorCode = i;
	}

	/**
	 * @param string
	 */
	public void setMessage(String string) {
		message = string;
	}

	/**
	 * @param string
	 */
	public void setRequestUrl(String string) {
		requestUrl = string;
	}

	/**
	 * @param string
	 */
	public void setStackTrace(String string) {
		stackTrace = string;
	}

}
