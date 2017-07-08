/*
 * Created on 17.08.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.security.console.core.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.security.console.core.Constants;
import com.vtb.security.console.core.bean.UserPreferenceBean;
import com.vtb.security.console.core.form.PreferencesForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class PreferenceAction extends Action {

	/**
	 * 
	 */
	public PreferenceAction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value

		try {
			// do something here
			PreferencesForm logonForm = (PreferencesForm) form;
			String submit2 = logonForm.getSubmit2();
			AppService.log(TraceCapable.DEBUG_LEVEL, "PreferenceAction submit2=" + submit2);
			if ("Apply".equalsIgnoreCase(submit2)) {
				UserPreferenceBean userPref = (UserPreferenceBean) request.getSession().getAttribute(Constants.USER_PREFS);
				String bannerShow = request.getParameter("checkbox1");
				AppService.log(TraceCapable.DEBUG_LEVEL, "PreferenceAction bannerShow=" + bannerShow);
				userPref.setBannerShow(bannerShow == null ? false : true);
				String navigatorShow = request.getParameter("checkbox2");
				AppService.log(TraceCapable.DEBUG_LEVEL, "PreferenceAction navigatorShow=" + navigatorShow);
				userPref.setNavigatorShow(navigatorShow == null ? false : true);
			}			
		} catch (Exception e) {
			// Report the error using the appropriate name and ID.
			e.printStackTrace();
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.toString()));
		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.isEmpty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as desired)
			forward = mapping.findForward("error");

		} else {

			// Forward control to the appropriate 'success' URI (change name as desired)
			forward = mapping.findForward("success");

		}

		// Finish with
		return (forward);

	}
	/**
	 * 
	 * @param arg1
	 * @param arg2
	 * @return
	 */
	private boolean verify(String arg1, int arg2) {
		return false;
	}

	/**
	 * 
	 * @param arg
	 * @return
	 */
	private int getDataType(String arg) {
		return 0;
	}

}
