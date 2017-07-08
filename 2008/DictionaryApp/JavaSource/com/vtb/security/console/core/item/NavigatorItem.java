/*
 * Created on 13.08.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.security.console.core.item;

import java.io.Serializable;

import org.apache.struts.tiles.beans.MenuItem;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class NavigatorItem implements Serializable, MenuItem {
	final private static String[] allRoles = new String[] { "AllAuthenticated" };

	private String value = null;
	private String link = null;
	private String icon = null;
	private String tooltip = null;
	private String nodeId = null;
	private String parentId = null;
	private boolean isExternalLink = false;
	private String[] roles = null;

	/**
	 * 
	 */
	public NavigatorItem() {
		super();
	}

	/**
	 * 
	 */
	public NavigatorItem(String aNodeId, String aParentId, String aTooltip, String aValue, String aLink, String aIcon, boolean aIsExternalLink) {
		super();
		nodeId = aNodeId;
		parentId = aParentId;
		tooltip = aTooltip;
		value = aValue;
		link = aLink;
		icon = aIcon;
		isExternalLink = aIsExternalLink;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.tiles.beans.MenuItem#setValue(java.lang.String)
	 */
	public void setValue(String aValue) {
		value = aValue;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.tiles.beans.MenuItem#getValue()
	 */
	public String getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.tiles.beans.MenuItem#setLink(java.lang.String)
	 */
	public void setLink(String aLink) {
		link = aLink;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.tiles.beans.MenuItem#getLink()
	 */
	public String getLink() {
		return link;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.tiles.beans.MenuItem#setIcon(java.lang.String)
	 */
	public void setIcon(String aIcon) {
		icon = aIcon;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.tiles.beans.MenuItem#getIcon()
	 */
	public String getIcon() {
		return icon;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.tiles.beans.MenuItem#setTooltip(java.lang.String)
	 */
	public void setTooltip(String aTooltip) {
		tooltip = aTooltip;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts.tiles.beans.MenuItem#getTooltip()
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * @return
	 */
	public String[] getRoles() {
		return roles;
	}

	public String getNodeId() {
		return nodeId;
	}

	public String getParentId() {
		return parentId;
	}

	public boolean isExternalLink() {
		return isExternalLink;
	}
	/**
	 * @param string
	 */
	public void setParentId(String string) {
		parentId = string;
	}

	/**
	 * @param strings
	 */
	public void setRoles(String[] strings) {
		roles = strings;
	}

}
