package com.god.oidgen;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessOIDGeneratorSession_299bef64
 */
public class EJSLocalStatelessOIDGeneratorSession_299bef64 extends EJSLocalWrapper implements com.god.oidgen.OIDGeneratorSessionLocal {
	/**
	 * EJSLocalStatelessOIDGeneratorSession_299bef64
	 */
	public EJSLocalStatelessOIDGeneratorSession_299bef64() {
		super();	}
	/**
	 * getNextOID
	 */
	public int getNextOID(java.lang.String type) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		int _EJS_result = 0;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = type;
			}
	com.god.oidgen.OIDGeneratorSessionBean beanRef = (com.god.oidgen.OIDGeneratorSessionBean)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.getNextOID(type);
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
