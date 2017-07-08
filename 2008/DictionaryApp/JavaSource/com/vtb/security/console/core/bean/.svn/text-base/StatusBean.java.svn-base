/*
 * Created on 14.08.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.security.console.core.bean;

import java.io.Serializable;
import java.util.*;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class StatusBean implements Serializable {
	/**
	 * @author IShaffigulin
	 *
	 * To change the template for this generated type comment go to
	 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
	 */
	public class Tile implements Serializable {
		String name = null;
		String title = null;
		String link = null;
		String renderedUri = null;
		int refresh = 0;
		String largeIcon = null;
		String smallIcon = null;

		/**
		 * 
		 */
		public Tile() {
		}

	}
	private ArrayList panels;
	private boolean cycle = false;
	private int index = 0;
	private boolean initialized = false;
	private Tile currentPanel = null;
	/**
	 * 
	 */
	public StatusBean() {
		super();
		// TODO Auto-generated constructor stub
		panels = new ArrayList();
		//"/secure/events/runtime_messages.jsp":
		currentPanel = new Tile();
		currentPanel.renderedUri = "/secure/events/runtime_messages.jsp";
		panels.add(currentPanel);
		//"/secure/probdetermination/config_problems.jsp":
		currentPanel = new Tile();
		currentPanel.renderedUri = "/secure/probdetermination/config_problems.jsp";
		panels.add(currentPanel);
	}

	/**
	 * @return
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * @param b
	 */
	public void setInitialized(boolean b) {
		initialized = b;
	}

	public boolean getCycleMode() {
		return cycle;
	}

	public void setNameText(String aNameText) {
		//TODO Auto-generated constructor stub
	}

	public void setValueText(String aValueText) {
		//TODO Auto-generated constructor stub
	}

	public void setIconText(String aIconText) {
		//TODO Auto-generated constructor stub
	}

	public void store() {
		//TODO Auto-generated constructor stub	
	}

	public void cycle() {
		if (index >= panels.size()) {
			index = 0;
		}
		currentPanel = (Tile) panels.get(index);
		index++;
	}

	public void back() {
		//TODO Auto-generated constructor stub
		cycle();	
	}

	public void setCycleMode(boolean mode) {
		cycle = mode;
	}

	public String getLink() {
		//TODO Auto-generated constructor stub
		return null;
	}

	public String getTitle() {
		//TODO Auto-generated constructor stub
		return null;
	}

	public String getRendererUri() {
		return currentPanel.renderedUri; //"/secure/events/runtime_messages.jsp";
	}
}
