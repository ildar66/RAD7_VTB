package com.vtb.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessDictionaryActionProcessorFacadeHome_6a25d1ca
 */
public class EJSLocalStatelessDictionaryActionProcessorFacadeHome_6a25d1ca extends EJSLocalWrapper implements com.vtb.ejb.DictionaryActionProcessorFacadeLocalHome {
	/**
	 * EJSLocalStatelessDictionaryActionProcessorFacadeHome_6a25d1ca
	 */
	public EJSLocalStatelessDictionaryActionProcessorFacadeHome_6a25d1ca() {
		super();	}
	/**
	 * create
	 */
	public com.vtb.ejb.DictionaryActionProcessorFacadeLocal create() throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		com.vtb.ejb.DictionaryActionProcessorFacadeLocal _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[0];
			}
	com.vtb.ejb.EJSStatelessDictionaryActionProcessorFacadeHomeBean_6a25d1ca _EJS_beanRef = (com.vtb.ejb.EJSStatelessDictionaryActionProcessorFacadeHomeBean_6a25d1ca)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = _EJS_beanRef.create_Local();
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
	com.vtb.ejb.EJSStatelessDictionaryActionProcessorFacadeHomeBean_6a25d1ca _EJS_beanRef = (com.vtb.ejb.EJSStatelessDictionaryActionProcessorFacadeHomeBean_6a25d1ca)container.preInvoke(this, 1, _EJS_s, _jacc_parms);
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
