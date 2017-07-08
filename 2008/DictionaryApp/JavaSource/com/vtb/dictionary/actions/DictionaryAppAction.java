/**
 * 
 */
package com.vtb.dictionary.actions;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;

import com.vtb.exception.ModelException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.DictionaryActionProcessor;
import com.vtb.value.BeanKeys;

/**
 * @author IShafigullin
 * 
 */
public class DictionaryAppAction extends Action {

	/**
	 * 
	 */
	public DictionaryAppAction() {
		super();
	}

	/**
	 * 
	 * @param request
	 */
	protected void addDocumentGroupBean(HttpServletRequest request) {

		HttpSession session = request.getSession();
		if (session.getAttribute(BeanKeys.DOCUMENT_GROUP_LIST) != null) {
			return;
		}
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
		ArrayList documentGroupList = null;
		try {
			documentGroupList = processor.findDocumentGroupList("%", "name");
		} catch (ModelException mme) {
			mme.printStackTrace();
		}

		// Add ValueBean to request context and forward response
		// request.setAttribute(BeanKeys.COMPANIES, companyes);

		session.setAttribute(BeanKeys.DOCUMENT_GROUP_LIST, documentGroupList);
	}
}
