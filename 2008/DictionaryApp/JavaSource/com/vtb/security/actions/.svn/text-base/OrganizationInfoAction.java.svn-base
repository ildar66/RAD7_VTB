package com.vtb.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.OrganizationInfoForm;
import com.vtb.value.BeanKeys;

/**
 * @version 1.0
 * @author IShafigullin
 */
public class OrganizationInfoAction extends SecurityAppAction {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ActionErrors errors = new ActionErrors();
		ActionForward forward = new ActionForward(); // return value
		OrganizationInfoForm aForm = (OrganizationInfoForm) form;

		try {
			addOwnershipFormTypeListBean(request);
			addIndustryListBean(request);
			addRegionListBean(request);
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");
			Integer organizationKey = aForm.getVo().getId_contractor().intValue();
			aForm.setVo(processor.findOrganizationByKey(organizationKey));
			// инит. лист адресов для организации:
			ArrayList list = processor.findAddressListByOrganization(organizationKey, "description");
			request.setAttribute(BeanKeys.ORGANIZATION_TO_ADDRESS_LIST, list);
			// инит. лист групп для организации:
			list = processor.findGroupListTO_ByOrganization(organizationKey, "name");
			request.setAttribute(BeanKeys.ORGANIZATION_TO_GROUP_LIST, list);
			// инит. лист управления для организации:
			list = processor.findGovernListByOrganization(organizationKey, "name");
			request.setAttribute(BeanKeys.ORGANIZATION_TO_GOVERN_LIST, list);
			// инит. лист акционеров для организации:
			list = processor.findShareholderListByOrganization(organizationKey, "fio");
			request.setAttribute(BeanKeys.ORGANIZATION_TO_SHAREHOLDER_LIST, list);			
			// инит. лист контактов для организации:
			list = processor.findManagerListByOrganization(organizationKey, "lastName");
			request.setAttribute(BeanKeys.ORGANIZATION_TO_MANAGERS_LIST, list);
			// инит. лист OKVED для организации:
			list = processor.findOkvedListByOrganization(organizationKey, "name");
			request.setAttribute(BeanKeys.ORGANIZATION_TO_OKVED_LIST, list);			
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
}
