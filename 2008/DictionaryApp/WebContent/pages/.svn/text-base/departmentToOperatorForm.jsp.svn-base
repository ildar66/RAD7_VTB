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
	String form = "DepartmentToOperatorDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'>
	<html:link page="/departmentList.do" styleClass="navigator">Справочник филиалов</html:link> &gt;
	<html:link page="/departmentToOperatorList.do" paramId="departmentId" paramName="DepartmentToOperatorDialogForm" paramProperty="departmentVO.id" paramScope="request">
	 Пользователи для филиала: <I><bean:write name="DepartmentToOperatorDialogForm" property="departmentVO.fullName"/></I> </html:link> &gt;
		<bean:write name="<%= form%>"/>:
</H3><br>

<html:form action="/departmentToOperatorProcess.do" focus="vo.login">
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
			if(!field_check(theForm['vo.login'], 'Логин', 0, true)) return false;
			//if(!field_check(theForm['vo.fieldRE'], 'RE',3,false)) return false;
			//if(!field_check(theForm['vo.fieldRA'], 'RA',3,false)) return false;
			if(!field_check(theForm['vo.EMail'], 'eMail', 5, false)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "DepartmentToOperatorListForm=" + document.<%= form %>['vo.id'].value;
	}	
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">

    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			<html:link page="/departmentToOperatorList.do" paramId="departmentId" paramName="DepartmentToOperatorDialogForm" paramProperty="departmentVO.id" paramScope="request">
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
			          <bean:write name="<%=form %>" property="vo.id"/>
			          <html:hidden property="vo.id"/>
			        </td>
			    </tr>			
			    <tr>
			        <td class="text" colspan="2">Логин:</td>
			        <td class="text">
			          <html:text property="vo.login" size="50"/>
			        </td>
			    </tr>
			    <%--tr>
			        <td class="text" colspan="2">RE:</td>
			        <td class="text">
			          <html:text property="vo.fieldRE" size="50" />
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">RA:</td>
			        <td class="text">
			          <html:text property="vo.fieldRA" size="50" />
			        </td>
			    </tr--%>
			    <tr>
			        <td class="text" colspan="2">Фамилия:</td>
			        <td class="text">
			          <html:text property="vo.fieldFA" size="50" />
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Имя:</td>
			        <td class="text">
			          <html:text property="vo.fieldIM" size="50" />
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Отчество:</td>
			        <td class="text">
			          <html:text property="vo.fieldOT" size="50" />
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">eMail:</td>
			        <td class="text">
			          <html:text property="vo.EMail" size="50" />
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
			<html:link page="/departmentToOperatorList.do" paramId="departmentId" paramName="DepartmentToOperatorDialogForm" paramProperty="departmentVO.id" paramScope="request">
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
	 		</html:link>			
        </td>
    </tr>

</table>
</html:form>

</BODY>
</HTML>