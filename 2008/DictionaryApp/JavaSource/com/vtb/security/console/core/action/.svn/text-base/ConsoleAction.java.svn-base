/*
 * Created on 16.08.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.security.console.core.action;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.struts.action.Action;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.vtb.security.console.core.Constants;
import com.vtb.security.console.core.User;
import com.vtb.security.console.core.bean.StatusBean;
import com.vtb.security.console.core.bean.UserPreferenceBean;
import com.vtb.security.console.core.item.MenuBarItem;
import com.vtb.security.console.core.item.NavigatorItem;
import com.vtb.security.console.core.item.PreferenceItem;
import com.vtb.system.AppService;
import com.vtb.system.TraceCapable;

/**
 * @author IShaffigulin
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ConsoleAction extends Action {
	final String CONTENT_MENU_XML = "/WEB-INF/xml/consoleMenu.xml";
	final String BAR_MENU_XML = "/WEB-INF/xml/barMenu.xml";
	final String PREFERENCES_XML = "/WEB-INF/xml/preferences.xml";

	/**
	 * 
	 */
	public ConsoleAction() {
		super();
	}
	/**
	 * 
	 * @param request
	 */
	protected void createUser(HttpServletRequest request) {
		if (request.getSession().getAttribute(Constants.USER_KEY) == null) {
			String userName = request.getUserPrincipal().getName();
			String userID = userName;
			request.getSession().setAttribute(Constants.USER_KEY, new User(userID, userName));
		}
	}
	/**
	 * 
	 * @param request
	 */
	protected void createUserPreference(HttpServletRequest request) {
		if (request.getSession().getAttribute(Constants.USER_PREFS) == null) {
			String userName = request.getUserPrincipal().getName();
			request.getSession().setAttribute(Constants.USER_PREFS, new UserPreferenceBean(userName));
		}
	}

	/**
	 * 
	 * @param request
	 */
	protected void createPreferences(HttpServletRequest request) {
		java.util.ArrayList prefsList = new java.util.ArrayList();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			InputStream inputStream = getClass().getResourceAsStream(PREFERENCES_XML);
			Document document = docBuilder.parse(inputStream);
			NodeList items = document.getElementsByTagName("preferenceItem");
			AppService.log(TraceCapable.INFO_LEVEL, "preferenceItems size:" + items.getLength());
			for (int i = 0; i < items.getLength(); i++) {
				Element preferenceItem = (Element) items.item(i);
				String label = preferenceItem.getAttribute("label");
				String prefType = preferenceItem.getAttribute("prefType");
				String prefEntry = preferenceItem.getAttribute("prefEntry");
				String desc = preferenceItem.getAttribute("desc");

				prefsList.add(new PreferenceItem(label, prefType, prefEntry, desc));
			}
		} catch (ParserConfigurationException ex) {
			System.out.println("JAXP Exception: Factory::loadDocument() " + ex);
		} catch (Exception e) {
			System.out.println("Exception: Factory::loadDocument() " + e);
		}
		request.setAttribute("preferences", prefsList);
	}
	/**
	 * 
	 * @param request
	 */
	protected void createMenuBarItems(HttpServletRequest request) {
		if (request.getSession().getAttribute("menuBarItems") == null) {
			java.util.ArrayList menuBarList = new java.util.ArrayList();
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			try {
				DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
				InputStream inputStream = getClass().getResourceAsStream(BAR_MENU_XML);
				Document document = docBuilder.parse(inputStream);
				NodeList items = document.getElementsByTagName("menuBarItem");
				AppService.log(TraceCapable.INFO_LEVEL, "menuBarItems size:" + items.getLength());
				for (int i = 0; i < items.getLength(); i++) {
					Element menuBarItem = (Element) items.item(i);
					String value = menuBarItem.getAttribute("value");
					String link = menuBarItem.getAttribute("link");
					String icon = menuBarItem.getAttribute("icon");
					String tooltip = menuBarItem.getAttribute("tooltip");
					String target = menuBarItem.getAttribute("target");

					MenuBarItem itemMBar = new MenuBarItem(value, link, icon, tooltip, target);

					NodeList roleList = menuBarItem.getElementsByTagName("role");
					String[] roles = new String[roleList.getLength()];
					for (int j = 0; j < roleList.getLength(); j++) {
						Element roleItem = (Element) roleList.item(j);
						roles[j] = roleItem.getFirstChild().getNodeValue();
					}
					itemMBar.setRoles(roles);

					menuBarList.add(itemMBar);
				}

			} catch (ParserConfigurationException ex) {
				System.out.println("JAXP Exception: Factory::loadDocument() " + ex);
			} catch (Exception e) {
				System.out.println("Exception: Factory::loadDocument() " + e);
			}
			request.getSession().setAttribute("menuBarItems", menuBarList);
		}
	}

	/**
	 * 
	 * @param request
	 */
	protected void createNavigatorList(HttpServletRequest request) {
		if (request.getSession().getAttribute("navigatorList") == null) {
			java.util.ArrayList navigatorList = new java.util.ArrayList();
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			try {
				DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
				InputStream inputStream = getClass().getResourceAsStream(CONTENT_MENU_XML);
				Document document = docBuilder.parse(inputStream);
				NodeList items = document.getElementsByTagName("navigatorItem");
				AppService.log(TraceCapable.INFO_LEVEL, "navigatorItems size:" + items.getLength());
				for (int i = 0; i < items.getLength(); i++) {
					Element navigatorItem = (Element) items.item(i);
					String nodeId = navigatorItem.getAttribute("nodeId");
					String parentId = navigatorItem.getAttribute("parentId");
					String tooltip = navigatorItem.getAttribute("tooltip");
					String value = navigatorItem.getAttribute("value");
					String link = navigatorItem.getAttribute("link");
					String icon = navigatorItem.getAttribute("icon");
					boolean isExternalLink = "true".equalsIgnoreCase(navigatorItem.getAttribute("isExternalLink"));
					NavigatorItem itemNav = new NavigatorItem(nodeId, parentId, tooltip, value, link, icon, isExternalLink);

					NodeList roleList = navigatorItem.getElementsByTagName("role");
					String[] roles = new String[roleList.getLength()];
					for (int j = 0; j < roleList.getLength(); j++) {
						Element roleItem = (Element) roleList.item(j);
						roles[j] = roleItem.getFirstChild().getNodeValue();
					}
					itemNav.setRoles(roles);

					navigatorList.add(itemNav);
				}

			} catch (ParserConfigurationException ex) {
				System.out.println("JAXP Exception: Factory::loadDocument() " + ex);
			} catch (Exception e) {
				System.out.println("Exception: Factory::loadDocument() " + e);
			}
			request.getSession().setAttribute("navigatorList", navigatorList);
		}
	}

	/**
	 * 
	 * @param request
	 */
	protected StatusBean getStatusBean(HttpServletRequest request) {
		StatusBean statusBean = (StatusBean) request.getSession().getAttribute("statusBean");
		if (statusBean == null) {
			statusBean = new StatusBean();
			request.getSession().setAttribute("statusBean", statusBean);
		}
		return statusBean;
	}

}
