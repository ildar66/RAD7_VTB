package com.vtb.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.exception.ModelException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.OrganizationToGovernListForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 1.0
 * @author
 */
public class OrganizationToGovernListAction extends Action {
	public final static String ADD_GOVERN = "addGovern";
	public final static String DELETE_GOVERN = "deleteGovern";
	public final static String EDIT_GOVERN = "editGovern";

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		// ActionErrors errors = new ActionErrors();
		try {
			// Look at the ActionForm object
			OrganizationToGovernListForm aForm = (OrganizationToGovernListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");

			// инит. Организацию:
			Integer organizationKey = aForm.getOrganizationID();
			aForm.setOrganizationVO(processor.findOrganizationByKey(organizationKey));

			// инит. лист управления для организации:
			ArrayList list = processor.findGovernListByOrganization(aForm.getOrganizationID(), aForm.getOrderBy());
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.ORGANIZATION_TO_GOVERN_LIST, list);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService
					.log(TraceCapable.ERROR_LEVEL, "Exception caught in OrganizationToGovernsListAction.execute:" + e);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}
}
