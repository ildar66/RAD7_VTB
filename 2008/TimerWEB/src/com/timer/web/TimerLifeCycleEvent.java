package com.timer.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.timer.ejb.TimerEJB;
import com.timer.ejb.TimerEJBHome;

public class TimerLifeCycleEvent implements ServletContextListener {
	ServletContext servletContext;

	/* Methods from the ServletContextListener */
	public void contextInitialized(ServletContextEvent sce) {
		servletContext = sce.getServletContext();
		try {
			Context context = new InitialContext();
			TimerEJBHome timerEJBHome = (TimerEJBHome) PortableRemoteObject.narrow(context
					.lookup("java:comp/env/ejb/TimerEJB"), TimerEJBHome.class);
			TimerEJB timerEJB;

			// Use one of the create() methods below to create a new instance
			timerEJB = timerEJBHome.create();

			// Init parameter from "servletContext":
			String timerName = initTimerName();
			Integer timerPeriod = initTimerPeriod();
			Date firstDate = initStartDate();
			// Call any of the Remote methods below to access the EJB
			timerEJB.cancelTimer(timerName);
			timerEJB.initializeTimer(firstDate, timerPeriod, timerName);

			timerEJB.getTimerInfo();
			// timerEJB.cancelTimer(timerName);

		} catch (Throwable ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * init startDate:
	 */
	private Date initStartDate() throws ParseException {
		String firstDateParameterStr = "startDate";
		Date firstDate = new java.util.Date();
		String firstDateStr = servletContext.getInitParameter(firstDateParameterStr);
		if (firstDateStr != null && !firstDateStr.trim().equalsIgnoreCase("")) {
			firstDate = DateFormat.getDateInstance().parse(firstDateStr);
		}
		System.out.println("firstDate=" + firstDate);
		return firstDate;
	}

	/**
	 * init timerPeriod:
	 */
	private Integer initTimerPeriod() {
		String timerPeriodParameterStr = "timerPeriod";
		Integer timerPeriod = 30 * 1000;
		String timerPeriodStr = servletContext.getInitParameter(timerPeriodParameterStr);
		if (timerPeriodStr != null && !timerPeriodStr.trim().equalsIgnoreCase("")) {
			timerPeriod = new Integer(timerPeriodStr);
		}
		System.out.println("timerPeriod=" + timerPeriod);
		return timerPeriod;
	}

	/**
	 * init timerName:
	 */
	private String initTimerName() {
		String timerNameParameterStr = "timerName";
		String timerName = servletContext.getInitParameter(timerNameParameterStr);
		if (timerName == null || timerName.trim().equalsIgnoreCase("")) {
			timerName = "MyTimer";
		}
		System.out.println("timerName=" + timerName);
		return timerName;
	}

	/**
	 * 
	 */
	public void contextDestroyed(ServletContextEvent sce) {
	}

	/**
	 * 
	 * @param msg
	 */
	protected void log(String msg) {
		System.out.println("[" + getClass().getName() + "] " + msg);
	}
}
