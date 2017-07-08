<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<%@ page language="java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<LINK href="<%=request.getContextPath()%>/theme/Master.css" rel="stylesheet" type="text/css">
<TITLE>SecurityApp Application Error Page</TITLE>
<%@page session="true" isThreadSafe="true" isErrorPage="true"%>
</HEAD>
<BODY>
<H2>Error Occurred in Application</H2><BR>
<html:errors/>
<% if (exception != null) {
    out.println("<h1>Exception: " + exception.getMessage() + "</h1>");
} %><BR>
<%--A href="/DictionaryApp/logon.do" target="_top">¬ход</A--%>
</BODY>
</HTML>
