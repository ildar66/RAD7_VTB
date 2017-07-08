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

	<TITLE>Справочник регионов</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "RegionDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'><html:link page="/regionList.do" styleClass="navigator">Справочник регионов</html:link> &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

<html:form action="/regionProcess.do" focus="vo.name">
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
			if(!field_check(theForm['vo.id'], 'id',0,true)) return false;
			if(!field_check(theForm['vo.name'], 'Имя региона',0,true)) return false;
			if(!field_check(theForm['vo.rating'], 'Рейтинг',0,true)) return false;			
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "RegionListForm=" + document.<%= form %>['vo.id'].value;
	}	
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">

    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			<html:link page="/regionList.do" styleClass="navigator">
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
			</html:link>
        </td>
    </tr>

	<tr>
		<td colspan="2">
			<table>
			    <tr>
			        <td class="text" colspan="2">№ региона:</td>
			        <td class="text">
			          <html:text property="vo.id" size="20" readonly="true"/>
			        </td>
			    </tr>
			    
			    <tr>
			        <td class="text" colspan="2">Имя региона:</td>
			        <td class="text">
			          <html:text property="vo.name" size="20" />
			        </td>
			    </tr>
			    
			    <tr>
			        <td class="text" colspan="2">Рейтинг:</td>
			        <td class="text">
			          <html:text property="vo.rating" size="20" readonly="false"/>
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
			<html:link page="/regionList.do" styleClass="navigator">
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
			</html:link>
        </td>
    </tr>

</table>
</html:form>

</BODY>
</HTML>