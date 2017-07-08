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
	String form = "SpoSettingDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'><html:link page="/departmentList.do" styleClass="navigator">Справочник филиалов</html:link> &gt;
	<font color="red"><bean:write name="<%= form%>" /></font> SPO для филиала: <I><bean:write
	name="<%= form%>" property="departmentVO.fullName" /></I> &gt;
</H3><br>

<html:form action="/spoSettingProcess.do" focus="vo.fileHost_Type">
<html:errors/>
<html:hidden property="action"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "Удалить запись"; %>
</logic:equal>
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/validate.js" type="text/javascript"></SCRIPT> 
<script language="javascript">
	function Check(){
		var theForm = document.<%= form %>;
		with(theForm){
			if(!field_check(theForm['vo.id_department'], 'id_department',0,true)) return false;
			if(!field_check(theForm['vo.fileHost_Type'], 'fileHost_Type',3,true)) return false;
			if(!field_check(theForm['vo.fileHost_IP'], 'fileHost_IP',0,true)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "SpoSettingListForm=" + document.<%= form %>['vo.id'].value;
	}	
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">

    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
    		<html:link page="/departmentList.do" styleClass="navigator" >
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
			</html:link>    	
        </td>
    </tr>

	<tr>
		<td colspan="2">
			<table>
			    <%--tr>
			        <td class="text" colspan="2">№ филиала:</td>
			        <td class="text">
			          <html:text property="vo.id_department" size="20" readonly="true"/>
			        </td>
			    </tr--%>
			    <html:hidden property="vo.id_department"/>
			    <tr>
			        <td class="text" colspan="2">Код филиала:</td>
			        <td class="text">
			          <html:text property="departmentVO.code" size="20" readonly="true"/>
			        </td>
			    </tr>			    
			    <tr>
			        <td class="text" colspan="2">Тип сервера:</td>
			        <td class="text">
			          <html:text property="vo.fileHost_Type" size="50" />
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">IP адрес:</td>
			        <td class="text">
			          <html:text property="vo.fileHost_IP" size="50" />
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">MQ hostname:</td>
			        <td class="text">
			          <html:text property="vo.mq_hostname" size="50" />
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">MQ port:</td>
			        <td class="text">
			          <html:text property="vo.mq_port" size="50" />
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">MQ queuemanagerName:</td>
			        <td class="text">
			          <html:text property="vo.mq_queuemanagerName" size="50" />
			        </td>
			    </tr>			    			    
			    <tr>
			        <td class="text" colspan="2">MQ serverChannel:</td>
			        <td class="text">
			          <html:text property="vo.mq_serverChannel" size="50" />
			        </td>
			    </tr>			    			    
			    <tr>
			        <td class="text" colspan="2">MQ queueName:</td>
			        <td class="text">
			          <html:text property="vo.mq_queueName" size="50" />
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
    		<html:link page="/departmentList.do" styleClass="navigator" >
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
			</html:link>    	
        </td>
    </tr>

</table>
</html:form>

</BODY>
</HTML>