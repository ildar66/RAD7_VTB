package com.vtb.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.exception.ModelException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.OrganizationCrmInfoForm;
import com.vtb.value.BeanKeys;

/**
 * @version 1.0
 * @author IShafigullin
 */
public class OrganizationCrmInfoAction extends SecurityAppAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		OrganizationCrmInfoForm aForm = (OrganizationCrmInfoForm) form;

		try {
			addOwnershipFormTypeListBean(request);
			addIndustryListBean(request);
			addRegionListBean(request);
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");
			String idCRM = aForm.getVo().getAccountid();
			aForm.setVo(processor.findOrganizationByCrmKey(idCRM));
			initListForCrmOrganization(idCRM, request, processor);			
		} catch (Exception e) {
			// Report the error using the appropriate name and ID.
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.toString()));
		}

		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.

		if (!errors.isEmpty()) {
			saveErrors(request, errors);

			// Forward control to the appropriate 'failure' URI (change name as
			// desired)
			forward = mapping.findForward("error");

		} else {

			// Forward control to the appropriate 'success' URI (change name as
			// desired)
			forward = mapping.findForward("success");

		}

		// Finish with
		return (forward);

	}

	/**
	 * @param request
	 * @param processor
	 * @throws ModelException
	 */
	private void initListForCrmOrganization(String orgCrmKey, HttpServletRequest request, SecurityActionProcessor processor) throws ModelException {
		// инит. лист групп для организации:
		ArrayList list = processor.findGroupListTO_ByOrganizationCRM(orgCrmKey, "name");
		request.setAttribute(BeanKeys.ORGANIZATION_TO_GROUP_LIST, list);

	}
}
