/*
 * Created on 14.08.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.security.console.core;

import java.io.Serializable;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class User implements Serializable, HttpSessionBindingListener {
	private String username = null;
	private String userID = null;
	private String userSessionId = null;
	private boolean workSpaceValid = false;
	private String workSpaceInstallRoot = null;

	/**
	 * 
	 */
	public User(String aUserID, String aUserName) {
		super();
		setUserID(aUserID);
		setUsername(aUserName);
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionBindingListener#valueBound(javax.servlet.http.HttpSessionBindingEvent)
	 */
	public void valueBound(HttpSessionBindingEvent arg0) {
		userSessionId = arg0.getSession().getId();
		workSpaceValid = true;
		AppService.log(TraceCapable.DEBUG_LEVEL, "HttpSessionBindingEvent userSessionId=" + userSessionId + " valueBound");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpSessionBindingListener#valueUnbound(javax.servlet.http.HttpSessionBindingEvent)
	 */
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		//userSessionId = null;
		//workSpaceValid = false;
		AppService.log(TraceCapable.DEBUG_LEVEL, "HttpSessionBindingEvent userSessionId=" + userSessionId + " valueUnbound");
	}

	/**
	 * @return
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return
	 */
	public String getSessionId() {
		return userSessionId;
	}

	/**
	 * @return
	 */
	public boolean isWorkSpaceValid() {
		return workSpaceValid;
	}

	/**
	 * @param string
	 */
	public void setUserID(String string) {
		userID = string;
	}

	/**
	 * @param string
	 */
	public void setUsername(String string) {
		username = string;
	}

}
