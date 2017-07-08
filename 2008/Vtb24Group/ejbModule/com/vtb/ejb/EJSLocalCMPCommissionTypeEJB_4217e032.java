package com.vtb.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPCommissionTypeEJB_4217e032
 */
public class EJSLocalCMPCommissionTypeEJB_4217e032 extends EJSLocalWrapper implements com.vtb.ejb.CommissionTypeEJBLocal {
	/**
	 * EJSLocalCMPCommissionTypeEJB_4217e032
	 */
	public EJSLocalCMPCommissionTypeEJB_4217e032() {
		super();	}
	/**
	 * getName
	 */
	public java.lang.String getName() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.lang.String _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[0];
			}
	com.vtb.ejb.CommissionTypeEJBBean beanRef = (com.vtb.ejb.CommissionTypeEJBBean)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.getName();
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
	/**
	 * setName
	 */
	public void setName(java.lang.String newName) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = newName;
			}
	com.vtb.ejb.CommissionTypeEJBBean beanRef = (com.vtb.ejb.CommissionTypeEJBBean)container.preInvoke(this, 1, _EJS_s, _jacc_parms);
			beanRef.setName(newName);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 1, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
