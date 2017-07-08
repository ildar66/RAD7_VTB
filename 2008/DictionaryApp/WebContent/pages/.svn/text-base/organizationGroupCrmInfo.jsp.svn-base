<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.vtb.value.*"%>
<%
	String form = "OrganizationGroupCrmInfoForm";
%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">

	<TITLE><bean:write name="<%=form %>" property="vo.name"/></TITLE>
</HEAD>
<BODY class="content">

<html:form action="/organizationGroupCrmInfo.do">
<html:errors/>

<table class="main">
    <tr class="title">
    	<td class="title" colspan="2">
	    	<IMG SRC="<%=request.getContextPath()%>/images/cancel.gif" BORDER='0' ALT='Закрыть окно' onclick="document.body.style.cursor='auto'; if (opener != null) {opener.focus();} window.close();">
			<IMG SRC="<%=request.getContextPath()%>/images/empty.gif" BORDER='0' ALT='' WIDTH='3'>
	 		<A HREF='#'><IMG SRC="<%=request.getContextPath()%>/images/print.gif" BORDER='0' onclick='window.print()' ALT='Напечатать'></A>						
        </td>
    </tr>

	<tr class="printable">
		<td class="printable">
			<table class="print" STYLE="FONT-FAMILY: Arial,Verdana; FONT-SIZE: 8pt;">
			    <tr class="print">
			        <td class="print" colspan="2">код CRM:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.crmID"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Имя группы:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.name"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Тип группы:</td>
			        <td class="print">
			        	<bean:write name="<%=form %>" property="vo.type"/>
			        </td>
			    </tr>			    
			    <tr class="print">
			        <td class="print" colspan="2">Описание группы:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.description"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">ИНН:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.inn"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">ОГРН:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.ogrn"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">код ОКПО:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.okpo"/>
			        </td>
			    </tr>			    			    			    
			    <tr class="print">
			        <td class="print" colspan="2">Отрасль:</td>
			        <td class="print">
						<html:select property="vo.industryID" styleId="industryID" style="width: 345pt" disabled="true">
							<html:option value="">_____________________________________________</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.INDUSTRY_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Регион:</td>
			        <td class="print">
						<html:select property="vo.regionID" styleId="regionID" style="width: 345pt" disabled="true">
							<html:option value="">_____________________________________________</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.REGION_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			</table>
		</td>
	</tr>
	
	
	<logic:present name="<%=BeanKeys.GROUP_TO_ORGANIZATION_LIST%>">

    <TR class="printable">
		<TD class="printable" colspan="2">
			<table class="print" STYLE="FONT-FAMILY: Arial,Verdana; FONT-SIZE: 8pt;">
				<caption align="left" class="print" style="font-weight: bold; FONT-SIZE: 9pt;">состав Группы CRM: <bean:write name="<%=form %>" property="vo.name"/></caption>
				<!-- Table header -->
				<tr class="print" style="background-color: 'D6EBFF'">
					<td class="print" style="font-weight: bold">№ SPO</td>
					<td class="print" style="font-weight: bold">№ CRM</td>					
					<td class="print" style="font-weight: bold">Наименование</td>
					<td class="print" style="font-weight: bold">Полное юридическое Наименование</td>
				</tr>
				<!-- Table body -->
				<logic:iterate id="item" name="<%=BeanKeys.GROUP_TO_ORGANIZATION_LIST%>">
					<logic:present name="item">
						<tr>
							<td class="print"><bean:write name="item" property="spoID" filter="true"/></td>
							<td class="print"><bean:write name="item" property="crmID" filter="true"/></td>
							<td class="print"><bean:write name="item" property="name" filter="true"/></td>
							<td class="print"><bean:write name="item" property="fullName" filter="true"/></td>
		    	        </tr>
					</logic:present>
				</logic:iterate>	
				
			</table>
		</TD>
	</TR>

	</logic:present>
	
    <tr class="title">
    	<td class="title" colspan="2">
	    	<IMG SRC="<%=request.getContextPath()%>/images/cancel.gif" BORDER='0' ALT='Закрыть окно' onclick="document.body.style.cursor='auto'; if (opener != null) {opener.focus();} window.close();">
			<IMG SRC="<%=request.getContextPath()%>/images/empty.gif" BORDER='0' ALT='' WIDTH='3'>
	 		<A HREF='#'><IMG SRC="<%=request.getContextPath()%>/images/print.gif" BORDER='0' onclick='window.print()' ALT='Напечатать'></A>						
        </td>
    </tr>
</table>
</html:form>

</BODY>
</HTML>