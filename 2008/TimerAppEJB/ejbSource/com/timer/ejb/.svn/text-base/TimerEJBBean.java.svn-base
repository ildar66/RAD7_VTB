package com.timer.ejb;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.ejb.TimedObject;
import javax.ejb.Timer;
import javax.ejb.TimerHandle;
import javax.ejb.TimerService;

import com.vtb.command.CommandFactory;
import com.vtb.exception.ModelException;

/**
 * Bean implementation class for Enterprise Bean: TimerEJB
 */
public class TimerEJBBean implements javax.ejb.SessionBean, TimedObject {

	static final long serialVersionUID = 3206093459760846163L;
	private javax.ejb.SessionContext mySessionCtx;
	private TimerHandle timerHandle = null;

	/**
	 * 
	 * @param firstDate
	 * @param timeout
	 * @param info
	 */
	public void initializeTimer(Date firstDate, long timeout, String info) {
		try {
			// Create Your Timer
			TimerService ts = mySessionCtx.getTimerService();
			Timer timer = ts.createTimer(firstDate, timeout, info);
			System.out.println("Timer created at " + new Date(System.currentTimeMillis()) + " with a timeout: "
					+ timeout + " and with info: " + info);

			// Store the TimerHandle which is seriablizable and which can be
			// used
			// to retrieve the timer values whenever required later.
			// Class-level attribute:
			timerHandle = timer.getHandle();
		} catch (Exception e) {

			System.out.println("Exception after create timer : " + e.toString());

		}
		return;

	}

	/**
	 * @see TimedObject.ejbTimeout(Timer timer)
	 */
	public void ejbTimeout(Timer timer) {
		String commandName = (String)timer.getInfo();
		System.out.println("Performing Command name: " + timer.getInfo());
		try {
			CommandFactory.getCommand(commandName).execute();
		} catch (ModelException e) {
			mySessionCtx.setRollbackOnly();
			e.printStackTrace();
		}
		System.out.println("ejbTimeout() called at: " + new Date(System.currentTimeMillis()) + " with info: "
				+ timer.getInfo());
	}

	/**
	 * 
	 * @param timerName
	 */
	public void cancelTimer(String timerName) {
		try {
			TimerService ts = mySessionCtx.getTimerService();
			Collection timers = ts.getTimers();
			Iterator it = timers.iterator();
			while (it.hasNext()) {
				Timer myTimer = (Timer) it.next();
				if ((myTimer.getInfo().equals(timerName))) {
					myTimer.cancel();
					System.out.println("Successfully Cancelled " + timerName);

				}
			}
		} catch (Exception e) {

			System.out.println("Exception after create timer : " + e.toString());

		}
		return;
	}

	/**
	 * outPrint Timer Info.
	 */
	public void getTimerInfo() {
		if (timerHandle != null) {
			Timer timer = timerHandle.getTimer();
			// Get Timer Infomation
			System.out.println(timer.getInfo());
		}

	}

	/**
	 * getSessionContext
	 */
	public javax.ejb.SessionContext getSessionContext() {
		return mySessionCtx;
	}

	/**
	 * setSessionContext
	 */
	public void setSessionContext(javax.ejb.SessionContext ctx) {
		mySessionCtx = ctx;
	}

	/**
	 * ejbCreate
	 */
	public void ejbCreate() throws javax.ejb.CreateException {
	}

	/**
	 * ejbActivate
	 */
	public void ejbActivate() {
	}

	/**
	 * ejbPassivate
	 */
	public void ejbPassivate() {
	}

	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}
}
