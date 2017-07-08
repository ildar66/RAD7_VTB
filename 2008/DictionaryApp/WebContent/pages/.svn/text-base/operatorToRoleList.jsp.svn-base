<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.vtb.security.forms.*, com.vtb.value.*, com.vtb.security.actions.*"%>

<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Роли для пользователя</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 
<%
 	java.lang.String gColSpan = "7";
 	//String dialogProperty = "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes";
 	OperatorToRoleListForm listForm = (OperatorToRoleListForm)request.getAttribute("OperatorToRoleListForm");
 	String sortBy = listForm.getOrderBy();
 	//paging:
 	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.OPERATOR_TO_ROLE_ACCESS_LIST);
 	int posListSize = posList.size();//кол-во позиций.
 	int pageSize = (posListSize > 300)? 30 : 20 ;//кол-во позиций на странице.
 	int pages = (posListSize%pageSize == 0) ? (posListSize/pageSize) : (posListSize/pageSize + 1);//кол-во страниц.
 	//редактировать может только роль "Администратор ролей"
	boolean canEdit = request.isUserInRole("administratorRoles");
	boolean canApprove = request.isUserInRole("administratorApprove");
	
 %>
<H3 id='bread-crumb'>
	<html:link page="/departmentList.do" styleClass="navigator">Справочник филиалов</html:link> &gt;
	 
	<html:link page="/departmentToOperatorList.do" paramId="departmentId" paramName="OperatorToRoleListForm" paramProperty="operatorVO.departmentID" paramScope="request">
		Пользователи для: <I><bean:write name="OperatorToRoleListForm" property="departmentVO.fullName"/></I></html:link>  &gt;
		Роли  &gt;
</H3><BR>

