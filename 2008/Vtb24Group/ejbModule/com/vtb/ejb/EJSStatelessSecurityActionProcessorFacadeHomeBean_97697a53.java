package com.vtb.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessSecurityActionProcessorFacadeHomeBean_97697a53
 */
public class EJSStatelessSecurityActionProcessorFacadeHomeBean_97697a53 extends EJSHome {
	static final long serialVersionUID = 61;
	/**
	 * EJSStatelessSecurityActionProcessorFacadeHomeBean_97697a53
	 */
	public EJSStatelessSecurityActionProcessorFacadeHomeBean_97697a53() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 */
	public com.vtb.ejb.SecurityActionProcessorFacade create() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.vtb.ejb.SecurityActionProcessorFacade result = null;
boolean createFailed = false;
try {
	result = (com.vtb.ejb.SecurityActionProcessorFacade) super.createWrapper(null);
}
catch (javax.ejb.CreateException ex) {
	createFailed = true;
	throw ex;
} catch (java.rmi.RemoteException ex) {
	createFailed = true;
	throw ex;
} catch (Throwable ex) {
	createFailed = true;
	throw new CreateFailureException(ex);
} finally {
	if (createFailed) {
		super.createFailure(beanO);
	}
}
return result;	}
	/**
	 * create_Local
	 */
	public com.vtb.ejb.SecurityActionProcessorFacadeLocal create_Local() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.vtb.ejb.SecurityActionProcessorFacadeLocal result = null;
boolean createFailed = false;
boolean preCreateFlag = false;
try {
	result = (com.vtb.ejb.SecurityActionProcessorFacadeLocal) super.createWrapper_Local(null);
}
catch (javax.ejb.CreateException ex) {
	createFailed = true;
	throw ex;
} catch (java.rmi.RemoteException ex) {
	createFailed = true;
	throw ex;
} catch (Throwable ex) {
	createFailed = true;
	throw new CreateFailureException(ex);
} finally {
	if (createFailed) {
		super.createFailure(beanO);
	}
}
return result;	}
}
