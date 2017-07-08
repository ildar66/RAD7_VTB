package ru.md.sequence.ejb;

import com.ibm.ejs.container.*;
import java.rmi.RemoteException;

/**
 * EJSLocalStatelessSequenceSession_a4d12cbf
 */
public class EJSLocalStatelessSequenceSession_a4d12cbf extends EJSLocalWrapper implements ru.md.sequence.ejb.SequenceSessionLocal {
	/**
	 * EJSLocalStatelessSequenceSession_a4d12cbf
	 */
	public EJSLocalStatelessSequenceSession_a4d12cbf() {
		super();	}
	/**
	 * getNextNumberInSequence
	 */
	public long getNextNumberInSequence(java.lang.String id) {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		long _EJS_result = 0;
		try {
			if ( container.doesJaccNeedsEJBArguments(this) )
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = id;
			}
	ru.md.sequence.ejb.SequenceSessionBean beanRef = (ru.md.sequence.ejb.SequenceSessionBean)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			_EJS_result = beanRef.getNextNumberInSequence(id);
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