<html:form action="/operatorToRoleList.do" styleId="listForm">
<html:errors/>
<html:hidden property="id"/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID"/>
<html:hidden property="operation" value=""/>

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
function DeleteLink(id) {
	if(confirm('Исключить роль № '+ id +'?')) {
		document.body.style.cursor="wait";
		listForm.selectedID.value = id;
		listForm.operation.value = "<%= OperatorToRoleListAction.DELETE_LINK%>";
		listForm.submit();

		return false;
	}
}
function AddLink(id) {
	listForm.selectedID.value = id;
	listForm.operation.value = "<%= OperatorToRoleListAction.ADD_LINK%>";
	document.body.style.cursor="wait";
	listForm.submit();
}
function setActiveLink(id) {
	listForm.selectedID.value = id;
	listForm.operation.value = "<%= OperatorToRoleListAction.ACTIVE_LINK%>";
	document.body.style.cursor="wait";
	listForm.submit();
}
function setPassiveLink(id) {
	listForm.selectedID.value = id;
	listForm.operation.value = "<%= OperatorToRoleListAction.PASSIVE_LINK%>";
	document.body.style.cursor="wait";
	listForm.submit();
}
function changeProcess(){
	document.body.style.cursor="wait";
	listForm.submit();
}
</script>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">
	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table" cellpadding="2">
				<tr>
					<td class="find-filter">
						<html:link page="/departmentToOperatorList.do" paramId="departmentId" paramName="OperatorToRoleListForm" paramProperty="operatorVO.departmentID" paramScope="request">
							<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад" align="middle">
						</html:link>					
						<B>Филиал :</B>&nbsp; <%= listForm.getDepartmentVO().getFullName()%>&nbsp;
					</td>
					<td class="find-filter">
						<B>Пользователь :</B>&nbsp; <%= listForm.getOperatorVO().getLogin()%>&nbsp;(<b><%= listForm.getOperatorVO().getName()%></b>)
					</td>
					<td class="find-filter">
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>
					</td>
				</tr>							
			</table>
		</TD>
	</TR>
	
        <!-- Table header -->
        <tr class="title">
			<TD><%--july:backbutton page="/ShowOperatorList.do"/--%></TD>
			<%--TD><A href='Operator2roleDialog.do?action=Add' onclick='return openDialog(this.href, "Operator2roleDialog", "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes");'><IMG SRC="/images/plus.gif" BORDER='0' ALT='Добавить роль'></A></TD--%>
			<TH class="text" colspan="<%= gColSpan %>">Текущие роли:</TH>
		</tr>

        <tr class="include">
        	<TD class="text" nowrap></TD>
			<%-- %>TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю '№'" href="javascript:SortBy('sortOrder')">№</A>
				<%=isUp(sortBy, "sortOrder")%>
			</TD--%>        
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Код'" href="javascript:SortBy('id')">&nbsp;№&nbsp;</A>
				<%=isUp(sortBy, "id")%>
			</TD>
			<TD class="text" title="Статус роли" align="center"><B>Статус</B></TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Роль'" href="javascript:SortBy(' name')">Роль</A>
				<%=isUp(sortBy, " name")%>
			</TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Процесс'" href="javascript:SortBy('ID_TYPE_PROCESS')">Процесс</A>
				<%=isUp(sortBy, "ID_TYPE_PROCESS")%>
			</TD>
			<TD class="text" title="Описание роли" align="center"><B>!</B></TD>			
            <TD class="text" title="Роли для включения">&nbsp;</TD>
        </tr>



        
        <!-- Table body -->
        <logic:iterate id="orlist" name="<%=BeanKeys.OPERATOR_TO_ROLE_LIST%>">
            <logic:present name="orlist">
            <tr id='<bean:write name="orlist" property="vo.id" filter="true"/>' class="normal" onMouseOver="className='select';" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
				<td class="text" style="background-color:#A5F3C6">&nbsp;</td>            
                <%-- td class="text">
                	<bean:write name="orlist" property="sortOrder" filter="true"/>
                </td--%>            
                <td class="text">
                	<B><bean:write name="orlist" property="vo.id" filter="true"/></B>
                </td>
                <td class="text" align="center">
                	<%--bean:write name="orlist" property="status" filter="true"/--%>
                	<logic:present name="orlist" property="status">
                		<logic:equal name="orlist" property="status" value="Y">
                			<IMG SRC="<%=request.getContextPath()%>/images/ico/3413.gif" BORDER='0' ALT='Активная роль'>
                			<% if(canApprove) { %>
								<A href='javascript:setPassiveLink("<bean:write name="orlist" property="vo.id" filter="true"/>")' title="Сделать роль пасивной"><B>Сделать роль пасивной</B></A>                		
							<% } %>
						</logic:equal>
						<logic:equal name="orlist" property="status" value="N">
							<IMG SRC="<%=request.getContextPath()%>/images/ico/3411.gif" BORDER='0' ALT='Пасивная роль'>
							<% if(canApprove) { %>
								<A href='javascript:setActiveLink("<bean:write name="orlist" property="vo.id" filter="true"/>")' title="Сделать роль активной"><B>Сделать роль активной</B></A>
							<% } %>
						</logic:equal>	
                	</logic:present>
                	<logic:notPresent name="orlist" property="status">
                		<IMG SRC="<%=request.getContextPath()%>/images/ico/3411.gif" BORDER='0' ALT='Пасивная роль'>
                		<% if(canApprove) { %>
	               			<A href='javascript:setActiveLink("<bean:write name="orlist" property="vo.id" filter="true"/>")' title="Сделать роль активной"><B>Сделать роль активной</B></A>
	               		<% } %>
					</logic:notPresent>
                </td>
                <td class="text">
                	<bean:write name="orlist" property="vo.name" filter="true"/>
                </td>
                <td class="text">
                	<bean:write name="orlist" property="processName" filter="true"/>
                </td>
                <td class="text" align="center">
                  	<IMG SRC="<%=request.getContextPath()%>/images/doc.gif" BORDER='0' ALT='Описание' title="<bean:write name="orlist" property="vo.name" filter="true"/>">                
                </td>
                <td class="text" style="background-color:#A5F3C6">
                	<% if(canEdit) { %>
						<A href='javascript:DeleteLink("<bean:write name="orlist" property="vo.id" filter="true"/>")' title="Исключить роль">
							<IMG SRC="<%=request.getContextPath()%>/images/iskl.gif" BORDER='0' ALT='Удалить роль'></A>
					<% } %>                   
                </td>
            </tr>

            <%--july:separator colspan="<%= gColSpan %>" /--%>

	        </logic:present>
        </logic:iterate>

        <!-- Table "listAnoveRoleForOperator" header -->
        <tr class="title">
			<TD><%--july:backbutton page="/ShowOperatorList.do"/--%></TD>
			<TH class="text" colspan="<%= gColSpan %>">
				Роли для включения по процессам:
				<html:select property="processID" styleId="processID" onchange="changeProcess();">
					<html:option value="ALL">все процессы</html:option>
					<html:options collection="<%= com.vtb.value.BeanKeys.PROCESS_TYPE_LIST%>" property="id" labelProperty="description"/>
				</html:select>&nbsp;&nbsp;&nbsp;
				Всего: <%= posListSize%>.&nbsp;&nbsp; 
				<%if(posListSize > 0){%>
					Страница: <INPUT TYPE="TEXT" NAME="pageNumber" VALUE="все" READONLY="readonly" class="editdisabled" style="width: 19pt; font-size: 80%;">
					<% for(int i = 1; i <= pages; i++){ %>
						<%--A name="pagePos_<%=i%>" class="button" onclick="showPage(<%=i%>);" style="vertical-align: bottom;"><%=i%></A--%>
						<INPUT type=button value=" <%=i%> " onclick="showPage(<%=i%>);" class="buttons" style="font-size: 80%; background-color:#336699; color: white;">
					<% } %>
					<%--A name="pagePos_ALL" class="button" onclick="showAllPage();" style="vertical-align: bottom;">все</A--%>
					<INPUT type=button value="все" onclick="showAllPage();" class="buttons" style="font-size: 80%; background-color:#336699; color: white;">
				<% } %>				
			</TH>
		</tr>

        <tr class="layout-manager">
        	<TD class="text" nowrap></TD>
			<%-- %>TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю '№'" href="javascript:SortBy('sortOrder')">№</A>
				<%=isUp(sortBy, "sortOrder")%>
			</TD--%>        
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Код'" href="javascript:SortBy('id')">&nbsp;№&nbsp;</A>
				<%=isUp(sortBy, "id")%>
			</TD>
			<TD class="text" nowrap>&nbsp;</TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Роль'" href="javascript:SortBy(' name')">Роль</A>
				<%=isUp(sortBy, " name")%>
			</TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Процесс'" href="javascript:SortBy('ID_TYPE_PROCESS')">Процесс</A>
				<%=isUp(sortBy, "ID_TYPE_PROCESS")%>
			</TD>
			<TD class="text" title="Описание роли" align="center"><B>!</B></TD>			
            <TD class="text" title="Роли для включения">&nbsp;</TD>
        </tr>
         
        <!-- Table "listAnoveRoleForOperator"  body -->
        <logic:iterate id="item" name="<%=BeanKeys.OPERATOR_TO_ROLE_ACCESS_LIST %>">
            <logic:present name="item">
            <tr id='<bean:write name="item" property="vo.id" filter="true"/>' class="normal" onMouseOver="className='select';" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
				<td class="text" style="background-color:#F0F0F0">&nbsp;</td>            
                <%-- %>td class="text">
                	<bean:write name="item" property="sortOrder" filter="true"/>
                </td--%>            
                <td class="text">
                	<bean:write name="item" property="vo.id" filter="true"/>
                </td>
                <td class="text">&nbsp;</td>
                <td class="text">
                	<bean:write name="item" property="vo.name" filter="true"/>
                </td>
                <td class="text">
                	<bean:write name="item" property="processName" filter="true"/>
                </td>
                <td class="text" align="center">
                  	<IMG SRC="<%=request.getContextPath()%>/images/doc.gif" BORDER='0' ALT='Описание' title="<bean:write name="item" property="vo.name" filter="true"/>">                
                </td>
                <td class="text" style="background-color:#F0F0F0">
                	<% if(canEdit) { %>
						<A href='javascript:AddLink("<bean:write name="item" property="vo.id" filter="true"/>")' title="Добавить роль">
							<IMG SRC="<%=request.getContextPath()%>/images/vkl2.gif" BORDER='0' ALT='Добавить роль'></A>
					<% } %>                   
                </td>
            </tr>

            <%--july:separator colspan="<%= gColSpan %>" /--%>

	        </logic:present>
        </logic:iterate>

        <TR class="title">
          	<TD class="text">&nbsp;</TD>
          	<%--TD><A href='roleDialog.do?action=Add' onclick='return openDialog(this.href, "roleDialog", "<%= dialogProperty%>");'><IMG SRC="/images/plus.gif" BORDER='0' ALT='Добавить роль'></A></TD--%>
          	<TD class="text" colspan="<%= gColSpan %>">&nbsp;</TD>
        </TR>
        
    </table>

</html:form>
<script language="javascript">
	//switchFilter();
	loadSelectedRow();
	//window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>