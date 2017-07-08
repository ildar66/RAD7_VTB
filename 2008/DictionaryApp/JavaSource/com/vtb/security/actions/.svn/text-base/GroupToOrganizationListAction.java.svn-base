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
import com.vtb.security.forms.GroupToOrganizationListForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 1.0
 * @author
 */
public class GroupToOrganizationListAction extends Action {
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
			GroupToOrganizationListForm aForm = (GroupToOrganizationListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");

			// инит. Группу клиентов:
			Integer groupKey = aForm.getGroupID();
			aForm.setGroupVO(processor.findOrganizationGroupByKey(groupKey));
			
			//processOperation:
			processOperation(errors, request, aForm, processor);			
			//инит. лист организаций для группы:
			//ArrayList list = processor.findOrganizationListByGroup(aForm.getGroupID(), aForm.getOrderBy());
			ArrayList list = processor.findOrganizationListTO_ByGroup(aForm.getGroupID(), aForm.getOrderBy());
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.GROUP_TO_ORGANIZATION_LIST, list);
			
			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in GroupToOrganizationsListAction.execute:" + e);
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
	private void processOperation(ActionErrors errors, HttpServletRequest request, GroupToOrganizationListForm aForm, SecurityActionProcessor processor) throws ModelException {
		String operation = aForm.getOperation();
		String groupKey = aForm.getGroupID().toString();
		String selectedKey = aForm.getSelectedID();
		try {
			if (DELETE_LINK.equalsIgnoreCase(operation)) {
				processor.deleteLinkGroupToOrganization(groupKey, selectedKey);
			} else if (ADD_LINK.equalsIgnoreCase(operation)) {
				processor.addLinkGroupToOrganization(groupKey, selectedKey);
			} else if (ADD_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.addLinkGroupToOrganizationCRM(groupKey, selectedKey);
			} else if (DELETE_LINK_CRM.equalsIgnoreCase(operation)) {
				processor.deleteLinkGroupToOrganizationCRM(groupKey, selectedKey);
			}
		} catch (MappingException e) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.getMessage()));
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in GroupToOrganizationListAction.processOperation:" + e);
		}
	}
}
