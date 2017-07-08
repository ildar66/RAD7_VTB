package com.vtb.security.console.core.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.security.console.core.Constants;
import com.vtb.security.console.core.User;
import com.vtb.security.console.core.bean.UserPreferenceBean;
import com.vtb.security.console.core.form.LogonForm;

/**
 * @version 1.0
 * @author
 */
public class LogonAction extends ConsoleAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		try {
			// do something here
			LogonForm logonForm = (LogonForm) form;
			String action = logonForm.getAction();
			if (action.equalsIgnoreCase(LogonForm.ACTION_SECURE)) {
				createUser(request);
				createUserPreference(request);
				createMenuBarItems(request);
				createNavigatorList(request);
			} else {
				String userName = logonForm.getUsername();
				request.getSession().setAttribute(Constants.USER_KEY, new User(userName, userName));
				request.getSession().setAttribute(Constants.USER_PREFS, new UserPreferenceBean(userName));
				createMenuBarItems(request);
				createNavigatorList(request);
			}

		} catch (Exception e) {

			// Report the error using the appropriate name and ID.
			e.printStackTrace();
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt",
					e.toString()));

		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.isEmpty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as
			// desired)
			forward = mapping.findForward("logonError");

		} else {

			// Forward control to the appropriate 'success' URI (change name as
			// desired)
			forward = mapping.findForward("success");

		}

		// Finish with
		return (forward);

	}

}
