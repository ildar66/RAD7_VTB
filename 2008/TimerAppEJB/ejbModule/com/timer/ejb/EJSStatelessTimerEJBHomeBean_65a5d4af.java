package com.timer.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessTimerEJBHomeBean_65a5d4af
 */
public class EJSStatelessTimerEJBHomeBean_65a5d4af extends EJSHome {
	static final long serialVersionUID = 61;
	/**
	 * EJSStatelessTimerEJBHomeBean_65a5d4af
	 */
	public EJSStatelessTimerEJBHomeBean_65a5d4af() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create
	 */
	public com.timer.ejb.TimerEJB create() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.timer.ejb.TimerEJB result = null;
boolean createFailed = false;
try {
	result = (com.timer.ejb.TimerEJB) super.createWrapper(null);
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
