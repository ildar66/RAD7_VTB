package com.vtb.ejb;

/**
 * Home interface for Enterprise Bean: DictionaryActionProcessorFacade
 */
public interface DictionaryActionProcessorFacadeHome extends javax.ejb.EJBHome {

	/**
	 * Creates a default instance of Session Bean: DictionaryActionProcessorFacade
	 */
	public com.vtb.ejb.DictionaryActionProcessorFacade create()
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;
}
