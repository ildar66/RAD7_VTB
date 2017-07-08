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
	<TITLE>����������� ��� ������</TITLE>
</HEAD>
<BODY class="content">
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT>
<script language="javascript">
	function DeleteLink(id) {
		if(confirm('��������� ��������� SPO �: '+ id +'?')) {
			document.body.style.cursor="wait";
			listForm.selectedID.value = id;
			listForm.operation.value = "<%= GroupToOrganizationListAction.DELETE_LINK%>";
			listForm.submit();
			return false;
		}
	}
	function DeleteLinkCRM(idCRM) {
		if(confirm('��������� ��������� CRM �: '+ idCRM +'?')) {
			document.body.style.cursor="wait";
			listForm.selectedID.value = idCRM;
			listForm.operation.value = "<%= GroupToOrganizationListAction.DELETE_LINK_CRM%>";
			listForm.submit();
			return false;
		}		
	}
	function AddLink() {
		if(listForm.selectedID.value != ''){
			listForm.operation.value = "<%= GroupToOrganizationListAction.ADD_LINK%>";
			document.body.style.cursor="wait";
			storeSelectedRow(listForm.selectedID.value);
			listForm.submit();
		}else{
			listForm.operation.value = "<%= GroupToOrganizationListAction.ADD_LINK_CRM%>";
			document.body.style.cursor="wait";
			listForm.selectedID.value = listForm.selectedCrmID.value;
			storeSelectedRow('crm'+ listForm.selectedID.value);
			listForm.submit();
		}
	}
</script> 
<%
 	java.lang.String gColSpan = "7";
 	GroupToOrganizationListForm listForm = (GroupToOrganizationListForm)request.getAttribute("GroupToOrganizationListForm");
 	String sortBy = listForm.getOrderBy();
 	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.GROUP_TO_ORGANIZATION_LIST);
 	int posListSize = posList.size();//���-�� �������.
 	//������ "���������� �����������":
	String dialogProperty = "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes";
	//������������� ����� ������ ���� "������������� ������������"
	boolean canEdit = request.isUserInRole("adminDictionary");	
 %>
<H3 id='bread-crumb'><html:link page="/organizationGroupList.do" styleClass="navigator">������ ��������</html:link> &gt;
	����������� ��� ������: <I><bean:write name="GroupToOrganizationListForm" property="groupVO.name"/></I> &gt;
</H3><br>
<html:form action="/groupToOrganizationList.do" styleId="listForm">
<html:errors/>
<html:hidden property="groupID"/>
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
						<A	href='<%=request.getContextPath()%>/organizationLookupList.do?formName=GroupToOrganizationListForm&fieldNames=selectedID|name|selectedCrmID&onMySelect=AddLink()' 
							onclick='return openDialog(this.href , "organizationLookupList", "<%= dialogProperty%>");'>
							<IMG SRC="<%=request.getContextPath()%>/images/vkl2.gif" BORDER='0' ALT='�������� ������� �� ����������� �����������'></A>				
					<% } %>
					<html:link page="/organizationGroupList.do" styleClass="navigator">
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
			<A title="����������� �� ���� 'spoID'" href="javascript:SortBy('spoID')">� SPO</A>
			<%=isUp(sortBy, "spoID")%>
		</TD>
		<TD class="column-head-name" nowrap>
			<A title="����������� �� ���� 'crmID'" href="javascript:SortBy('crmID')">� CRM</A>
			<%=isUp(sortBy, "crmID")%>
		</TD>
		<TD class="column-head-name">
			<A title="����������� �� ���� '������������'" href="javascript:SortBy('ORGANIZATIONNAME')">������������</A>
			<%=isUp(sortBy, "ORGANIZATIONNAME")%>
		</TD>
		<TD class="column-head-name">
			<A title="����������� �� ���� '������ ����������� ������������'" href="javascript:SortBy('FULLORGANIZATIONNAME')">������ ����������� ������������</A>
			<%=isUp(sortBy, "FULLORGANIZATIONNAME")%>
		</TD>
        <TD class="column-head-name">&nbsp;</TD>
    </tr>




        <!-- Table body -->
    <logic:iterate id="item" name="<%=BeanKeys.GROUP_TO_ORGANIZATION_LIST%>" type="com.vtb.custom.OrganizationTO">
        <logic:present name="item">
            <logic:present name="item" property="spoID">        
	            <tr id='<bean:write name="item" property="spoID" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
	            	<td class="text">
	                    <html:link page="/organizationInfo.do?action=View" paramId="id" paramName="item" paramProperty="spoID" paramScope="page" onclick="return openDialog(this.href, 'organizationInfo', '<%= dialogProperty%>');">            	
	                    	<IMG SRC='<%=request.getContextPath()%>/images/more.gif' BORDER='0' ALT='�������� ������'></html:link>
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
						<bean:write name="item" property="fullName" filter="true"/>
	                </td>
	                <td class="text">
		                <% if(canEdit) { %>
							<A href='javascript:DeleteLink("<bean:write name="item" property="spoID" filter="true"/>")' title="������� �����">
								<IMG SRC="<%=request.getContextPath()%>/images/iskl.gif" BORDER='0' ALT='������� �����'></A>
						<% } %>						                    
	                </td>
	            </tr>
	         </logic:present>
	         
 			 <logic:notPresent name="item" property="spoID">
            	<tr id='crm<bean:write name="item" property="crmID" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
					<td class="text">
	                    <html:link page="/organizationCrmInfo.do?action=View" paramId="idCRM" paramName="item" paramProperty="crmID" paramScope="page" onclick="return openDialog(this.href, 'organizationInfo', 'top=50, left=350, width=350, height=600, scrollbars=yes, resizable=yes');">            	
	                    	<IMG SRC='<%=request.getContextPath()%>/images/more.gif' BORDER='0' ALT='�������� ������'></html:link>		            
					</td>
		            <td class="text"><bean:write name="item" property="spoID" filter="true"/></td>
		            <td class="text"><bean:write name="item" property="crmID" filter="true"/></td>
	                <td class="text">
						<bean:write name="item" property="name" filter="true"/>
	                </td>
	                <td class="text">
						<bean:write name="item" property="fullName" filter="true"/>
	                </td>
	                <td class="text">
		                <% if(canEdit) { %>
							<A href='javascript:DeleteLinkCRM("<bean:write name="item" property="crmID" filter="true"/>")' title="������� ����� c CRM">
								<IMG SRC="<%=request.getContextPath()%>/images/iskl.gif" BORDER='0' ALT='������� ����� c CRM'></A>
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
						<A	href='<%=request.getContextPath()%>/organizationLookupList.do?formName=GroupToOrganizationListForm&fieldNames=selectedID|name|selectedCrmID&onMySelect=AddLink()'
							onclick='return openDialog(this.href , "organizationLookupList", "<%= dialogProperty%>");'>
							<IMG SRC="<%=request.getContextPath()%>/images/vkl2.gif" BORDER='0' ALT='�������� ������� �� ����������� �����������'></A>
					<% } %>
					<html:link page="/organizationGroupList.do" styleClass="navigator">
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
