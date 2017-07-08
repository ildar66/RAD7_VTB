<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ page import="com.vtb.value.*" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<HTML>
<HEAD>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>

	<TITLE>ОКВЭД</TITLE>
</HEAD>
<BODY class="content">
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT>
<%
	String form = "OkvedDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'><html:link page="/okvedList.do" styleClass="navigator">ОКВЭД компании</html:link> &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

	<table class="framing-table">
		<tr>
			<td class="find-filter">
				<b>иерархия родителей для ОКВЕД:</b>&nbsp;
				<i><bean:write name="<%= form %>" property="vo.name" /></i>&nbsp;
			</td>
			<logic:present name="<%=BeanKeys.OKVED_PARENT_HIERARCHY_LIST%>">
			<td class="find-filter" colspan="2">
				<UL>
				<logic:iterate id="item" name="<%=BeanKeys.OKVED_PARENT_HIERARCHY_LIST%>"
					type="com.vtb.domain.Okved">
					<logic:present name="item">
						<UL><LI>
							<logic:notEqual name="<%= form %>" property="action" value="View">
								<html:link page="/okvedDialog.do?action=Edit" paramId="id" paramName="item" paramProperty="id" paramScope="page"  title="Редактирование ОКВЕД">
									<bean:write name="item" property="name" filter="true" /> : 
									<I><bean:write name="item" property="okved" filter="true" /></I> :
									<bean:write name="item" property="description" filter="true" />
								</html:link>
							</logic:notEqual>
							<logic:equal name="<%= form %>" property="action" value="View">
								<html:link page="/okvedDialog.do?action=View" paramId="id" paramName="item" paramProperty="id" paramScope="page"  title="Просмотр ОКВЕД">
									<bean:write name="item" property="name" filter="true" /> : 
									<I><bean:write name="item" property="okved" filter="true" /></I> :
									<bean:write name="item" property="description" filter="true" />
								</html:link>
							</logic:equal>							
						</LI>
					</logic:present>
					<br>
				</logic:iterate> 
				</UL>		           						
			</td>
			</logic:present>
		</tr>			
	</table><br>

<html:form action="/okvedProcess.do" focus="name">
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
			if(!field_check(theForm['id'], 'id', 3, true)) return false;
			if(!field_check(theForm['name'], 'Имя "ОКВЭД"', 0, true)) return false;
			if(!field_check(theForm['okved'], 'Код "ОКВЭД"', 0, true)) return false;			
			//if(!field_check(theForm['email'], 'eMail', 5, false)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "OkvedListForm=" + document.<%= form %>['vo.id'].value;
	}
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">
		<caption align="left" class="text">
			<b><bean:write name="<%= form%>" /> для ОКВЕД:</b>
			<i><bean:write name="<%= form %>" property="vo.name" /></i>
		</caption>

		<tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			<html:link page="/okvedList.do" styleClass="navigator" >
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
			          <html:text property="vo.id" size="8" styleId="id" readonly="true"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Имя "ОКВЭД":</td>
			        <td class="text">
			          <html:text property="vo.name" size="85" styleId="name"/>
			        </td>
			    </tr>			    
			    <tr>
			        <td class="text" colspan="2">Код "ОКВЭД":</td>
			        <td class="text">
			          <html:text property="vo.okved" size="8" styleId="okved"/>
			        </td>
			    </tr>			    
			    <tr>
			        <td class="text" colspan="2">Описание:</td>
			        <td class="text">
			          <html:textarea property="vo.description" rows="7" styleId="description"/>
			        </td>
			    </tr>			    
			    <tr>
			        <td class="text" colspan="2">
			        	Родитель:<img border="0" align="top" src="<%=request.getContextPath()%>/images/clear.gif" ALT="Очистить" onclick="parantID.value='';parantName.value='';">			          
			        </td>
			        <td class="text">
			        	<html:hidden property="vo.parent.id" styleId="parantID"/>
			        	<html:text property="vo.parent.name" size="20" styleId="parantName" readonly="true"/>
						<html:link page="/okvedLookupList.do?formName=OkvedDialogForm&fieldNames=parantID|parantName" onclick="return openDialog(this.href , 'okvedLookupList', 'top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes');" >
							<img border="0"	src="<%=request.getContextPath()%>/images/more.gif" ALT="Добавить ОКВЭД из Справочника"></html:link>
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
			<html:link page="/okvedList.do" styleClass="navigator" >
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
			</html:link>			
        </td>
    </tr>

</table>
</html:form>

</BODY>
</HTML>