<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<HTML>
<HEAD>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>

	<TITLE>������ ��������</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "OrganizationGroupDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "��������� ������";
%>

<H3 id='bread-crumb'><html:link page="/organizationGroupList.do" styleClass="navigator">������ ��������</html:link> &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

<html:form action="/organizationGroupProcess.do" focus="name">
<html:errors/>
<html:hidden property="action"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "������� ������"; %>
</logic:equal>
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/validate.js" type="text/javascript"></SCRIPT> 
<script language="javascript">
	function Check(){
		var theForm = document.<%= form %>;
		with(theForm){
			if(!field_check(theForm['id'], 'id', 3, true)) return false;
			if(!field_check(theForm['name'], '������������', 0, true)) return false;
			//if(!field_check(theForm['dateOfRegistration'], '���� ���������� ��������', 7, false)) return false;
			//if(!field_check(theForm['employees_count'], '���-�� �����������', 3, false)) return false;
			//if(!field_check(theForm['id_opf'], '��������������-�������� �����', 3, true)) return false;
			if(!field_check(theForm['industryID'], '�������', 3, true)) return false;
			if(!field_check(theForm['regionID'], '������', 3, true)) return false;
			//if(!field_check(theForm['email'], 'eMail', 5, false)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "OrganizationGroupListForm=" + document.<%= form %>['vo.id'].value;
	}
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">

    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			<html:link page="/organizationGroupList.do" styleClass="navigator" >
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="�����">
			</html:link>			
        </td>
    </tr>

	<tr>
		<td colspan="2">
			<table>
			    <tr>
			        <td class="text" colspan="2">�:</td>
			        <td class="text">
			          <html:text property="vo.id" size="20" styleId="id" readonly="true"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">��� ������:</td>
			        <td class="text">
			          <html:text property="vo.name" size="85" styleId="name"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">��� ������:</td>
			        <td class="text">
			          <html:text property="vo.type" size="85" styleId="type"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">�������� ������:</td>
			        <td class="text">
			          <html:textarea property="vo.description" rows="7" styleId="description"/>
			        </td>
			    </tr>			    
			    <tr>
			        <td class="text" colspan="2">���:</td>
			        <td class="text">
			          <html:text property="vo.inn" size="85" styleId="inn"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">����:</td>
			        <td class="text">
			          <html:text property="vo.ogrn" size="85" styleId="ogrn"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">��� ����:</td>
			        <td class="text">
			          <html:text property="vo.okpo" size="85" styleId="okpo"/>
			        </td>
			    </tr>			    			    
			    <tr>
			        <td class="text" colspan="2">�������:</td>
			        <td class="text">
						<html:select property="vo.industryID" styleId="industryID" style="width: 345pt">
							<html:option value="">&nbsp;</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.INDUSTRY_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">������:</td>
			        <td class="text">
						<html:select property="vo.regionID" styleId="regionID" style="width: 345pt">
							<html:option value="">&nbsp;</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.REGION_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">��� CRM:</td>
			        <td class="text">
			          <html:text property="vo.crmID" size="85" styleId="crmID" readonly="true"/>
			        </td>
			    </tr>		    			    			    			    			    			    			    			    			    			    			    			    
			</table>
		</td>
	</tr>
	
	<%--july:formbuttons/--%>
    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			<html:link page="/organizationGroupList.do" styleClass="navigator" >
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="�����">
			</html:link>			
        </td>
    </tr>

</table>
</html:form>

</BODY>
</HTML>