package com.vtb.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessDictionaryActionProcessorFacadeHomeBean_6a25d1ca
 */
public class EJSStatelessDictionaryActionProcessorFacadeHomeBean_6a25d1ca extends EJSHome {
	static final long serialVersionUID = 61;
	/**
	 * EJSStatelessDictionaryActionProcessorFacadeHomeBean_6a25d1ca
	 */
	public EJSStatelessDictionaryActionProcessorFacadeHomeBean_6a25d1ca() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 */
	public com.vtb.ejb.DictionaryActionProcessorFacade create() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.vtb.ejb.DictionaryActionProcessorFacade result = null;
boolean createFailed = false;
try {
	result = (com.vtb.ejb.DictionaryActionProcessorFacade) super.createWrapper(null);
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
	public com.vtb.ejb.DictionaryActionProcessorFacadeLocal create_Local() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.vtb.ejb.DictionaryActionProcessorFacadeLocal result = null;
boolean createFailed = false;
boolean preCreateFlag = false;
try {
	result = (com.vtb.ejb.DictionaryActionProcessorFacadeLocal) super.createWrapper_Local(null);
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
