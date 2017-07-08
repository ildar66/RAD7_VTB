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
import com.vtb.security.forms.OrganizationToOkvedListForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 1.0
 * @author ildar
 */
public class OrganizationToOkvedListAction extends Action {
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
			OrganizationToOkvedListForm aForm = (OrganizationToOkvedListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");

			// инит. Организацию:
			Integer organizationKey = aForm.getOrganizationID();
			aForm.setOrganizationVO(processor.findOrganizationByKey(organizationKey));

			// processOperation:
			processOperation(errors, request, aForm, processor);
			// инит. лист OKVED для организации:
			//ArrayList list = processor.findOkvedListByOrganization(aForm.getOrganizationID(), aForm.getOrderBy());
			ArrayList list = processor.findOkvedListTO_ByOrganization(organizationKey, aForm.getOrderBy());
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.ORGANIZATION_TO_OKVED_LIST, list);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OrganizationToOkvedsListAction.execute:" + e);
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
	private void processOperation(ActionErrors errors, HttpServletRequest request, OrganizationToOkvedListForm aForm,
			SecurityActionProcessor processor) throws ModelException {
		String operation = aForm.getOperation();
		String organizationKey = aForm.getOrganizationID().toString();
		String okvedSelectedKey = aForm.getSelectedID();
		try {
			if (DELETE_LINK.equalsIgnoreCase(operation)) {
				processor.deleteLinkOkvedToOrganization(okvedSelectedKey, organizationKey);
			} else if (ADD_LINK.equalsIgnoreCase(operation)) {
				processor.addLinkOkvedToOrganization(okvedSelectedKey, organizationKey);
			} else if (ADD_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.addLinkOkvedCrmToOrganization(okvedSelectedKey, organizationKey);
			} else if (DELETE_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.deleteLinkOkvedCrmToOrganization(okvedSelectedKey, organizationKey);
			}
		} catch (MappingException e) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.getMessage()));
			AppService.log(TraceCapable.ERROR_LEVEL,
					"Exception caught in OrganizationToOkvedListAction.processOperation:" + e);
		}
	}
}
