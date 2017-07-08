package ru.md.sequence.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalBMPSequence_d839a054
 */
public class EJSLocalBMPSequence_d839a054 extends EJSLocalWrapper implements ru.md.sequence.ejb.SequenceLocal {
	/**
	 * EJSLocalBMPSequence_d839a054
	 */
	public EJSLocalBMPSequence_d839a054() {
		super();	}
	/**
	 * getId
	 */
	public java.lang.String getId() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		java.lang.String _EJS_result = null;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[0];
			}
	ru.md.sequence.ejb.SequenceBean beanRef = (ru.md.sequence.ejb.SequenceBean)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.getId();
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
	 * getNextKeyAfterIncrementingBy
	 */
	public long getNextKeyAfterIncrementingBy(int blockSize) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		long _EJS_result = 0;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = new java.lang.Integer(blockSize);
			}
	ru.md.sequence.ejb.SequenceBean beanRef = (ru.md.sequence.ejb.SequenceBean)container.preInvoke(this, 1, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.getNextKeyAfterIncrementingBy(blockSize);
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
	 * getValue
	 */
	public long getValue() {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		long _EJS_result = 0;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[0];
			}
	ru.md.sequence.ejb.SequenceBean beanRef = (ru.md.sequence.ejb.SequenceBean)container.preInvoke(this, 2, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.getValue();
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
		return _EJS_result;
	}
	/**
	 * setValue
	 */
	public void setValue(long value) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = new java.lang.Long(value);
			}
	ru.md.sequence.ejb.SequenceBean beanRef = (ru.md.sequence.ejb.SequenceBean)container.preInvoke(this, 3, _EJS_s, _jacc_parms);
			beanRef.setValue(value);
		}
		catch (java.rmi.RemoteException ex) {
		 	_EJS_s.setUncheckedLocalException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedLocalException(ex);
		}

		finally {
			try {
				container.postInvoke(this, 3, _EJS_s);
			} catch ( RemoteException ex ) {
				_EJS_s.setUncheckedLocalException(ex);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
