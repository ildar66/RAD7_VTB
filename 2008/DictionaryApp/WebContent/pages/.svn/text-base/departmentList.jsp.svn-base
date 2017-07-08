<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.vtb.security.forms.*, com.vtb.value.*"%>

<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Справочник филиалов</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="../common/dialog.js" type="text/javascript"></SCRIPT> 
<%
 	java.lang.String gColSpan = "7";
 	DepartmentListForm listForm = (DepartmentListForm)session.getAttribute("DepartmentListForm");
 	String sortBy = listForm.getOrderBy();
 	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.DEPARTMENT_LIST);
 	int posListSize = posList.size();//кол-во позиций.
	//paging:
	int pageSize = (posListSize > 300)? 25 : 23 ;//кол-во позиций на странице.
	int pages = (posListSize%pageSize == 0) ? (posListSize/pageSize) : (posListSize/pageSize + 1);//кол-во страниц.
	//редактировать может только роль "Администратор Справочников"
	boolean canEdit = request.isUserInRole("adminDictionary"); 		
 %>
<H3 id='bread-crumb'>
	Справочник филиалов &gt;
</H3><br>
<html:form action="/departmentList.do" styleId="listForm">
<html:errors/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID" value="0"/>
<%@include file="../secure/layouts/tableJS.jspf"%>
<script language="javascript">
//отображение страницы позиций:
var numEndRow = 1;
function showPage(page) {
	var posListSize = <%= posListSize%>;
	var pageSize = <%= pageSize%>;
	var end = tableID.rows.length - numEndRow;
	var start = end - posListSize;
	for(var i = start; i < end; i++){
		if(i >= start + (page-1)*pageSize && i < start + page*pageSize){
			tableID.rows[i].style.setAttribute("display", "block");			 
	 	}else{
			tableID.rows[i].style.setAttribute("display", "none");
		}
	}
	listForm.pageNumber.value = page;
}
//отображение всех страниц позиций:
function showAllPage() {
	var posListSize = <%= posListSize%>;
	var end = tableID.rows.length - numEndRow;
	var start = end - posListSize;
	for(var i = start; i < end; i++){
		tableID.rows[i].style.setAttribute("display", "block");			 
	}
	listForm.pageNumber.value = "все";
}
</script>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">

	
	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
					<th class="find-filter">Наименование</th>
					<td class="find-filter">
						<html:text styleClass="search" property="searchStr" size="25"/>
						<%--july:searchbutton/--%>
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>
					</td>
					<td class="find-filter" nowrap>
					<%
						String[] a = { "А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Э", "Ю", "Я" };
						for (int i = 0; i < a.length; i++) {%>
							<A href="javascript:toggleA('<%= a[i]%>')"><%= a[i]%></A>
							<%if(a[i].equals("Н")){%><BR><%}%>
					<%}%>
					&nbsp;&nbsp;&nbsp;<A href="javascript:toggleA('')">Все</A>
					</td>
				</tr>
				<tr>
					<th class="find-filter">филиала:</th>
					<td class="find-filter" colspan="2">
						<html:radio property="activeState" value="ALL"/>Все
						<html:radio property="activeState" value="Y"/>Активные
						<html:radio property="activeState" value="N"/>Не активные
					</td>
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
						<html:link page="/departmentDialog.do?action=Add">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/></html:link>				
					<% } %>
				</TD>
				<TH class="find-filter" align="left">отобрано записей: <%= posListSize %></TH>
				<TH class="find-filter" align="right">
					<%if(posListSize > 0){%>
						Страница: <INPUT TYPE="TEXT" NAME="pageNumber" VALUE="все" READONLY="readonly" class="editdisabled" style="width: 20pt; font-size: 80%;">
						<% for(int i = 1; i <= pages; i++){ %>
							<%--A name="pagePos_<%=i%>" class="button" onmouseover="showPage(<%=i%>);" style="vertical-align: bottom;"><%=i%></A--%>
							<INPUT type=button value=" <%=i%> " onclick="showPage(<%=i%>);" class="buttons" style="font-size: 80%; background-color:#336699; color: white;">
						<% } %>
						<%--A name="pagePos_ALL" class="button" onmouseover="showAllPage();" style="vertical-align: bottom;">все</A--%>
						<INPUT type=button value="все" onclick="showAllPage();" class="buttons" style="font-size: 80%; background-color:#336699; color: white;">
					<% } %>				
				</TH>
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
			<A title="Сортировать по полю 'code'" href="javascript:SortBy('code')">&nbsp;Код&nbsp;</A>
			<%=isUp(sortBy, "code")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'fullName'" href="javascript:SortBy('fullName')">полное имя филиала</A>
			<%=isUp(sortBy, "fullName")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'shortName'" href="javascript:SortBy('shortName')">короткое имя филиала</A>
			<%=isUp(sortBy, "shortName")%>
		</TD>
		<TD class="column-head-name"><b>настройки</b></TD>
		<TD class="column-head-name"><B>пользователи</B></TD>		
        <TD class="column-head-name">&nbsp;</TD>
    </tr>




        <!-- Table body -->
    <logic:iterate id="item" name="<%=BeanKeys.DEPARTMENT_LIST%>" type="com.vtb.domain.Department">
        <logic:present name="item">
            <tr id='<bean:write name="item" property="id" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
            	<td class="text">
	            	<% if(canEdit) { %>
	                    <html:link page="/departmentDialog.do?action=Edit" paramId="id" paramName="item" paramProperty="id" paramScope="page">            	
	                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></html:link>
	                <% } else { %>
	                    <html:link page="/departmentDialog.do?action=View" paramId="id" paramName="item" paramProperty="id" paramScope="page">            	
	                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Просмотр записи'></html:link>
	                <% } %>	                
            	</td>
                <td class="text">
                    <bean:write name="item" property="code" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="fullName" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="shortName" filter="true"/>
                </td>
				<td class="text">
					<html:link page="/spoSettingDialog.do" paramId="id" paramName="item" paramProperty="id" paramScope="page" title="Настройки СПО">SPO</html:link>
					<html:link page="/departmentToMqSchedulerSheetList.do" paramId="departmentId" paramName="item" paramProperty="id" paramScope="page" title="График передачи файлов">MQSS</html:link>
                </td>
				<td class="text">
					<html:link page="/departmentToOperatorList.do" paramId="departmentId" paramName="item" paramProperty="id" paramScope="page">
                       	Пользователи</html:link>
                </td>
                <td class="text">
                    <% if(canEdit) { %>
						<html:link	page="/departmentDialog.do?action=Delete" paramId="id" paramName="item"	paramProperty="id" paramScope="page">
							<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='Удалить запись'/></html:link>
					<% } %>                    
                </td>
            </tr>

            

	      </logic:present>
      </logic:iterate>

	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
			<TR>
				<TD class="find-filter">
					<% if(canEdit) { %>
						<html:link page="/departmentDialog.do?action=Add">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/></html:link>
					<% } %>				
				</TD>
				<TH class="find-filter" align="right">отобрано записей: <%= posListSize %></TH>
				<TD class="find-filter"><july:navigator/></TD>
            </TR>
		</TABLE>
		</td>
	</tr>
      
</table>

</html:form>
<script language="javascript">
	//switchFilter();
	loadSelectedRow();
	//window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>
