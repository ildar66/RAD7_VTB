<%-- IBM Confidential OCO Source Material --%>
<%-- 5639-D57, 5630-A36, 5630-A37, 5724-D18 (C) COPYRIGHT International Business Machines Corp. 1997, 2002 --%>
<%-- The source code for this program is not published or otherwise divested --%>
<%-- of its trade secrets, irrespective of what has been deposited with the --%>
<%-- U.S. Copyright Office. --%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%--@ taglib uri="/WEB-INF/ibmcommon.tld" prefix="ibmcommon" --%>

<%@ page import="java.util.Locale" %>

<ibmcommon:detectLocale/>

<%
		Locale locale = request.getLocale();
        String currentLocale = "en";
        String[] availableLocales = new String [] {"en","de","es","fr","it","ja","ko","pt","zh_TW","zh"};
        if (locale.toString().startsWith("en") || locale.toString().equals("C"))
            currentLocale = availableLocales [0];
        else
        {
            for (int i = 1; i < availableLocales.length; i++)
            {
                if (locale.toString().equals(availableLocales[i]))
                {
                    currentLocale = availableLocales [i];
                    break;
                }
                else
                {
                    if (locale.toString().startsWith(availableLocales[i]))
                    {
                        currentLocale = availableLocales [i];
                        break;
                    }
                }
            }
        }

	String localeStr = currentLocale;
%>
<table border="0" cellpadding="0" cellspacing="0" width="100%" background="<%= request.getContextPath() + "/" %>images/login-background.jpg" >
  <tr >
      <%--td align="left" width="60%"><img src="<%= request.getContextPath() + "/" + "images/WS_logo_Admin" + "_" + localeStr + ".gif"%>"
    	width="395" height="52" alt="<bean:message key="websphere.admin.console"/>"></td--%>
	    <td align="center" width="70%">
	    	<img src="<%= request.getContextPath() + "/" + "images/logo_security.gif"%>"
	    	width="678" height="29" alt="logo_security"></td>
 
	    <td align="right" width="30%">
	    	<img src="<%= request.getContextPath() + "/" %>images/login-background.jpg"
	    	width="90" height="52" alt="vtbLogo"></td>
    </tr>
 </table>
