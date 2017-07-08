<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.vtb.security.forms.*, com.vtb.value.*"%>
<%
	java.lang.String gColSpan = "9";
	DepartmentToMqSchedulerSheetListForm listForm = (DepartmentToMqSchedulerSheetListForm)request.getSession().getAttribute("DepartmentToMqSchedulerSheetListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.DEPARTMENT_TO_MQ_SCHEDULER_SHEET_LIST);
	int posListSize = posList.size();//кол-во позиций.
	//редактировать может только роль "Администратор Справочников"
	boolean canEdit = request.isUserInRole("adminDictionary");	
%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Пользователи для филиала</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="../common/dialog.js" type="text/javascript"></SCRIPT> 
	<H3 id='bread-crumb'>
		<html:link page="/departmentList.do" styleClass="navigator">Справочник филиалов</html:link> &gt;
			 Настройки MQSS для филиала: <I><bean:write name="DepartmentToMqSchedulerSheetListForm" property="departmentVO.fullName"/></I> &gt;
	</H3><br>
<html:form action="/departmentToMqSchedulerSheetList.do" styleId="listForm">
<html:errors/>
<html:hidden property="departmentId"/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID" value="0"/>
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
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>
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
						<html:link page="/mqSchedulerSheetDialog.do?action=Add" paramId="departmentId" paramName="DepartmentToMqSchedulerSheetListForm" paramProperty="departmentId">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/></html:link>
					<% } %>
		    		<html:link page="/departmentList.do" styleClass="navigator" >
						<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
					</html:link>    	
				</TD>
				<TH class="find-filter" align="right">&nbsp;отобрано записей: <%= posListSize %></TH>
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
			<A title="Сортировать по полю 'id'" href="javascript:SortBy('id')">№</A>
			<%=isUp(sortBy, "id")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'START_TIME'" href="javascript:SortBy('START_TIME')">начало Периода</A>
			<%=isUp(sortBy, "START_TIME")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'END_TIME'" href="javascript:SortBy('END_TIME')">конец Периода</A>
			<%=isUp(sortBy, "END_TIME")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'DAYS_OF_WEEK'" href="javascript:SortBy('DAYS_OF_WEEK')">дни недели</A>
			<%=isUp(sortBy, "DAYS_OF_WEEK")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'status'" href="javascript:SortBy('status')">статус</A>
			<%=isUp(sortBy, "status")%>
		</TD>
        <TD class="column-head-name">&nbsp;</TD>
    </tr>




        <!-- Table body -->
    <logic:iterate id="item" name="<%=BeanKeys.DEPARTMENT_TO_MQ_SCHEDULER_SHEET_LIST%>" type="com.vtb.domain.MQSchedulerSheet">
        <logic:present name="item">
            <tr id='<bean:write name="item" property="id" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
            	<td class="text">
	            	<% if(canEdit) { %>
	                    <html:link page="/mqSchedulerSheetDialog.do?action=Edit" paramId="id" paramName="item" paramProperty="id" paramScope="page">            	
	                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></html:link>
	                <% } else { %>
	                    <html:link page="/mqSchedulerSheetDialog.do?action=View" paramId="id" paramName="item" paramProperty="id" paramScope="page">            	
	                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Просмотр записи'></html:link>
	                <% } %>                
            	</td>
                <td class="text">
                    <bean:write name="item" property="id" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="startTime" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="endTime" filter="true"/>
                </td>
                <td class="text">
					<%--bean:write name="item" property="daysOfWeek" filter="true"/--%>
					<%= DepartmentToMqSchedulerSheetListForm.getDaysOfWeekString(item.getDaysOfWeek())%>
                </td>
                <td class="text">
                   	<logic:equal name="item" property="status" value="1">активный</logic:equal>
					<logic:equal name="item" property="status" value="0">неактивный</logic:equal>
                </td>

                <td class="text">
                    <% if(canEdit) { %>
						<html:link	page="/mqSchedulerSheetDialog.do?action=Delete" paramId="id" paramName="item" paramProperty="id" paramScope="page">
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
						<html:link page="/mqSchedulerSheetDialog.do?action=Add" paramId="departmentId" paramName="DepartmentToMqSchedulerSheetListForm" paramProperty="departmentId">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
						</html:link>
					<% } %>
		    		<html:link page="/departmentList.do" styleClass="navigator" >
						<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
					</html:link>    	
				</TD>
				<TH class="find-filter" align="right">отобрано записей:<%= posListSize %></TH>
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
