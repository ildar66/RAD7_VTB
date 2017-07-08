package com.timer.ejb;

import java.util.Date;

/**
 * Remote interface for Enterprise Bean: TimerEJB
 */
public interface TimerEJB extends javax.ejb.EJBObject {

	/**
	 * @param firstDate
	 * @param timeout
	 * @param info
	 * @throws java.rmi.RemoteException
	 */
	public void initializeTimer(Date firstDate, long timeout, String info) throws java.rmi.RemoteException;

	/**
	 * @param timerName
	 * @throws java.rmi.RemoteException
	 */
	public void cancelTimer(String timerName) throws java.rmi.RemoteException;

	/**
	 * @throws java.rmi.RemoteException
	 */
	public void getTimerInfo() throws java.rmi.RemoteException;
}
