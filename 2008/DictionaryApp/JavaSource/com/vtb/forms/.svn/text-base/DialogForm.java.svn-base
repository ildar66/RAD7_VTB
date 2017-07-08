/*
 * Created on 26.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * @author IShafigullin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class DialogForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 463577255793223968L;

	/**
	 * 
	 */
	public DialogForm() {
		super();
	}

	public static final String ACTION_ADD = "Add";
	public static final String ACTION_EDIT = "Edit";
	public static final String ACTION_VIEW = "View";
	public static final String ACTION_DELETE = "Delete";

	protected boolean flagOperation = false;
	protected String action = null;

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
		 * @return
		 */
	public boolean isFlagOperation() {
		return flagOperation;
	}

	/**
		 * @param b
		 */
	public void setFlagOperation(boolean b) {
		flagOperation = b;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.action.ActionForm#validate(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
	 */
	public ActionErrors validate(ActionMapping arg0, HttpServletRequest arg1) {
		//super.validate(arg0, arg1);
		ActionErrors errors = new ActionErrors();
		if (!ACTION_ADD.equals(getAction()) && !ACTION_EDIT.equals(getAction()) && !ACTION_DELETE.equals(getAction()) && !ACTION_VIEW.equals(getAction())) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", "action = " + getAction() + " не является допустимым! "));
		}
		return errors;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
	 */
	public void reset(ActionMapping arg0, HttpServletRequest arg1) {
		//super.reset(arg0, arg1);
		// Reset values are provided as samples only. Change as appropriate.
		action = null;
		flagOperation = false;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		if(ACTION_ADD.equalsIgnoreCase(action)){
			return "добавление записи";
		}else if (ACTION_DELETE.equalsIgnoreCase(action)) {
			return "удаление записи";
		}else if (ACTION_EDIT.equalsIgnoreCase(action)) {
			return "редактирование записи";
		}else if (ACTION_VIEW.equalsIgnoreCase(action)) {
			return "просмотр записи";			
		}
		return action;
	}

}
