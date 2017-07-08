package com.vtb.security.console.core.action;

import java.util.ArrayList;

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
import com.vtb.security.console.core.item.PreferenceItem;

/**
 * @version 	1.0
 * @author
 */
public class MenuBarAction extends ConsoleAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		String forwardName = request.getParameter("forwardName");
		try {

			// do something here
			if ("preferences".equals(forwardName)) {
				createPreferences(request);
			} else if ("toggleDescriptions".equals(forwardName)) {
				Boolean descriptionsOn = (Boolean) request.getSession().getAttribute("descriptionsOn");
				//System.out.println("descriptionsOn="+descriptionsOn);
				descriptionsOn = new Boolean(!descriptionsOn.booleanValue());
				request.getSession().setAttribute("descriptionsOn", descriptionsOn);
				UserPreferenceBean uBean = (UserPreferenceBean) request.getSession().getAttribute(Constants.USER_PREFS);
				uBean.setDescriptionsShow(descriptionsOn.booleanValue());
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
			forward = mapping.findForward(forwardName);

		}

		// Finish with
		return (forward);

	}
}
