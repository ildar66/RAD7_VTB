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
 	int posListSize = posList.size();//���-�� �������.
	//������������� ����� ������ ���� "������������� ������������"
	boolean canEdit = request.isUserInRole("adminDictionary");	
 %>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>�������� ��� �����������</TITLE>
</HEAD>
<BODY class="content">

<H3 id='bread-crumb'><html:link page="/organizationList.do" styleClass="navigator">���������� �����������</html:link> &gt;
	�������� ��� �����������: <I><bean:write name="OrganizationToManagerListForm" property="organizationVO.account_name"/></I> &gt;
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
						<html:radio property="activeState" value="ALL"/>���
						<html:radio property="activeState" value="Y"/>��������
						<html:radio property="activeState" value="N"/>�� ��������
					</td>
					<th class="find-filter">
						&nbsp;<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='������'>&nbsp;
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
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='�������� ������'/></html:link>
					<% } %>
					<html:link page="/organizationList.do" styleClass="navigator">
						<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="�����"></html:link>					
				</TD>
				<TH class="find-filter" align="right">�������� �������: <%= posListSize %></TH>
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
			<A title="����������� �� ���� 'id'" href="javascript:SortBy('id')">&nbsp;�&nbsp;</A>
			<%=isUp(sortBy, "id")%>
		</TD>
		<TD class="column-head-name">
			<A title="����������� �� ���� 'lastName'" href="javascript:SortBy('lastName')">���</A>
			<%=isUp(sortBy, "lastName")%>
		</TD>
		<TD class="column-head-name">
			<A title="����������� �� ���� 'title'" href="javascript:SortBy('title')">���������</A>
			<%=isUp(sortBy, "title")%>
		</TD>
		<TD class="column-head-name">
			<A title="����������� �� ���� 'reason'" href="javascript:SortBy('reason')">�� ��������� ���� ���������</A>
			<%=isUp(sortBy, "reason")%>
		</TD>
		<TD class="column-head-name" title="�����">&nbsp;<b>!</b>&nbsp;</TD>
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
	                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='�������� ������'></html:link>
	                <% } else { %>
	                    <html:link page="/organizationToManagerDialog.do?action=View" paramId="id" paramName="item" paramProperty="id" paramScope="page">            	
	                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='�������� ������'></html:link>
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
                <td class="text" title=' ����� : <bean:write name="item" property="address.city" filter="true"/>&#13; ������: <bean:write name="item" property="address.postalCode" filter="true"/>&#13; ������: <bean:write name="item" property="address.country" filter="true"/>&#13; ����� : <bean:write name="item" property="address.county" filter="true"/>&#13; ��������: <bean:write name="item" property="address.description" filter="true"/>&#13; ����� 1: <bean:write name="item" property="address.address1" filter="true"/>&#13; ����� 2: <bean:write name="item" property="address.address2" filter="true"/>&#13; ����� 3: <bean:write name="item" property="address.address3" filter="true"/>&#13; ����� 4: <bean:write name="item" property="address.address4" filter="true"/>&#13; ID: <bean:write name="item" property="address.id" filter="true"/>'>
                	<IMG SRC='<%=request.getContextPath()%>/images/more.gif' BORDER='0'
                		 title=' ����� : <bean:write name="item" property="address.city" filter="true"/>&#13; ������: <bean:write name="item" property="address.postalCode" filter="true"/>&#13; ������: <bean:write name="item" property="address.country" filter="true"/>&#13; ����� : <bean:write name="item" property="address.county" filter="true"/>&#13; ��������: <bean:write name="item" property="address.description" filter="true"/>&#13; ����� 1: <bean:write name="item" property="address.address1" filter="true"/>&#13; ����� 2: <bean:write name="item" property="address.address2" filter="true"/>&#13; ����� 3: <bean:write name="item" property="address.address3" filter="true"/>&#13; ����� 4: <bean:write name="item" property="address.address4" filter="true"/>&#13; ID: <bean:write name="item" property="address.id" filter="true"/>'>
				</td>                
                <td class="text">
	                <% if(canEdit) { %>
						<html:link	page="/organizationToManagerDialog.do?action=Delete" paramId="id" paramName="item" paramProperty="id" paramScope="page">
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
						<html:link page="/organizationToManagerDialog.do?action=Add" paramId="organizationID" paramName="OrganizationToManagerListForm" paramProperty="organizationID">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='�������� ������'/></html:link>
					<% } %>
					<html:link page="/organizationList.do" styleClass="navigator">
						<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="�����"></html:link>									
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
	window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>
