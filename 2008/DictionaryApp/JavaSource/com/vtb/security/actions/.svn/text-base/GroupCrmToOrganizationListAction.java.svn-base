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
import com.vtb.security.forms.GroupCrmToOrganizationListForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 1.0
 * @author
 */
public class GroupCrmToOrganizationListAction extends Action {
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
			GroupCrmToOrganizationListForm aForm = (GroupCrmToOrganizationListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");

			// инит. CRM Группу клиентов:
			String groupCrmKey = aForm.getGroupCrmID();
			aForm.setGroupCrmVO(processor.findOrganizationGroupByCrmKey(groupCrmKey));
			
			//processOperation:
			processOperation(errors, request, aForm, processor);			
			//инит. лист организаций для CRM группы:
			ArrayList list = processor.findOrganizationListTO_ByGroupCRM(aForm.getGroupCrmID(), aForm.getOrderBy());
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.GROUP_TO_ORGANIZATION_LIST, list);
			
			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in GroupCrmToOrganizationsListAction.execute:" + e);
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
	private void processOperation(ActionErrors errors, HttpServletRequest request, GroupCrmToOrganizationListForm aForm, SecurityActionProcessor processor) throws ModelException {
		String operation = aForm.getOperation();
		String groupCrmKey = aForm.getGroupCrmID();
		String selectedKey = aForm.getSelectedID();
		try {
			if (DELETE_LINK.equalsIgnoreCase(operation)) {
				processor.deleteLinkGroupCrmToOrganization(groupCrmKey, selectedKey);
			} else if (ADD_LINK.equalsIgnoreCase(operation)) {
				processor.addLinkGroupCrmToOrganization(groupCrmKey, selectedKey);
			} else if (ADD_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.addLinkGroupCrmToOrganizationCRM(groupCrmKey, selectedKey);
			} else if (DELETE_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.deleteLinkGroupCrmToOrganizationCRM(groupCrmKey, selectedKey);
			}
		} catch (MappingException e) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.getMessage()));
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in GroupCrmToOrganizationListAction.processOperation:" + e);
		}
	}
}
