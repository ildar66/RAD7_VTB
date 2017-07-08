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
	<TITLE>����� ��������</TITLE>
</HEAD>
<BODY class="content">
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 
<%
 	java.lang.String gColSpan = "9";
 	OkvedListForm listForm = (OkvedListForm)session.getAttribute("OkvedListForm");
 	String sortBy = listForm.getOrderBy();
 	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.OKVED_LIST);
 	int posListSize = posList.size();//���-�� �������.
	//paging:
	int pageSize = (posListSize > 300)? 25 : 20 ;//���-�� ������� �� ��������.
	int pages = (posListSize%pageSize == 0) ? (posListSize/pageSize) : (posListSize/pageSize + 1);//���-�� �������. 	
	//������������� ����� ������ ���� "������������� ������������"
	boolean canEdit = request.isUserInRole("adminDictionary"); 	
 %>
<H3 id='bread-crumb'>
	����� �������� &gt;
</H3><br>
<html:form action="/okvedList.do" styleId="listForm">
<html:errors/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID" value="0"/>
<%@include file="../secure/layouts/tableJS.jspf"%>
<script language="javascript">
//����������� �������� �������:
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
//����������� ���� ������� �������:
function showAllPage() {
	var posListSize = <%= posListSize%>;
	var end = tableID.rows.length - numEndRow;
	var start = end - posListSize;
	for(var i = start; i < end; i++){
		tableID.rows[i].style.setAttribute("display", "block");			 
	}
	listForm.pageNumber.value = "���";
}
</script>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">

	
	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
					<th class="find-filter">���</th>
					<td class="find-filter">
						<html:text styleClass="search" property="searchStr" size="25"/>
						<%--july:searchbutton/--%>
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='������'>
					</td>
					<td class="find-filter" nowrap>
					<%
						String[] a = { "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�" };
						for (int i = 0; i < a.length; i++) {%>
							<A href="javascript:toggleA('<%= a[i]%>')"><%= a[i]%></A>
							<%if(a[i].equals("�")){%><BR><%}%>
					<%}%>
					&nbsp;&nbsp;&nbsp;<A href="javascript:toggleA('')">���</A>
					</td>
				</tr>
				<tr>
					<th class="find-filter">�����:</th>
					<td class="find-filter" colspan="2">
						<html:radio property="activeState" value="ALL"/>���
						<html:radio property="activeState" value="Y"/>��������
						<html:radio property="activeState" value="N"/>�� ��������
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
						<html:link page="/okvedDialog.do?action=Add">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='�������� ������'/></html:link>				
					<% } %>
				</TD>
				<TH class="find-filter" align="right">�������� �������: <%= posListSize %></TH>
				<TH class="find-filter" align="right">
					<%if(posListSize > 0){%>
						��������: <INPUT TYPE="TEXT" NAME="pageNumber" VALUE="���" READONLY="readonly" class="editdisabled" style="width: 20pt; font-size: 80%;">
						<% for(int i = 1; i <= pages; i++){ %>
							<%--A name="pagePos_<%=i%>" class="button" onmouseover="showPage(<%=i%>);" style="vertical-align: bottom;"><%=i%></A--%>
							<INPUT type=button value=" <%=i%> " onclick="showPage(<%=i%>);" class="buttons" style="font-size: 80%; background-color:#336699; color: white;">
						<% } %>
						<%--A name="pagePos_ALL" class="button" onmouseover="showAllPage();" style="vertical-align: bottom;">���</A--%>
						<INPUT type=button value="���" onclick="showAllPage();" class="buttons" style="font-size: 80%; background-color:#336699; color: white;">
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
			<A title="����������� �� ���� 'spoID'" href="javascript:SortBy('spoID')">� SPO</A>
			<%=isUp(sortBy, "spoID")%>
		</TD>
		<TD class="column-head-name" nowrap>
			<A title="����������� �� ���� 'crmID'" href="javascript:SortBy('crmID')">� CRM</A>
			<%=isUp(sortBy, "crmID")%>
		</TD>
		<TD class="column-head-name" nowrap>
			<A title="����������� �� ���� 'name'" href="javascript:SortBy('name')">��� "�����"</A>
			<%=isUp(sortBy, "name")%>
		</TD>
		<TD class="column-head-name" nowrap>
			<A title="����������� �� ���� 'okved'" href="javascript:SortBy('okved')">���</A>
			<%=isUp(sortBy, "okved")%>
		</TD>		
		<TD class="column-head-name" nowrap>
			<A title="����������� �� ���� 'description'" href="javascript:SortBy('description')">��������</A>
			<%=isUp(sortBy, "description")%>
		</TD>
		<TD class="column-head-name" nowrap>
			<A title="����������� �� ���� 'crm_parent'" href="javascript:SortBy('crm_parent')">��������</A>
			<%=isUp(sortBy, "crm_parent")%>
		</TD>		
		<TD class="column-head-name">��������</TD>		
        <TD class="column-head-name">&nbsp;</TD>
    </tr>




        <!-- Table body -->
    <logic:iterate id="item" name="<%=BeanKeys.OKVED_LIST%>" type="com.vtb.custom.OkvedTO">
        <logic:present name="item">
        	<logic:present name="item" property="spoID">
	            <tr id='<bean:write name="item" property="spoID" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
	            	<td class="text">
		            	<% if(canEdit) { %>
		                    <html:link page="/okvedDialog.do?action=Edit" paramId="id" paramName="item" paramProperty="spoID" paramScope="page">            	
		                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='�������� ������'></html:link>
		                <% } else { %>
		                    <html:link page="/okvedDialog.do?action=View" paramId="id" paramName="item" paramProperty="spoID" paramScope="page">            	
		                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='�������� ������'></html:link>
		                <% } %>	                
	            	</td>
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
						<bean:write name="item" property="okved" filter="true"/>
	                </td>	                
	                <td class="text">
						<bean:write name="item" property="description" filter="true"/>
	                </td>
					<td class="text">
						<% if(canEdit) { %>
							<html:link page="/okvedDialog.do?action=Edit" paramId="id" paramName="item" paramProperty="parent.id" paramScope="page" title="�������� ������">
								<bean:write name="item" property="parent.name" filter="true"/></html:link>
						<% } else { %>
							<html:link page="/okvedDialog.do?action=View" paramId="id" paramName="item" paramProperty="parent.id" paramScope="page" title="�������� ������">
								<bean:write name="item" property="parent.name" filter="true"/></html:link>
						<% } %>					
	                </td>
					<td class="text">
						<html:link page="/okvedHierarchyList.do" styleClass="navigator" paramId="parentID" paramName="item" paramProperty="spoID" paramScope="page" title="�������� �����">
							��������</html:link>
					</td>
					<td class="text">
		                <% if(canEdit) { %>
							<html:link page="/okvedDialog.do?action=Delete" paramId="id" paramName="item" paramProperty="spoID" paramScope="page">
								<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='������� ������'/></html:link>
						<% } %>                    
	                </td>
	            </tr>
			</logic:present>
            <logic:notPresent name="item" property="spoID">
            	<tr id='crm<bean:write name="item" property="crmID" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
					<td class="text">&nbsp;</td>
		            <td class="text"><bean:write name="item" property="spoID" filter="true"/></td>
		            <td class="text"><bean:write name="item" property="crmID" filter="true"/></td>
		            <td class="text"><bean:write name="item" property="name" filter="true"/></td>
		            <td class="text"><bean:write name="item" property="okved" filter="true"/></td>
		            <td class="text"><bean:write name="item" property="description" filter="true"/></td>
		            <td class="text"><bean:write name="item" property="parentCRM" filter="true"/></td>
		            <td class="text">&nbsp;</td>
		            <td class="text">&nbsp;</td>
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
						<html:link page="/okvedDialog.do?action=Add">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='�������� ������'/></html:link>
					<% } %>				
				</TD>
				<TH class="find-filter" align="right">�������� �������: <%= posListSize %></TH>
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
