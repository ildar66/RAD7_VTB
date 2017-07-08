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

	<TITLE>Справочник филиалов</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "MqSchedulerSheetDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'>
	<html:link page="/departmentList.do" styleClass="navigator">Справочник филиалов</html:link> &gt;
	<html:link page="/departmentToMqSchedulerSheetList.do" paramId="departmentId" paramName="MqSchedulerSheetDialogForm" paramProperty="departmentVO.id" paramScope="request">
	 Настройки MQSS для филиала: <I><bean:write name="MqSchedulerSheetDialogForm" property="departmentVO.fullName"/></I> </html:link> &gt;
	<bean:write name="<%= form%>"/> MQSS :
</H3><br>

<html:form action="/mqSchedulerSheetProcess.do">
<html:errors/>
<html:hidden property="action"/>
<html:hidden property="departmentId"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "Удалить запись"; %>
</logic:equal>
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/validate.js" type="text/javascript"></SCRIPT> 
<script language="javascript">
	function Check(){
		var theForm = document.<%= form %>;
		with(theForm){
			if(!field_check(theForm['vo.id_department'], 'id', 0, true)) return false;
			if(!field_check(theForm['startTime'], 'начало периода', 9, true)) return false;
			if(!field_check(theForm['endTime'], 'конец периода', 9, true)) return false;
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
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
	 		</html:link>
        </td>
    </tr>

	<tr>
		<td colspan="2">
			<table>
			    <tr>
			        <td class="text" colspan="2">№:</td>
			        <td class="text">
			          <html:text property="vo.id" size="20" readonly="true"/>
			        </td>
			    </tr>			
			    <tr>
			        <td class="text" colspan="2">Код филиала:</td>
			        <td class="text">
			          <html:text property="vo.id_department" size="20" readonly="true"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Период:</td>
			        <td class="text">
			        	<html:text property="vo.startTime" size="5" styleId="startTime"/> - <html:text property="vo.endTime" size="5" styleId="endTime"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">дни недели:</td>
			        <td class="text">
				          <html:multibox property="daysOfWeek" value="1"/>Понедельник<br>
						  <html:multibox property="daysOfWeek" value="10"/>Вторник<br>
				          <html:multibox property="daysOfWeek" value="100"/>Среда<br>
				          <html:multibox property="daysOfWeek" value="1000"/>Четверг<br>
				          <html:multibox property="daysOfWeek" value="10000"/>Пятница<br>
				          <html:multibox property="daysOfWeek" value="100000"/>Суббота<br>
				          <html:multibox property="daysOfWeek" value="1000000"/>Воскресенье<br>
			        </td>
			    </tr>			
			    <tr>
			        <td class="text" colspan="2">Статус:</td>
			        <td class="text">
						<html:select property="vo.status">
							<html:option value="0">неактивный</html:option>
							<html:option value="1">активный</html:option>
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
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
	 		</html:link>
        </td>
    </tr>

</table>
</html:form>

</BODY>
</HTML>