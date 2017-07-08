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
import com.vtb.security.forms.OrganizationToAddressListForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 1.0
 * @author
 */
public class OrganizationToAddressListAction extends Action {
	public final static String ADD_ADDRESS = "addAddress";
	public final static String DELETE_ADDRESS = "deleteAddress";
	public final static String EDIT_ADDRESS = "editAddress";

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		//ActionErrors errors = new ActionErrors();
		try {
			// Look at the ActionForm object
			OrganizationToAddressListForm aForm = (OrganizationToAddressListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
					.getActionProcessor("Security");

			// инит. Организацию:
			Integer organizationKey = aForm.getOrganizationID();
			aForm.setOrganizationVO(processor.findOrganizationByKey(organizationKey));

			// processOperation:
			//processOperation(errors, request, aForm, processor);
			// инит. лист адресов для организации:
			ArrayList list = processor.findAddressListByOrganization(aForm.getOrganizationID(), aForm.getOrderBy());
			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.ORGANIZATION_TO_ADDRESS_LIST, list);

			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OrganizationToAddresssListAction.execute:"
					+ e);
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
	 * 
	 * private void processOperation(ActionErrors errors, HttpServletRequest
	 * request, OrganizationToAddressListForm aForm, SecurityActionProcessor
	 * processor) throws ModelException { String operation =
	 * aForm.getOperation(); Integer organizationKey =
	 * aForm.getOrganizationID(); String addressKey = aForm.getSelectedID(); try {
	 * if (DELETE_ADDRESS.equalsIgnoreCase(operation)) {
	 * processor.deleteAddress(organizationKey, addressKey); } else if
	 * (ADD_ADDRESS.equalsIgnoreCase(operation)) {
	 * processor.addAddress(organizationKey, addressKey); } else if
	 * (EDIT_ADDRESS.equalsIgnoreCase(operation)) {
	 * processor.updateAddress(organizationKey, addressKey); } } catch
	 * (MappingException e) { errors.add(ActionErrors.GLOBAL_ERROR, new
	 * ActionError("error.txt", e.getMessage()));
	 * AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in
	 * OrganizationToAddressListAction.processOperation:" + e); } }
	 */
}
