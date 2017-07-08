package com.vtb.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalCMPCommissionTypeEJBHome_4217e032
 */
public class EJSLocalCMPCommissionTypeEJBHome_4217e032 extends EJSLocalWrapper implements com.vtb.ejb.CommissionTypeEJBLocalHome, com.vtb.ejb.websphere_deploy.CommissionTypeEJBBeanInternalLocalHome_4217e032 {
	/**
	 * EJSLocalCMPCommissionTypeEJBHome_4217e032
	 */
	public EJSLocalCMPCommissionTypeEJBHome_4217e032() {
		super();	}
	/**
	 * create
	 */
	public com.vtb.ejb.CommissionTypeEJBLocal create(java.lang.Integer id, java.lang.String newName) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.ejb.CommissionTypeEJBLocal _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = id;
				_jacc_parms[1] = newName;
			}
	com.vtb.ejb.EJSCMPCommissionTypeEJBHomeBean_4217e032 _EJS_beanRef = (com.vtb.ejb.EJSCMPCommissionTypeEJBHomeBean_4217e032)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = _EJS_beanRef.create_Local(id, newName);
		}
		catch (javax.ejb.CreateException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
	 * findByPrimaryKey
	 */
	public com.vtb.ejb.CommissionTypeEJBLocal findByPrimaryKey(java.lang.Integer primaryKey) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.ejb.CommissionTypeEJBLocal _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = primaryKey;
			}
	com.vtb.ejb.EJSCMPCommissionTypeEJBHomeBean_4217e032 _EJS_beanRef = (com.vtb.ejb.EJSCMPCommissionTypeEJBHomeBean_4217e032)container.preInvoke(this, 1, _EJS_s, _jacc_parms);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(primaryKey);
		}
		catch (javax.ejb.FinderException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
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
		return _EJS_result;
	}
	/**
	 * remove
	 */
	public void remove(java.lang.Object arg0) throws javax.ejb.RemoveException, javax.ejb.EJBException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = arg0;
			}
	com.vtb.ejb.EJSCMPCommissionTypeEJBHomeBean_4217e032 _EJS_beanRef = (com.vtb.ejb.EJSCMPCommissionTypeEJBHomeBean_4217e032)container.preInvoke(this, 2, _EJS_s, _jacc_parms);
			_EJS_beanRef.remove(arg0);
		}
		catch (javax.ejb.RemoveException ex) {
			_EJS_s.setCheckedException(ex);
			throw ex;
		}
		catch (javax.ejb.EJBException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 2, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
