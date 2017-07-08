<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.vtb.security.forms.*, com.vtb.security.actions.*, com.vtb.value.*"%>

<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Группы, в состав которых входит организация CRM</TITLE>
</HEAD>
<BODY class="content">
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT>
<script language="javascript">
	function DeleteLink(id) {
		if(confirm('Исключить организацию № '+ id +'?')) {
			document.body.style.cursor="wait";
			listForm.selectedID.value = id;
			listForm.operation.value = "<%= OrganizationCrmToGroupListAction.DELETE_LINK%>";
			listForm.submit();
	
			return false;
		}
	}
	function DeleteLinkCRM(idCRM) {
		if(confirm('Исключить организацию CRM № '+ idCRM +'?')) {
			document.body.style.cursor="wait";
			listForm.selectedID.value = idCRM;
			listForm.operation.value = "<%= OrganizationCrmToGroupListAction.DELETE_LINK_CRM%>";
			listForm.submit();
	
			return false;
		}
	}	
	function AddLink() {
		if(listForm.selectedID.value != ''){
			listForm.operation.value = "<%= OrganizationCrmToGroupListAction.ADD_LINK%>";
			document.body.style.cursor="wait";
			storeSelectedRow(listForm.selectedID.value);
			listForm.submit();
		}else{
			listForm.operation.value = "<%= OrganizationCrmToGroupListAction.ADD_LINK_CRM%>";
			document.body.style.cursor="wait";
			listForm.selectedID.value = listForm.selectedCrmID.value;
			storeSelectedRow('crm'+ listForm.selectedID.value);
			listForm.submit();
		}			
	}
</script> 
<%
 	java.lang.String gColSpan = "7";
 	OrganizationCrmToGroupListForm listForm = (OrganizationCrmToGroupListForm)request.getAttribute("OrganizationCrmToGroupListForm");
 	String sortBy = listForm.getOrderBy();
 	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.ORGANIZATION_TO_GROUP_LIST);
 	int posListSize = posList.size();//кол-во позиций.
 	//диалог "справочник групп организаций":
	String dialogProperty = "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes"; 	
	//редактировать может только роль "Администратор Справочников"
	boolean canEdit = request.isUserInRole("adminDictionary");
 %>
<H3 id='bread-crumb'><html:link page="/organizationList.do" styleClass="navigator">Справочник организаций</html:link> &gt;
	Группы, в состав которых входит организация CRM: <I><bean:write name="OrganizationCrmToGroupListForm" property="organizationCrmVO.account_name"/></I> &gt;
</H3><br>
<html:form action="/organizationCrmToGroupList.do" styleId="listForm">
<html:errors/>
<html:hidden property="orgCrmID"/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID"/>
<html:hidden property="selectedCrmID" value=""/>
<html:hidden property="operation" value=""/>

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
						<A	href='<%=request.getContextPath()%>/organizationGroupLookupList.do?formName=OrganizationCrmToGroupListForm&fieldNames=selectedID|name|selectedCrmID&onMySelect=AddLink()'
							onclick='return openDialog(this.href , "organizationLookupList", "<%= dialogProperty%>");'>
							<IMG SRC="<%=request.getContextPath()%>/images/vkl2.gif" BORDER='0' ALT='Добавить клиента из Справочника организаций'></A>				
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
			<A title="Сортировать по полю 'spoID'" href="javascript:SortBy('spoID')">&nbsp;№ SPO&nbsp;</A>
			<%=isUp(sortBy, "spoID")%>
		</TD>
		<TD class="column-head-name" nowrap>
			<A title="Сортировать по полю 'crmID'" href="javascript:SortBy('crmID')">&nbsp;№ CRM&nbsp;</A>
			<%=isUp(sortBy, "crmID")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'name'" href="javascript:SortBy('name')">Имя группы</A>
			<%=isUp(sortBy, "name")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'type'" href="javascript:SortBy('type')">Тип группы</A>
			<%=isUp(sortBy, "type")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'description'" href="javascript:SortBy('description')">описание</A>
			<%=isUp(sortBy, "description")%>
		</TD>
        <TD class="column-head-name">&nbsp;</TD>
    </tr>




        <!-- Table body -->
    <logic:iterate id="item" name="<%=BeanKeys.ORGANIZATION_TO_GROUP_LIST%>" type="com.vtb.custom.OrganizationGroupTO">
        <logic:present name="item">
	        <logic:present name="item" property="spoID">
	            <tr id='<bean:write name="item" property="spoID" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
	            	<td class="text">&nbsp;&nbsp;</td>
		            <td class="text">
		                <bean:write name="item" property="spoID" filter="true"/>
		            </td>
		            <td class="text">
		                <bean:write name="item" property="crmID" filter="true"/>
		            </td>
	                <td class="text">
	 					<bean:write name="item" property="name" filter="true"/>
	                </td>
	                <td class="text">
						<bean:write name="item" property="type" filter="true"/>
	                </td>
	                <td class="text">
						<bean:write name="item" property="description" filter="true"/>
	                </td>
	                <td class="text">
		                <% if(canEdit) { %>
							<A href='javascript:DeleteLink("<bean:write name="item" property="spoID" filter="true"/>")' title="Удалить связь">
								<IMG SRC="<%=request.getContextPath()%>/images/iskl.gif" BORDER='0' ALT='Удалить связь'></A>
						<% } %>                    
	                </td>
	            </tr>
	          </logic:present>
	          <logic:notPresent name="item" property="spoID">
	          	<tr id='crm<bean:write name="item" property="crmID" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
	            	<td class="text">&nbsp;&nbsp;</td>
		            <td class="text">
		                <bean:write name="item" property="spoID" filter="true"/>
		            </td>
		            <td class="text">
		                <bean:write name="item" property="crmID" filter="true"/>
		            </td>
	                <td class="text">
	 					<bean:write name="item" property="name" filter="true"/>
	                </td>
	                <td class="text">
						<bean:write name="item" property="type" filter="true"/>
	                </td>
	                <td class="text">
						<bean:write name="item" property="description" filter="true"/>
	                </td>
	                <td class="text">
		                <% if(canEdit) { %>
							<A href='javascript:DeleteLinkCRM("<bean:write name="item" property="crmID" filter="true"/>")' title="Удалить связь c CRM">
								<IMG SRC="<%=request.getContextPath()%>/images/iskl.gif" BORDER='0' ALT='Удалить связь c CRM'></A>
						<% } %>                    
	                </td>	          	
            	</tr>
            </logic:notPresent>	          
	      </logic:present>
      </logic:iterate>

	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1" width="100%">
			<TR>
				<TD class="find-filter">
					<% if(canEdit) { %>
						<A	href='<%=request.getContextPath()%>/organizationGroupLookupList.do?formName=OrganizationCrmToGroupListForm&fieldNames=selectedID|name|selectedCrmID&onMySelect=AddLink()'
							onclick='return openDialog(this.href , "organizationLookupList", "<%= dialogProperty%>");'>
							<IMG SRC="<%=request.getContextPath()%>/images/vkl2.gif" BORDER='0' ALT='Добавить клиента из Справочника организаций'></A>				
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
