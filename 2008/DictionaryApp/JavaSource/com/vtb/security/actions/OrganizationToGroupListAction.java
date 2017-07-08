package com.vtb.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.exception.MappingException;
import com.vtb.exception.ModelException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.OrganizationToGroupListForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 1.0
 * @author ildar
 */
public class OrganizationToGroupListAction extends Action {
	public final static String ADD_LINK = "addLink";
	public final static String DELETE_LINK = "deleteLink";
	public final static String ADD_LINK_CRM = "addLinkCRM";
	public final static String DELETE_LINK_CRM = "deleteLinkCRM";

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		ActionErrors errors = new ActionErrors();
		try {
			// Look at the ActionForm object
			OrganizationToGroupListForm aForm = (OrganizationToGroupListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");

			// инит. Организацию:
			Integer organizationKey = aForm.getOrganizationID();
			aForm.setOrganizationVO(processor.findOrganizationByKey(organizationKey));

			// processOperation:
			processOperation(errors, request, aForm, processor);
			// инит. лист групп для организации:
			//ArrayList list = processor.findGroupListByOrganization(aForm.getOrganizationID(), aForm.getOrderBy());
			ArrayList list = processor.findGroupListTO_ByOrganization(aForm.getOrganizationID(), aForm.getOrderBy());
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.ORGANIZATION_TO_GROUP_LIST, list);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OrganizationToGroupsListAction.execute:" + e);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}

	/**
	 * 
	 * @param errors
	 * @param request
	 * @param aForm
	 * @param processor
	 * @throws ModelException
	 */
	private void processOperation(ActionErrors errors, HttpServletRequest request, OrganizationToGroupListForm aForm,
			SecurityActionProcessor processor) throws ModelException {
		String operation = aForm.getOperation();
		String organizationKey = aForm.getOrganizationID().toString();
		String selectedGroupKey = aForm.getSelectedID();
		try {
			if (DELETE_LINK.equalsIgnoreCase(operation)) {
				processor.deleteLinkGroupToOrganization(selectedGroupKey, organizationKey);
			} else if (ADD_LINK.equalsIgnoreCase(operation)) {
				processor.addLinkGroupToOrganization(selectedGroupKey, organizationKey);
			} else if (ADD_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.addLinkGroupCrmToOrganization(selectedGroupKey, organizationKey);
			} else if (DELETE_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.deleteLinkGroupCrmToOrganization(selectedGroupKey, organizationKey);
			}
		} catch (MappingException e) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.getMessage()));
			AppService.log(TraceCapable.ERROR_LEVEL,
					"Exception caught in OrganizationToGroupListAction.processOperation:" + e);
		}
	}
}
