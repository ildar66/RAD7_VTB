<%@ page language = "java"%>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.vtb.dictionary.forms.*, com.vtb.value.*"%> 
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<%--script language="JavaScript" src="/SecurityApp/scripts/menu_functions.js"></script--%>
	<%--script language="JavaScript" src="/SecurityApp/scripts/collectionform.js"></script--%>

	<TITLE>Справочник типов лимитов</TITLE>
</HEAD>
<BODY class="content">
<%
	java.lang.String gColSpan = "5";
	LimitTypeListForm listForm = (LimitTypeListForm)session.getAttribute("LimitTypeListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.LIMIT_TYPE_LIST);
	int posListSize = posList.size();//кол-во позиций.
	//редактировать может только роль "Администратор Справочников"
	boolean canEdit = request.isUserInRole("adminDictionary");	
%>
<H3 id='bread-crumb'>
	Справочник типов лимитов &gt;
</H3><br>
<html:form action="/limitTypeList.do" styleId="listForm" focus="searchStr">
	<html:errors />
	<html:hidden property="orderBy" />
	<html:hidden property="selectedID" value="0" />
	<%@include file="../secure/layouts/tableJS.jspf"%>

	<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1">

		

		<TR CLASS="layout-manager">
			<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
					<th class="find-filter">Поиск по имени:</th>
					<td class="find-filter">
						<html:text styleClass="search" property="searchStr" size="25" /> &nbsp;&nbsp;&nbsp;
						<A href="javascript:toggleA('')">Все</A> &nbsp;&nbsp;
						<INPUT TYPE='image'	src='<%=request.getContextPath()%>/images/refresh.gif' onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>
					</td>
				</tr>
			</table>
			</TD>
		</TR>

		

		<tr CLASS="layout-manager">
			<td colspan="<%= gColSpan %>">
			<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1" width="100%">
				<TR>
					<TD class="find-filter">
						<% if(canEdit) { %>
							<html:link page="/limitTypeDialog.do?action=Add">
								<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись' /></html:link>
						<% } %>
					</TD>
					<TH class="find-filter">&nbsp;</TH>
					<TH class="find-filter" align="right">отобрано записей: <%=posListSize%></TH>
				</TR>
			</TABLE>
			</td>
		</tr>

		

		<!-- Table header -->
		<tr class="title">
			<td class="column-head-name" align="center" valign="middle"><img
				src="<%=request.getContextPath()%>/images/empty.gif" width="1" height="1" /></td>
			<td class="column-head-name" nowrap>
				<A title="Сортировать по полю 'id'" href="javascript:SortBy('id')">&nbsp;№&nbsp;</A>
				<%=isUp(sortBy, "id")%></td>				
			<td class="column-head-name" align="center" valign="middle"><A
				title="Сортировать по полю 'name'"
				href="javascript:SortBy('name')">Лимит</A>
				<%=isUp(sortBy, "name")%></td>
			<td class="column-head-name" align="center" valign="middle"><img
				src="<%=request.getContextPath()%>/images/empty.gif" width="1" height="1" /></td>
		</tr>

		

		<!-- Table body -->
		<logic:iterate id="item" name="<%=BeanKeys.LIMIT_TYPE_LIST%>"
			type="com.vtb.domain.LimitType">
			<logic:present name="item">
				<tr id='<bean:write name="item" property="id" filter="true"/>'
					class="normal" onMouseOver="className='select'"
					onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
					<td class="text" style="text-align: center; vertical-align: middle">
						<% if(canEdit) { %>
							<html:link page="/limitTypeDialog.do?action=Edit" paramId="id"	paramName="item" paramProperty="id" paramScope="page">
								<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></html:link>
						<% } else { %>					
							<html:link page="/limitTypeDialog.do?action=View" paramId="id"	paramName="item" paramProperty="id" paramScope="page">
								<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Просмотр записи'></html:link>
						<% } %>
					</td>
					<td class="text" style="text-align: left; vertical-align: middle">
						<bean:write name="item" property="id" /></td>
					<td class="text" style="text-align: left; vertical-align: middle">
						<bean:write name="item" property="name" /></td>
					<td class="text" style="text-align: center; vertical-align: middle">
						<% if(canEdit) { %>
							<html:link page="/limitTypeDialog.do?action=Delete" paramId="id" paramName="item" paramProperty="id" paramScope="page">
								<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='Удалить запись' /></html:link>
						<% } %>
					</td>
				</tr>

				
			</logic:present>
		</logic:iterate>

		<tr CLASS="layout-manager">
			<td colspan="<%= gColSpan %>">
			<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1" width="100%">
				<TR>
					<TD class="find-filter">
						<% if(canEdit) { %>
							<html:link page="/limitTypeDialog.do?action=Add">
								<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись' /></html:link>
						<% } %>
					</TD>
					<TD class="find-filter">&nbsp;</TD>
					<TH class="find-filter" align="right">отобрано записей: <%=posListSize%></TH>
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