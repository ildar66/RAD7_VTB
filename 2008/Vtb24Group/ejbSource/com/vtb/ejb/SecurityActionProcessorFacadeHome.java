package com.vtb.ejb;

/**
 * Home interface for Enterprise Bean: SecurityActionProcessorFacade
 */
public interface SecurityActionProcessorFacadeHome extends javax.ejb.EJBHome {

	/**
	 * Creates a default instance of Session Bean: SecurityActionProcessorFacade
	 */
	public com.vtb.ejb.SecurityActionProcessorFacade create()
		throws javax.ejb.CreateException,
		java.rmi.RemoteException;
}
