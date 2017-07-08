package com.vtb.dictionary.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.StopFactor;
import com.vtb.forms.DialogForm;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>StopFactor - [your comment here]
 * </ul>
 * @version 	1.0
 * @author ildar
 */
public class StopFactorDialogForm extends DialogForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StopFactor vo = new StopFactor(null, "none");

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
	public StopFactor getVo() {
		return vo;
	}

	/**
	 * @param msUser
	 */
	public void setVo(StopFactor aVO) {
		vo = aVO;
	}

	/**
	 * @param string
	 */
	public void setCode(String aId) {
		getVo().setCode(aId);
	}

}
