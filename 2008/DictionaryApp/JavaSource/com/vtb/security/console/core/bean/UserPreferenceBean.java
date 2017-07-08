/*
 * Created on 13.08.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.security.console.core.bean;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class UserPreferenceBean {
	private String userName = null;
	private boolean bannerShow = true;
	private boolean navigatorShow = true;
	private boolean refreshOn = true;
	private int refreshInSeconds = 60;
	private boolean cycleOn = true;
	private boolean descriptionsShow = true;

	/**
	 * 
	 */
	public UserPreferenceBean(String aUserName) {
		super();
		setUserName(aUserName);
	}

	public String getProperty(String propName, String defValue) {
		if (propName.equalsIgnoreCase("System/workspace#bannerShow")) {
			return "" + bannerShow;
		} else if (propName.equalsIgnoreCase("System/workspace#navigatorShow")) {
			return "" + navigatorShow;
		} else if (propName.equalsIgnoreCase("UI/statusTray#refreshEnabled")) {
			return "" + refreshOn;
		} else if (propName.equalsIgnoreCase("UI/statusTray#refreshRate")) {
			return "" + refreshInSeconds;
		} else if (propName.equalsIgnoreCase("UI/statusTray#cycle")) {
			return "" + cycleOn;
		} else if (propName.equalsIgnoreCase("System/workspace#descriptionsShow")) {
			return "" + descriptionsShow;			
		}

		return defValue;

	}

	/**
	 * @return
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param string
	 */
	public void setUserName(String string) {
		userName = string;
	}

	/**
	 * @param b
	 */
	public void setBannerShow(boolean b) {
		bannerShow = b;
	}

	/**
	 * @param b
	 */
	public void setCycleOn(boolean b) {
		cycleOn = b;
	}

	/**
	 * @param string
	 */
	public void setRefreshInSeconds(int arg) {
		refreshInSeconds = arg;
	}

	/**
	 * @param b
	 */
	public void setRefreshOn(boolean b) {
		refreshOn = b;
	}

	/**
	 * @param b
	 */
	public void setNavigatorShow(boolean b) {
		navigatorShow = b;
	}

	/**
	 * @param b
	 */
	public void setDescriptionsShow(boolean b) {
		descriptionsShow = b;
	}

}
