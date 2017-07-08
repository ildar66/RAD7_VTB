package com.vtb.dictionary.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.vtb.dictionary.forms.StopFactorListForm;
import com.vtb.exception.ModelException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.DictionaryActionProcessor;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;
import com.vtb.value.BeanKeys;

/**
 * @version 	1.0
 * @author
 */
public class StopFactorListAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		try {
			// Look at the ActionForm object
			StopFactorListForm aForm = (StopFactorListForm) form;
			// Get actionprocess (model) and delegate
			DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory.getActionProcessor("Dictionary");
			ArrayList list = processor.findListStopFactor(aForm.getSearchStr(), aForm.getOrderBy());

			// Add ValueBean to request context and forward response
			request.setAttribute(BeanKeys.STOPFACTOR_LIST, list); 
			forward = mapping.findForward("success");
		} catch (ModelException e) {
			AppService.log(TraceCapable.ERROR_LEVEL, "Exception caught in StopFactorListAction.execute:" + e);
		}
		if (forward == null) {
			forward = mapping.findForward("error");
		}
		return forward;
	}

}
