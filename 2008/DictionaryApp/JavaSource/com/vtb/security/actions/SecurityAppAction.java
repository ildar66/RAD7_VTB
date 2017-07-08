/**
 * 
 */
package com.vtb.security.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;

import com.vtb.exception.ModelException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.DictionaryActionProcessor;
import com.vtb.model.SecurityActionProcessor;
import com.vtb.value.BeanKeys;

/**
 * @author IShafigullin
 * 
 */
public class SecurityAppAction extends Action {

	/**
	 * 
	 */
	public SecurityAppAction() {
		super();
	}

	/**
	 * 
	 * @param request
	 */
	protected void addOwnershipFormTypeListBean(HttpServletRequest request) {

		HttpSession session = request.getSession();
		if (session.getAttribute(BeanKeys.OWNERSHIP_FORM_TYPE_LIST) != null) {
			return;
		}
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
				.getActionProcessor("Security");
		ArrayList ownershipFormTypeList = null;
		try {
			ownershipFormTypeList = processor.findOwnershipFormTypeList("%", "name");
		} catch (ModelException mme) {
			mme.printStackTrace();
		}

		// Add ValueBean to request context and forward response
		// request.setAttribute(BeanKeys.COMPANIES, companyes);

		session.setAttribute(BeanKeys.OWNERSHIP_FORM_TYPE_LIST, ownershipFormTypeList);
	}
	
	/**
	 * 
	 * @param request
	 */
	protected void addProcessTypeListBean(HttpServletRequest request) {

		HttpSession session = request.getSession();
		if (session.getAttribute(BeanKeys.PROCESS_TYPE_LIST) != null) {
			return;
		}
		SecurityActionProcessor processor = (SecurityActionProcessor) ActionProcessorFactory
				.getActionProcessor("Security");
		ArrayList returnList = null;
		try {
			returnList = processor.findProcessTypeList("%", "DESCRIPTION_PROCESS");
		} catch (ModelException mme) {
			mme.printStackTrace();
		}

		// Add ValueBean to request context and forward response
		// request.setAttribute(BeanKeys.COMPANIES, companyes);

		session.setAttribute(BeanKeys.PROCESS_TYPE_LIST, returnList);
	}	
	
	/**
	 * 
	 * @param request
	 */
	protected void addRegionListBean(HttpServletRequest request) {

		HttpSession session = request.getSession();
		if (session.getAttribute(BeanKeys.REGION_LIST) != null) {
			return;
		}
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
		ArrayList regionList = null;
		try {
			regionList = processor.findRegions("%", "name");
		} catch (ModelException mme) {
			mme.printStackTrace();
		}

		// Add ValueBean to request context and forward response
		// request.setAttribute(BeanKeys.COMPANIES, companyes);

		session.setAttribute(BeanKeys.REGION_LIST, regionList);
	}
	
	/**
	 * 
	 * @param request
	 */
	protected void addIndustryListBean(HttpServletRequest request) {

		HttpSession session = request.getSession();
		if (session.getAttribute(BeanKeys.INDUSTRY_LIST) != null) {
			return;
		}
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
		ArrayList aList = null;
		try {
			aList = processor.findIndustries("%", "name");
		} catch (ModelException mme) {
			mme.printStackTrace();
		}

		// Add ValueBean to request context and forward response
		// request.setAttribute(BeanKeys.COMPANIES, companyes);

		session.setAttribute(BeanKeys.INDUSTRY_LIST, aList);
	}	
}
