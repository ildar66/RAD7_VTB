package com.vtb.dictionary.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import com.vtb.domain.PunitiveMeasure;
import com.vtb.forms.DialogForm;

/**
 * Form bean for a Struts application.
 * Users may access 2 fields on this form:
 * <ul>
 * <li>PunitiveMeasure - [your comment here]
 * </ul>
 * @version 	1.0
 * @author
 */
public class PunitiveMeasureDialogForm extends DialogForm {

	private PunitiveMeasure vo = new PunitiveMeasure(null, "none");

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
	public PunitiveMeasure getVo() {
		return vo;
	}

	/**
	 * @param msUser
	 */
	public void setVo(PunitiveMeasure aVO) {
		vo = aVO;
	}

	/**
	 * @param string
	 */
	public void setId(Integer aId) {
		getVo().setId(aId);
	}

}
