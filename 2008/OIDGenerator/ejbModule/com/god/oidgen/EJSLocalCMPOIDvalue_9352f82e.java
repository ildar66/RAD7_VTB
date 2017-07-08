package com.god.oidgen;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPOIDvalue_9352f82e
 */
public class EJSLocalCMPOIDvalue_9352f82e extends EJSLocalWrapper implements com.god.oidgen.OIDvalueLocal {
	/**
	 * EJSLocalCMPOIDvalue_9352f82e
	 */
	public EJSLocalCMPOIDvalue_9352f82e() {
		super();	}
	/**
	 * increment
	 */
	public int increment() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		int _EJS_result = 0;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[0];
			}
	com.god.oidgen.OIDvalueBean beanRef = (com.god.oidgen.OIDvalueBean)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.increment();
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 0, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return _EJS_result;
	}
}
