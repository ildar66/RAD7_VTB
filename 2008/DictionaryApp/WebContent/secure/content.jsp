<%-- IBM Confidential OCO Source Material --%>
<%-- 5639-D57, 5630-A36, 5630-A37, 5724-D18 (C) COPYRIGHT International Business Machines Corp. 1997, 2002 --%>
<%-- The source code for this program is not published or otherwise divested --%>
<%-- of its trade secrets, irrespective of what has been deposited with the --%>
<%-- U.S. Copyright Office. --%>

<%@ page language="java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%--@ taglib uri="/WEB-INF/tiles.tld" prefix="tiles" --%>
<%--@ taglib uri="/WEB-INF/ibmcommon.tld" prefix="ibmcommon" --%>

<% session.removeAttribute (com.vtb.security.console.core.Constants.CURRENT_FORMTYPE); %>

<ibmcommon:detectLocale/>

<%--tiles:insert definition="console.content.main" flush="true" /--%>
<%--jsp:include page="/secure/layouts/contentLayout.jsp" flush="true" /--%>