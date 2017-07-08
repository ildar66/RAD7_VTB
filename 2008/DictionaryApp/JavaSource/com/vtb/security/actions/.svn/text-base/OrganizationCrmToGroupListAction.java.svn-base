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
import com.vtb.security.forms.OrganizationCrmToGroupListForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 1.0
 * @author ildar
 */
public class OrganizationCrmToGroupListAction extends Action {
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
			OrganizationCrmToGroupListForm aForm = (OrganizationCrmToGroupListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");

			// инит. Организацию CRM:
			String orgCrmKey = aForm.getOrgCrmID();
			aForm.setOrganizationCrmVO(processor.findOrganizationByCrmKey(orgCrmKey));

			// processOperation:
			processOperation(errors, request, aForm, processor);
			// инит. лист групп для организации:
			ArrayList list = processor.findGroupListTO_ByOrganizationCRM(orgCrmKey, aForm.getOrderBy());
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.ORGANIZATION_TO_GROUP_LIST, list);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OrganizationCrmToGroupsListAction.execute:" + e);
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
	private void processOperation(ActionErrors errors, HttpServletRequest request, OrganizationCrmToGroupListForm aForm,
			SecurityActionProcessor processor) throws ModelException {
		String operation = aForm.getOperation();
		String orgCrmKey = aForm.getOrgCrmID();
		String selectedGroupKey = aForm.getSelectedID();
		try {
			if (DELETE_LINK.equalsIgnoreCase(operation)) {
				processor.deleteLinkGroupToOrganizationCRM(selectedGroupKey, orgCrmKey);
			} else if (ADD_LINK.equalsIgnoreCase(operation)) {
				processor.addLinkGroupToOrganizationCRM(selectedGroupKey, orgCrmKey);
			} else if (ADD_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.addLinkGroupCrmToOrganizationCRM(selectedGroupKey, orgCrmKey);
			} else if (DELETE_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.deleteLinkGroupCrmToOrganizationCRM(selectedGroupKey, orgCrmKey);
			}
		} catch (MappingException e) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.getMessage()));
			AppService.log(TraceCapable.ERROR_LEVEL,
					"Exception caught in OrganizationCrmToGroupListAction.processOperation:" + e);
		}
	}
}
