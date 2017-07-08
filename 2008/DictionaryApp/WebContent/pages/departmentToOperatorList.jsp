<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.vtb.security.forms.*, com.vtb.value.*"%>
<%
	java.lang.String gColSpan = "10";
	DepartmentToOperatorListForm listForm = (DepartmentToOperatorListForm)request.getSession().getAttribute("DepartmentToOperatorListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.DEPARTMENT_TO_OPERATOR_LIST);
	int posListSize = posList.size();//���-�� �������.
	//������������� ����� ������ ���� "������������� �������������"
	boolean canEdit = request.isUserInRole("administratorUsers");
%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>������������ ��� �������</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="../common/dialog.js" type="text/javascript"></SCRIPT> 
	<H3 id='bread-crumb'>
		<html:link page="/departmentList.do" styleClass="navigator">���������� ��������</html:link> &gt;
			 ������������ ��� �������: <I><bean:write name="DepartmentToOperatorListForm" property="departmentVO.fullName"/></I> &gt;
	</H3><br>
<html:form action="/departmentToOperatorList.do" styleId="listForm">
<html:errors/>
<html:hidden property="departmentId"/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID" value="0"/>
<%@include file="../secure/layouts/tableJS.jspf"%>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">

	
	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table" cellpadding="2">
				<tr>
					<th class="find-filter">�����</th>
					<td class="find-filter">
						<html:text styleClass="search" property="searchStr" size="25"/>
						<%--july:searchbutton/--%>
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='�����'>
					</td>
					<td class="find-filter" nowrap>
					<%
						String[] a = { "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�" };
						for (int i = 0; i < a.length; i++) {%>
							<A href="javascript:toggleA('<%= a[i]%>')"><%= a[i]%></A>
							<%if(a[i].equals("�")){%><BR><%}%>
					<%}%>
					</td>
					<td class="find-filter" nowrap>
						&nbsp;&nbsp;&nbsp;<A href="javascript:toggleA('')">&nbsp;���&nbsp;</A>&nbsp;&nbsp;&nbsp;
					</td>					
					<td class="find-filter" nowrap>
					<%
						String[] b = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
						for (int i = 0; i < b.length; i++) {%>
							<A href="javascript:toggleA('<%= b[i]%>')"><%= b[i]%></A>
							<%if(b[i].equals("M")){%><BR><%}%>
					<%}%>
					</td>					
				</tr>
				<tr>
					<th class="find-filter">&nbsp;</th>
					<td class="find-filter" colspan="4">
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
						<html:link page="/departmentToOperatorDialog.do?action=Add" paramId="departmentId" paramName="DepartmentToOperatorListForm" paramProperty="departmentId">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='�������� ������'/>
						</html:link>
					<% } %>
		    		<html:link page="/departmentList.do" styleClass="navigator" >
						<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="�����">
					</html:link>    	
				</TD>
				<TH class="find-filter" align="right">�������� �������:<%= posListSize %></TH>
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
			<A title="����������� �� ���� 'id'" href="javascript:SortBy('id')">�</A>
			<%=isUp(sortBy, "id")%>
		</TD>		
		<TD class="column-head-name" nowrap>
			<A title="����������� �� ���� 'login'" href="javascript:SortBy('login')">�����</A>
			<%=isUp(sortBy, "login")%>
		</TD>
		<TD class="column-head-name">
			<A title="����������� �� ���� 'FA'" href="javascript:SortBy('FA')">�������</A>
			<%=isUp(sortBy, "FA")%>
		</TD>
		<TD class="column-head-name">
			<A title="����������� �� ���� 'IM'" href="javascript:SortBy('IM')">���</A>
			<%=isUp(sortBy, "IM")%>
		</TD>
		<TD class="column-head-name">
			<A title="����������� �� ���� 'OT'" href="javascript:SortBy('OT')">��������</A>
			<%=isUp(sortBy, "OT")%>
		</TD>
		<TD class="column-head-name">
			<A title="����������� �� ���� 'eMail'" href="javascript:SortBy('eMail')">eMail</A>
			<%=isUp(sortBy, "eMail")%>
		</TD>		
		<TD class="column-head-name">����</TD>										
        <TD class="column-head-name">&nbsp;</TD>
    </tr>




        <!-- Table body -->
    <logic:iterate id="item" name="<%=BeanKeys.DEPARTMENT_TO_OPERATOR_LIST%>" type="com.vtb.domain.Operator">
        <logic:present name="item">
            <tr id='<bean:write name="item" property="id" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
            	<td class="text">
            	<% if(canEdit) { %>
                    <html:link page="/departmentToOperatorDialog.do?action=Edit" paramId="id" paramName="item" paramProperty="id" paramScope="page">            	
                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='�������� ������'></html:link>
                <% } else { %>
                    <html:link page="/departmentToOperatorDialog.do?action=View" paramId="id" paramName="item" paramProperty="id" paramScope="page">            	
                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='�������� ������'></html:link>
                <% } %>                
            	</td>
                <td class="text">
                    <bean:write name="item" property="id" filter="true"/>
                </td>
                <td class="text">
                    <bean:write name="item" property="login" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="fieldFA" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="fieldIM" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="fieldOT" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="item" property="EMail" filter="true"/>
                </td>
                <td class="text">
                    <html:link page="/operatorToRoleList.do" paramId="id" paramName="item" paramProperty="id" paramScope="page">
                        ����</html:link>
                </td>
                
                <td class="text">
					<% if(canEdit) { %>                    
						<html:link page="/departmentToOperatorDialog.do?action=Delete" paramId="id" paramName="item" paramProperty="id" paramScope="page">
							<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='������� ������'/></html:link>
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
						<html:link page="/departmentToOperatorDialog.do?action=Add" paramId="departmentId" paramName="DepartmentToOperatorListForm" paramProperty="departmentId">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='�������� ������'/>
						</html:link>
					<% } %>
		    		<html:link page="/departmentList.do" styleClass="navigator" >
						<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="�����">
					</html:link>    	
				</TD>
				<TH class="find-filter" align="right">�������� �������:<%= posListSize %></TH>
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
