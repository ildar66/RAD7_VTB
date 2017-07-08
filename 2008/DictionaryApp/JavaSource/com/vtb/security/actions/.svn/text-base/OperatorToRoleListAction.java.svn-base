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
import com.vtb.exception.NoSuchOperatorException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.security.forms.OperatorToRoleListForm;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class OperatorToRoleListAction extends SecurityAppAction {
	public final static String ADD_LINK = "addLink";
	public final static String DELETE_LINK = "deleteLink";
	public final static String ACTIVE_LINK = "activeLink";
	public final static String PASSIVE_LINK = "passiveLink";

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		ActionErrors errors = new ActionErrors();
		try {
			addProcessTypeListBean(request);
			// Look at the ActionForm object
			OperatorToRoleListForm aForm = (OperatorToRoleListForm) form;
			// Get actionprocess (model) and delegate
			SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory.getActionProcessor("Security");

			//инит. оператор:
			Integer operatorKey = aForm.getId();
			aForm.setOperatorVO(processor.findOperatorByKey(operatorKey));
			//инит. Филиал:
			Integer departmentKey = aForm.getOperatorVO().getDepartmentID();
			if (departmentKey != null) {
				aForm.setDepartmentVO(processor.findDepartmentByKey(departmentKey));
			}			
			//processOperation:
			processOperation(errors, request, aForm, processor);
			//инит. лист ролей для оператора:
			initList(request, aForm, processor);

			forward = mapping.findForward("success");
		} catch (NoSuchOperatorException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OperatorToRoleListAction.execute:" + e);
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OperatorToRoleListAction.execute:" + e);
		}
		// If a message is required, save the specified key(s)
		// into the request for use by the <struts:errors> tag.
		if (!errors.isEmpty()) {
			saveErrors(request, errors);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}

	/**
	 * инит. Операторов
	 * @param request
	 * @param aForm
	 * @param processor
	 * @param encloserKey
	 * @throws ModelException
	 */
	private void initList(HttpServletRequest request, OperatorToRoleListForm aForm, SecurityActionProcessor processor) throws ModelException {
		//String operatorKey = aForm.getId().toString();//TODO
		String operatorKey = aForm.getOperatorVO().getLogin();
		ArrayList list = processor.findOperatorToRoleList(operatorKey, aForm.getOrderBy());
		request.setAttribute(BeanKeys.OPERATOR_TO_ROLE_LIST, list);
		//list = processor.findOperatorToRoleAccessList(operatorKey, aForm.getOrderBy());
		list = processor.findOperatorToRoleAccessList(operatorKey, aForm.getProcessID() ,aForm.getOrderBy());
		request.setAttribute(BeanKeys.OPERATOR_TO_ROLE_ACCESS_LIST, list);
	}

	/**
	 * 
	 * @param errors
	 * @param request
	 * @param aForm
	 * @param processor
	 * @throws ModelException
	 */
	private void processOperation(ActionErrors errors, HttpServletRequest request, OperatorToRoleListForm aForm, SecurityActionProcessor processor) throws ModelException {
		String operation = aForm.getOperation();
		//String operatorKey = aForm.getId().toString();//TODO
		String operatorKey = aForm.getOperatorVO().getLogin();
		String roleKey = aForm.getSelectedID();
		try {
			if (DELETE_LINK.equalsIgnoreCase(operation)) {
				processor.deleteLinkOperatorToRole(operatorKey, roleKey);
			} else if (ADD_LINK.equalsIgnoreCase(operation)) {
				processor.addLinkOperatorToRole(operatorKey, roleKey);
			} else if (ACTIVE_LINK.equalsIgnoreCase(operation)) {
				processor.setStatusLinkOperatorToRole(operatorKey, roleKey, "Y");
			} else if (PASSIVE_LINK.equalsIgnoreCase(operation)) {
				processor.setStatusLinkOperatorToRole(operatorKey, roleKey, "N");
			}
		} catch (MappingException e) {
			errors.add(ActionErrors.GLOBAL_ERROR, new ActionError("error.txt", e.getMessage()));
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in OperatorToRoleListAction.processOperation:" + e);
		}
	}
}
