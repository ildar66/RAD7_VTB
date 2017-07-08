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
	<TITLE>Справочник организаций</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="../common/dialog.js" type="text/javascript"></SCRIPT> 
<%
 	java.lang.String gColSpan = "7";
 	OrganizationLookupListForm listForm = (OrganizationLookupListForm)session.getAttribute("OrganizationLookupListForm");
 	String sortBy = listForm.getOrderBy();
 	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.ORGANIZATION_LOOKUP_LIST);
 	int posListSize = posList.size();//кол-во позиций.
	//paging:
	int pageSize = (posListSize > 300)? 25 : 20 ;//кол-во позиций на странице.
	int pages = (posListSize%pageSize == 0) ? (posListSize/pageSize) : (posListSize/pageSize + 1);//кол-во страниц. 	
 %>
<H3 id='bread-crumb'>
	<IMG SRC="<%=request.getContextPath()%>/images/cancel.gif" BORDER='0' ALT='Закрыть окно' onclick="document.body.style.cursor='auto'; if (opener != null) {opener.focus();} window.close();">
	<IMG SRC="<%=request.getContextPath()%>/images/empty.gif" BORDER='0' ALT='' WIDTH='3'>
	Справочник организаций
</H3><br>
<html:form action="/organizationLookupList.do" styleId="listForm">
<html:errors/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID" value="0"/>
<%@include file="../secure/layouts/tableJS.jspf"%>

<html:hidden property="formName"/>
<html:hidden property="fieldNames"/>
<html:hidden property="onMySelect"/>

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
function Go(strval) {
	var thisform = document.listForm;
	var outform = window.opener.document.forms[thisform.formName.value];
	
	if(outform != null)
	{
		var names = thisform.fieldNames.value.split('|'), values = strval.split('|');
		for(var i in names) {
			if(names[i].length > 0)
				outform[names[i]].value = unescape(values[i]);
		}
	}
	Close();
	onMySelect();
}
function Close(){
	var thisform = document.listForm;
	var outform = window.opener.document.forms[thisform.formName.value];
	if(outform != null) {
		document.body.style.cursor="wait";
		window.opener.focus();
	}
	window.close();
}
function onMySelect(){
	if(document.all.onMySelect.value != null && document.all.onMySelect.value != ""){
		opener.execScript(document.all.onMySelect.value);
	}
}
</script>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1">

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
					<th class="find-filter">организации:</th>
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
				<TH class="find-filter" align="right">отобрано записей: <%= posListSize %></TH>
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
			<A title="Сортировать по полю 'spoID'" href="javascript:SortBy('spoID')">№ SPO</A>
			<%=isUp(sortBy, "spoID")%>
		</TD>
		<TD class="column-head-name" nowrap>
			<A title="Сортировать по полю 'crmID'" href="javascript:SortBy('crmID')">№ CRM</A>
			<%=isUp(sortBy, "crmID")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'ORGANIZATIONNAME'" href="javascript:SortBy('ORGANIZATIONNAME')">Наименование</A>
			<%=isUp(sortBy, "ORGANIZATIONNAME")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'FULLORGANIZATIONNAME'" href="javascript:SortBy('FULLORGANIZATIONNAME')">полное юридическое Наименование</A>
			<%=isUp(sortBy, "FULLORGANIZATIONNAME")%>
		</TD>
        <TD class="column-head-name">&nbsp;</TD>
    </tr>


    <!-- Table body -->
    <logic:iterate id="item" name="<%=BeanKeys.ORGANIZATION_LOOKUP_LIST%>" type="com.vtb.custom.OrganizationTO">
        <logic:present name="item">
	        <logic:present name="item" property="spoID">
	            <tr id='<bean:write name="item" property="spoID" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
	            	<td class="text">&nbsp;</td>
		            <td class="text">
		                <bean:write name="item" property="spoID" filter="true"/>
		            </td>
		            <td class="text">
		                <bean:write name="item" property="crmID" filter="true"/>
		            </td>
	                <td class="text">
						<A href="javascript:Go('<bean:write name="item" property="spoID" filter="true"/>|<bean:write name="item" property="name" filter="true"/>|<bean:write name="item" property="crmID" filter="true"/>')" title="Выберите запись">                
							<bean:write name="item" property="name" filter="true"/></A>
	                </td>
	                <td class="text">
						<bean:write name="item" property="fullName" filter="true"/>
	                </td>
	                <td class="text">&nbsp;</td>
	            </tr>
	         </logic:present>
 			 <logic:notPresent name="item" property="spoID">
            	<tr id='crm<bean:write name="item" property="crmID" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
					<td class="text">&nbsp;</td>
		            <td class="text"><bean:write name="item" property="spoID" filter="true"/></td>
		            <td class="text"><bean:write name="item" property="crmID" filter="true"/></td>
	                <td class="text">
						<A href="javascript:Go('<bean:write name="item" property="spoID" filter="true"/>|<bean:write name="item" property="name" filter="true"/>|<bean:write name="item" property="crmID" filter="true"/>')" title="Выберите запись">                
							<bean:write name="item" property="name" filter="true"/></A>
	                </td>
	                <td class="text">
						<bean:write name="item" property="fullName" filter="true"/>
	                </td>
	                <td class="text">&nbsp;</td>					            
            	</tr> 			 
 			 </logic:notPresent>         
	    </logic:present>
    </logic:iterate>

	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1" width="100%">
			<TR>
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
