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
	<TITLE>ОКВЭД компании</TITLE>
</HEAD>
<BODY class="content">
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 
<%
 	java.lang.String gColSpan = "8";
 	OkvedHierarchyListForm listForm = (OkvedHierarchyListForm)request.getAttribute("OkvedHierarchyListForm");
 	String sortBy = listForm.getOrderBy();
 	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.OKVED_HIERARCHY_LIST);
 	int posListSize = posList.size();//кол-во позиций.
	//paging:
	int pageSize = (posListSize > 300)? 25 : 20 ;//кол-во позиций на странице.
	int pages = (posListSize%pageSize == 0) ? (posListSize/pageSize) : (posListSize/pageSize + 1);//кол-во страниц. 	
	//редактировать может только роль "Администратор Справочников"
	//boolean canEdit = request.isUserInRole("adminDictionary"); 	
 %>
<H3 id='bread-crumb'><html:link page="/okvedList.do" styleClass="navigator">ОКВЭД компании</html:link> &gt;
	иерархия для ОКВЕД: <i><bean:write name="OkvedHierarchyListForm" property="parent.name" filter="true" /></i>
</H3><br>

	<table class="framing-table">
		<tr>
			<td class="find-filter">
				<b>иерархия родителей для ОКВЕД:</b>&nbsp;
				<i><bean:write name="OkvedHierarchyListForm" property="parent.name" /></i>&nbsp;
			</td>
			<logic:present name="<%=BeanKeys.OKVED_PARENT_HIERARCHY_LIST%>">
			<td class="find-filter" colspan="2">
				<UL>
				<logic:iterate id="item" name="<%=BeanKeys.OKVED_PARENT_HIERARCHY_LIST%>"
					type="com.vtb.domain.Okved">
					<logic:present name="item">
						<UL><LI>
							<html:link page="/okvedHierarchyList.do?" paramId="parentID" paramName="item" paramProperty="id" paramScope="page" title="Список наследников ОКВЕД">
								<bean:write name="item" property="name" filter="true" /> : 
								<I><bean:write name="item" property="okved" filter="true" /></I> :
								<bean:write name="item" property="description" filter="true" />
							</html:link>
						</LI>
					</logic:present>
					<br>
				</logic:iterate> 
				</UL>		           						
			</td>
			</logic:present>
		</tr>			
	</table><br>
	
<html:form action="/okvedHierarchyList.do" styleId="listForm">
<html:errors/>
<html:hidden property="parentID"/>
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
	<caption align="left" class="text">
		<b>наследники для ОКВЕД:</b>&nbsp;
		<i><bean:write name="OkvedHierarchyListForm" property="parent.name" /></i>&nbsp;	
	</caption>	
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
				<TD class="find-filter">&nbsp;</TD>
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
			<A title="Сортировать по полю 'id'" href="javascript:SortBy('id')">&nbsp;№&nbsp;</A>
			<%=isUp(sortBy, "id")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'name'" href="javascript:SortBy('name')">Имя "ОКВЭД"</A>
			<%=isUp(sortBy, "name")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'okved'" href="javascript:SortBy('okved')">код</A>
			<%=isUp(sortBy, "okved")%>
		</TD>		
		<TD class="column-head-name">
			<A title="Сортировать по полю 'description'" href="javascript:SortBy('description')">описание</A>
			<%=isUp(sortBy, "description")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'parentID'" href="javascript:SortBy('parentID')">Родитель</A>
			<%=isUp(sortBy, "parentID")%>
		</TD>		
		<TD class="column-head-name">иерархия</TD>		
        <TD class="column-head-name">&nbsp;</TD>
    </tr>




        <!-- Table body -->
    <logic:iterate id="item" name="<%=BeanKeys.OKVED_HIERARCHY_LIST%>" type="com.vtb.domain.Okved">
        <logic:present name="item">
	            <tr id='<bean:write name="item" property="id" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
	            	<td class="text">&nbsp;</td>
	                <td class="text">
	                    <bean:write name="item" property="id" filter="true"/>
	                </td>
	                <td class="text">
	 					<bean:write name="item" property="name" filter="true"/>
	                </td>
	                <td class="text">
						<bean:write name="item" property="okved" filter="true"/>
	                </td>	                
	                <td class="text">
						<bean:write name="item" property="description" filter="true"/>
	                </td>
					<td class="text"><bean:write name="item" property="parent.name" filter="true"/></td>
					<td class="text">
						<html:link page="/okvedHierarchyList.do" styleClass="navigator" paramId="parentID" paramName="item" paramProperty="id" paramScope="page" title="Иерархия ОКВЕД">
							иерархия</html:link>
					</td>
					<td class="text">&nbsp;</td>
	            </tr>
	      </logic:present>
      </logic:iterate>

	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1" width="100%">
			<TR>
				<TD class="find-filter">&nbsp;</TD>
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
	//window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>
