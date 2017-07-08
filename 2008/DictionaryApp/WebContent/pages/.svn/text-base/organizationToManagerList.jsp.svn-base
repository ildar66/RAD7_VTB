<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.vtb.security.forms.*, com.vtb.value.*"%>
<%
 	java.lang.String gColSpan = "12";
 	OrganizationToManagerListForm listForm = (OrganizationToManagerListForm)request.getAttribute("OrganizationToManagerListForm");
 	String sortBy = listForm.getOrderBy();
 	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.ORGANIZATION_TO_MANAGERS_LIST);
 	int posListSize = posList.size();//кол-во позиций.
	//редактировать может только роль "Администратор Справочников"
	boolean canEdit = request.isUserInRole("adminDictionary");	
 %>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Контакты для организации</TITLE>
</HEAD>
<BODY class="content">

<H3 id='bread-crumb'><html:link page="/organizationList.do" styleClass="navigator">Справочник организаций</html:link> &gt;
	Контакты для организации: <I><bean:write name="OrganizationToManagerListForm" property="organizationVO.account_name"/></I> &gt;
</H3><br>
<html:form action="/organizationToManagerList.do" styleId="listForm">
<html:errors/>
<html:hidden property="organizationID"/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID"/>

<%@include file="../secure/layouts/tableJS.jspf"%>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">

	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
					<td class="find-filter" colspan="2">
						<html:radio property="activeState" value="ALL"/>Все
						<html:radio property="activeState" value="Y"/>Активные
						<html:radio property="activeState" value="N"/>Не активные
					</td>
					<th class="find-filter">
						&nbsp;<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>&nbsp;
					</th>					
				</tr>
			</table>
		</TD>
	</TR>

	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1" width="100%">
			<TR>
				<TD class="find-filter">
					<% if(canEdit) { %>
						<html:link page="/organizationToManagerDialog.do?action=Add" paramId="organizationID" paramName="OrganizationToManagerListForm" paramProperty="organizationID">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/></html:link>
					<% } %>
					<html:link page="/organizationList.do" styleClass="navigator">
						<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад"></html:link>					
				</TD>
				<TH class="find-filter" align="right">отобрано записей: <%= posListSize %></TH>
				<TD class="find-filter">&nbsp;</TD>
            </TR>
		</TABLE>
		</td>
	</tr>
      
      
    
    <!-- Table header -->
    <tr class="title">
 		<TD class="column-head-name" align="center" valign="middle">
 			<img src="<%=request.getContextPath()%>/images/empty.gif" width="1" height="1" />
		</TD>
		<TD class="column-head-name" nowrap>
			<A title="Сортировать по полю 'id'" href="javascript:SortBy('id')">&nbsp;№&nbsp;</A>
			<%=isUp(sortBy, "id")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'lastName'" href="javascript:SortBy('lastName')">ФИО</A>
			<%=isUp(sortBy, "lastName")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'title'" href="javascript:SortBy('title')">Должность</A>
			<%=isUp(sortBy, "title")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'reason'" href="javascript:SortBy('reason')">На основании чего действует</A>
			<%=isUp(sortBy, "reason")%>
		</TD>
		<TD class="column-head-name" title="Адрес">&nbsp;<b>!</b>&nbsp;</TD>
		<TD class="column-head-name" align="center" valign="middle">
			<img src="<%=request.getContextPath()%>/images/empty.gif" width="1" height="1" />
		</TD>		
    </tr>




        <!-- Table body -->
    <logic:iterate id="item" name="<%=BeanKeys.ORGANIZATION_TO_MANAGERS_LIST%>" type="com.vtb.domain.Manager">
        <logic:present name="item">
            <tr id='<bean:write name="item" property="id" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
            	<td class="text">
	            	<% if(canEdit) { %>
	                    <html:link page="/organizationToManagerDialog.do?action=Edit" paramId="id" paramName="item" paramProperty="id" paramScope="page">            	
	                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></html:link>
	                <% } else { %>
	                    <html:link page="/organizationToManagerDialog.do?action=View" paramId="id" paramName="item" paramProperty="id" paramScope="page">            	
	                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Просмотр записи'></html:link>
	                <% } %>            	
				</td>
                <td class="text">
                    <bean:write name="item" property="id" filter="true"/>
                 </td>
                <td class="text">
					<bean:write name="item" property="lastName" filter="true"/>
					<bean:write name="item" property="firstName" filter="true"/>
					<bean:write name="item" property="middleName" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="title" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="reason" filter="true"/>
                </td>
                <td class="text" title=' город : <bean:write name="item" property="address.city" filter="true"/>&#13; индекс: <bean:write name="item" property="address.postalCode" filter="true"/>&#13; страна: <bean:write name="item" property="address.country" filter="true"/>&#13; округ : <bean:write name="item" property="address.county" filter="true"/>&#13; Описание: <bean:write name="item" property="address.description" filter="true"/>&#13; Адрес 1: <bean:write name="item" property="address.address1" filter="true"/>&#13; Адрес 2: <bean:write name="item" property="address.address2" filter="true"/>&#13; Адрес 3: <bean:write name="item" property="address.address3" filter="true"/>&#13; Адрес 4: <bean:write name="item" property="address.address4" filter="true"/>&#13; ID: <bean:write name="item" property="address.id" filter="true"/>'>
                	<IMG SRC='<%=request.getContextPath()%>/images/more.gif' BORDER='0'
                		 title=' город : <bean:write name="item" property="address.city" filter="true"/>&#13; индекс: <bean:write name="item" property="address.postalCode" filter="true"/>&#13; страна: <bean:write name="item" property="address.country" filter="true"/>&#13; округ : <bean:write name="item" property="address.county" filter="true"/>&#13; Описание: <bean:write name="item" property="address.description" filter="true"/>&#13; Адрес 1: <bean:write name="item" property="address.address1" filter="true"/>&#13; Адрес 2: <bean:write name="item" property="address.address2" filter="true"/>&#13; Адрес 3: <bean:write name="item" property="address.address3" filter="true"/>&#13; Адрес 4: <bean:write name="item" property="address.address4" filter="true"/>&#13; ID: <bean:write name="item" property="address.id" filter="true"/>'>
				</td>                
                <td class="text">
	                <% if(canEdit) { %>
						<html:link	page="/organizationToManagerDialog.do?action=Delete" paramId="id" paramName="item" paramProperty="id" paramScope="page">
							<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='Удалить запись'/></html:link>
					<% } %>						                    
                </td>
            </tr>

            

	      </logic:present>
      </logic:iterate>

	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1" width="100%">
			<TR>
				<TD class="find-filter">
					<% if(canEdit) { %>
						<html:link page="/organizationToManagerDialog.do?action=Add" paramId="organizationID" paramName="OrganizationToManagerListForm" paramProperty="organizationID">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/></html:link>
					<% } %>
					<html:link page="/organizationList.do" styleClass="navigator">
						<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад"></html:link>									
				</TD>
				<TH class="find-filter" align="right">отобрано записей: <%= posListSize %></TH>
				<TD class="find-filter">&nbsp;</TD>
            </TR>
		</TABLE>
		</td>
	</tr>
      
</table>

</html:form>
<script language="javascript">
	//switchFilter();
	loadSelectedRow();
	window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>
