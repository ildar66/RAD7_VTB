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

	<TITLE>Справочник Организационно-правовых форм</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "OwnershipFormTypeDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'><html:link page="/ownershipFormTypeList.do" styleClass="navigator">Справочник Организационно-правовых форм</html:link> &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

<html:form action="/ownershipFormTypeProcess.do" focus="vo.name">
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
			if(!field_check(theForm['vo.id'], '№',0,true)) return false;
			if(!field_check(theForm['vo.code'], 'Код',3,true)) return false;
			if(!field_check(theForm['vo.name'], 'Имя базовой ставки',0,true)) return false;
			if(!field_check(theForm['vo.association'], 'Описание',0,false)) return false;			
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "OwnershipFormTypeListForm=" + document.<%= form %>['vo.id'].value;
	}	
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">

    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			<html:link page="/ownershipFormTypeList.do" styleClass="navigator">
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
			          <html:text property="vo.id" size="10" readonly="true"/>
			        </td>
			    </tr>
			    
			    <tr>
			        <td class="text" colspan="2">Код OPF:</td>
			        <td class="text">
			          <html:text property="vo.code" size="10"/>
			        </td>
			    </tr>
			    
			    <tr>
			        <td class="text" colspan="2">Имя:</td>
			        <td class="text">
			          <html:textarea property="vo.name" rows="3" />
			        </td>
			    </tr>
			    
			    <tr>
			        <td class="text" colspan="2">Принадлежность:</td>
			        <td class="text">
			          <html:select property="vo.association">
			          	<html:option value="">_______________</html:option>
					  	<html:option value="O">Общество</html:option>
						<html:option value="C">Предприятие</html:option>
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
			<html:link page="/ownershipFormTypeList.do" styleClass="navigator">
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
			</html:link>
        </td>
    </tr>

</table>
</html:form>

</BODY>
</HTML>