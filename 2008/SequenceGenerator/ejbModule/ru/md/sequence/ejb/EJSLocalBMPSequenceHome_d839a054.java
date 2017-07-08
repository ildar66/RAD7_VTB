package ru.md.sequence.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalBMPSequenceHome_d839a054
 */
public class EJSLocalBMPSequenceHome_d839a054 extends EJSLocalWrapper implements ru.md.sequence.ejb.SequenceLocalHome {
	/**
	 * EJSLocalBMPSequenceHome_d839a054
	 */
	public EJSLocalBMPSequenceHome_d839a054() {
		super();	}
	/**
	 * create
	 */
	public ru.md.sequence.ejb.SequenceLocal create(java.lang.String id, long value) throws javax.ejb.CreateException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		ru.md.sequence.ejb.SequenceLocal _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[2];
				_jacc_parms[0] = id;
				_jacc_parms[1] = new java.lang.Long(value);
			}
	ru.md.sequence.ejb.EJSBMPSequenceHomeBean_d839a054 _EJS_beanRef = (ru.md.sequence.ejb.EJSBMPSequenceHomeBean_d839a054)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = _EJS_beanRef.create_Local(id, value);
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
	public ru.md.sequence.ejb.SequenceLocal findByPrimaryKey(ru.md.sequence.ejb.SequenceKey key) throws javax.ejb.FinderException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		ru.md.sequence.ejb.SequenceLocal _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = key;
			}
	ru.md.sequence.ejb.EJSBMPSequenceHomeBean_d839a054 _EJS_beanRef = (ru.md.sequence.ejb.EJSBMPSequenceHomeBean_d839a054)container.preInvoke(this, 1, _EJS_s, _jacc_parms);
			_EJS_result = _EJS_beanRef.findByPrimaryKey_Local(key);
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
	ru.md.sequence.ejb.EJSBMPSequenceHomeBean_d839a054 _EJS_beanRef = (ru.md.sequence.ejb.EJSBMPSequenceHomeBean_d839a054)container.preInvoke(this, 2, _EJS_s, _jacc_parms);
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
