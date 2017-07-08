package com.god.oidgen;

import com.ibm.ejs.container.*;

/**
 * EJSStatelessOIDGeneratorSessionHomeBean_299bef64
 */
public class EJSStatelessOIDGeneratorSessionHomeBean_299bef64 extends EJSHome {
	static final long serialVersionUID = 61;
	/**
	 * EJSStatelessOIDGeneratorSessionHomeBean_299bef64
	 */
	public EJSStatelessOIDGeneratorSessionHomeBean_299bef64() throws java.rmi.RemoteException {
		super();	}
	/**
	 * create_Local
	 */
	public com.god.oidgen.OIDGeneratorSessionLocal create_Local() throws javax.ejb.CreateException, java.rmi.RemoteException {
BeanO beanO = null;
com.god.oidgen.OIDGeneratorSessionLocal result = null;
boolean createFailed = false;
boolean preCreateFlag = false;
try {
	result = (com.god.oidgen.OIDGeneratorSessionLocal) super.createWrapper_Local(null);
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
