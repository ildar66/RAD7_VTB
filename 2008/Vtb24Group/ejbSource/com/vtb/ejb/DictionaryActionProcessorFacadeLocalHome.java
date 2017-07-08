package com.vtb.ejb;

/**
 * Local Home interface for Enterprise Bean: DictionaryActionProcessorFacade
 */
public interface DictionaryActionProcessorFacadeLocalHome
	extends
		javax.ejb.EJBLocalHome {

	/**
	 * Creates a default instance of Session Bean: DictionaryActionProcessorFacade
	 */
	public com.vtb.ejb.DictionaryActionProcessorFacadeLocal create()
		throws javax.ejb.CreateException;
}
