<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>

	<TITLE>���������� ��������</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "MqSchedulerSheetDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "��������� ������";
%>

<H3 id='bread-crumb'>
	<html:link page="/departmentList.do" styleClass="navigator">���������� ��������</html:link> &gt;
	<html:link page="/departmentToMqSchedulerSheetList.do" paramId="departmentId" paramName="MqSchedulerSheetDialogForm" paramProperty="departmentVO.id" paramScope="request">
	 ��������� MQSS ��� �������: <I><bean:write name="MqSchedulerSheetDialogForm" property="departmentVO.fullName"/></I> </html:link> &gt;
	<bean:write name="<%= form%>"/> MQSS :
</H3><br>

<html:form action="/mqSchedulerSheetProcess.do">
<html:errors/>
<html:hidden property="action"/>
<html:hidden property="departmentId"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "������� ������"; %>
</logic:equal>
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/validate.js" type="text/javascript"></SCRIPT> 
<script language="javascript">
	function Check(){
		var theForm = document.<%= form %>;
		with(theForm){
			if(!field_check(theForm['vo.id_department'], 'id', 0, true)) return false;
			if(!field_check(theForm['startTime'], '������ �������', 9, true)) return false;
			if(!field_check(theForm['endTime'], '����� �������', 9, true)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "DepartmentToMqSchedulerSheetListForm=" + document.<%= form %>['vo.id'].value;
	}
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">

    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			<html:link page="/departmentToMqSchedulerSheetList.do" paramId="departmentId" paramName="MqSchedulerSheetDialogForm" paramProperty="departmentVO.id" paramScope="request">
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
			          <html:text property="vo.id" size="20" readonly="true"/>
			        </td>
			    </tr>			
			    <tr>
			        <td class="text" colspan="2">��� �������:</td>
			        <td class="text">
			          <html:text property="vo.id_department" size="20" readonly="true"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">������:</td>
			        <td class="text">
			        	<html:text property="vo.startTime" size="5" styleId="startTime"/> - <html:text property="vo.endTime" size="5" styleId="endTime"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">��� ������:</td>
			        <td class="text">
				          <html:multibox property="daysOfWeek" value="1"/>�����������<br>
						  <html:multibox property="daysOfWeek" value="10"/>�������<br>
				          <html:multibox property="daysOfWeek" value="100"/>�����<br>
				          <html:multibox property="daysOfWeek" value="1000"/>�������<br>
				          <html:multibox property="daysOfWeek" value="10000"/>�������<br>
				          <html:multibox property="daysOfWeek" value="100000"/>�������<br>
				          <html:multibox property="daysOfWeek" value="1000000"/>�����������<br>
			        </td>
			    </tr>			
			    <tr>
			        <td class="text" colspan="2">������:</td>
			        <td class="text">
						<html:select property="vo.status">
							<html:option value="0">����������</html:option>
							<html:option value="1">��������</html:option>
						</html:select>			          
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
			<html:link page="/departmentToMqSchedulerSheetList.do" paramId="departmentId" paramName="MqSchedulerSheetDialogForm" paramProperty="departmentVO.id" paramScope="request">
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="�����">
	 		</html:link>
        </td>
    </tr>

</table>
</html:form>

</BODY>
</HTML>