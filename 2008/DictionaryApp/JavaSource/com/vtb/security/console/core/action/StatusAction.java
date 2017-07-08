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
import com.vtb.security.console.core.bean.StatusBean;
import com.vtb.security.console.core.bean.UserPreferenceBean;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

/**
 * @version 	1.0
 * @author
 */
public class StatusAction extends ConsoleAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value

		try {
			// do something here
			String action = request.getParameter("action");
			AppService.log(TraceCapable.DEBUG_LEVEL, "StatusAction action=" + action);
			StatusBean statusBean = getStatusBean(request);
			if ("Next".equalsIgnoreCase(action)) {
				statusBean.cycle();
			} else if ("Previous".equalsIgnoreCase(action)) {
				statusBean.back();
			}
			// do something here
			String submit2 = request.getParameter("submit2");
			AppService.log(TraceCapable.DEBUG_LEVEL, "StatusAction submit2=" + submit2);
			if ("Apply".equalsIgnoreCase(submit2)) {
				UserPreferenceBean userPref = (UserPreferenceBean) request.getSession().getAttribute(Constants.USER_PREFS);
				String refreshOn = request.getParameter("refreshOn");
				AppService.log(TraceCapable.DEBUG_LEVEL, "StatusAction refreshOn=" + refreshOn);
				userPref.setRefreshOn(refreshOn == null ? false : true);
				String name2 = request.getParameter("name2");
				AppService.log(TraceCapable.DEBUG_LEVEL, "StatusAction name2=" + name2);
				int sec = 60;
				try {
					sec = Integer.valueOf(name2).intValue();
				} catch (NumberFormatException e1) {
					//e1.printStackTrace();
				}
				userPref.setRefreshInSeconds(sec);
				String cycleOn = request.getParameter("cycleOn");
				AppService.log(TraceCapable.DEBUG_LEVEL, "StatusAction cycleOn=" + cycleOn);
				userPref.setCycleOn(cycleOn == null ? false : true);
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
}
