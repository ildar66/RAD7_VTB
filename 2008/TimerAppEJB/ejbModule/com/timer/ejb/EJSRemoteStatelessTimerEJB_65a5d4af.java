package com.timer.ejb;

import com.ibm.ejs.container.*;

/**
 * EJSRemoteStatelessTimerEJB_65a5d4af
 */
public class EJSRemoteStatelessTimerEJB_65a5d4af extends EJSWrapper implements TimerEJB {
	/**
	 * EJSRemoteStatelessTimerEJB_65a5d4af
	 */
	public EJSRemoteStatelessTimerEJB_65a5d4af() throws java.rmi.RemoteException {
		super();	}
	/**
	 * cancelTimer
	 */
	public void cancelTimer(java.lang.String timerName) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if (container.doesJaccNeedsEJBArguments( this ))
			{
				_jacc_parms = new Object[1];
				_jacc_parms[0] = timerName;
			}
	com.timer.ejb.TimerEJBBean beanRef = (com.timer.ejb.TimerEJBBean)container.preInvoke(this, 0, _EJS_s, _jacc_parms);
			beanRef.cancelTimer(timerName);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try{
				container.postInvoke(this, 0, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * getTimerInfo
	 */
	public void getTimerInfo() throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if (container.doesJaccNeedsEJBArguments( this ))
			{
				_jacc_parms = new Object[0];
			}
	com.timer.ejb.TimerEJBBean beanRef = (com.timer.ejb.TimerEJBBean)container.preInvoke(this, 1, _EJS_s, _jacc_parms);
			beanRef.getTimerInfo();
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try{
				container.postInvoke(this, 1, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
	/**
	 * initializeTimer
	 */
	public void initializeTimer(java.util.Date firstDate, long timeout, java.lang.String info) throws java.rmi.RemoteException {
		EJSDeployedSupport _EJS_s = container.getEJSDeployedSupport(this);
		Object[] _jacc_parms = null;
		
		try {
			if (container.doesJaccNeedsEJBArguments( this ))
			{
				_jacc_parms = new Object[3];
				_jacc_parms[0] = firstDate;
				_jacc_parms[1] = new java.lang.Long(timeout);
				_jacc_parms[2] = info;
			}
	com.timer.ejb.TimerEJBBean beanRef = (com.timer.ejb.TimerEJBBean)container.preInvoke(this, 2, _EJS_s, _jacc_parms);
			beanRef.initializeTimer(firstDate, timeout, info);
		}
		catch (java.rmi.RemoteException ex) {
			_EJS_s.setUncheckedException(ex);
		}
		catch (Throwable ex) {
			_EJS_s.setUncheckedException(ex);
			throw new java.rmi.RemoteException("bean method raised unchecked exception", ex);
		}

		finally {
			try{
				container.postInvoke(this, 2, _EJS_s);
			} finally {
				container.putEJSDeployedSupport(_EJS_s);
			}
		}
		return ;
	}
}
