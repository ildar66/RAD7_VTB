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

	<TITLE>Контакты для организации</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "OrganizationToManagerDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'>
	<html:link page="/organizationList.do" styleClass="navigator">Справочник организаций</html:link> &gt;
	<html:link page="/organizationToManagerList.do" paramId="organizationID" paramName="OrganizationToManagerDialogForm" paramProperty="organizationID" paramScope="request">
	 Контакты для организации: <I><bean:write name="OrganizationToManagerDialogForm" property="organizationVO.account_name"/></I> </html:link> &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

<html:form action="/organizationToManagerProcess.do">
<html:errors/>
<html:hidden property="action"/>
<html:hidden property="organizationID"/>
<html:hidden property="vo.address.id"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "Удалить запись"; %>
</logic:equal>
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/validate.js" type="text/javascript"></SCRIPT> 
<script language="javascript">
	function Check(){
		var theForm = document.<%= form %>;
		with(theForm){
			if(!field_check(theForm['vo.id'], 'id', 3, true)) return false;
			if(!field_check(theForm['vo.title'], 'Должность', 0, true)) return false;
			if(!field_check(theForm['vo.lastName'], 'Фамилия', 0, true)) return false;
			if(!field_check(theForm['birthDay'], 'Дата рождения', 7, false)) return false;
			//if(!field_check(theForm['vo.description'], 'Описание', 0, true)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "OrganizationToManagerListForm=" + document.<%= form %>['vo.id'].value;
	}
	function popCalInFrame(dateCtrl) {
		var w=gfPop;
		//w.gbFixedPos=true;	// enable fixed positioning
		//w.gPosOffset=[70,0];	// set position
		w.fPopCalendar(dateCtrl);	// pop calendar
	}	
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">

    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			<html:link page="/organizationToManagerList.do" paramId="organizationID" paramName="OrganizationToManagerDialogForm" paramProperty="organizationVO.id_contractor" paramScope="request">
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
			        <td class="text" colspan="2">Должность:</td>
			        <td class="text">
			        	<html:text property="vo.title" size="65"/>
			        </td>
			    </tr>			    			
			    <tr>
			        <td class="text" colspan="2">Фамилия:</td>
			        <td class="text">
			          <html:text property="vo.lastName" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Имя:</td>
			        <td class="text">
			          <html:text property="vo.firstName" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Отчество:</td>
			        <td class="text">
			          <html:text property="vo.middleName" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Дата рождения:</td>
			        <td class="text">
			        	<html:text property="birthDayStr" size="7" styleId="birthDay"/>
						<a href="javascript:void(0)" onclick="popCalInFrame(document.<%= form %>.birthDay);return false;" HIDEFOCUS>
							<img name="popcal" align="absbottom" src="<%=request.getContextPath()%>/images/calbtn.gif" width="34" height="22" border="0" alt=""></a>			
			        </td>
			    </tr>			    
			    <tr>
			        <td class="text" colspan="2">ВУЗ:</td>
			        <td class="text">
			        	<html:text property="vo.alumni" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">На основании чего действует:</td>
			        <td class="text">
			        	<html:textarea property="vo.reason" rows="3"/>
			        </td>
			    </tr>
			    <tr>
			        <th class="text" colspan="2" align="left">Адрес:</th>
			        <td class="text">&nbsp;</td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Город:</td>
			        <td class="text">
			          <html:text property="vo.address.city" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Индекс:</td>
			        <td class="text">
			          <html:text property="vo.address.postalCode" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Страна:</td>
			        <td class="text">
			          <html:text property="vo.address.country" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Округ:</td>
			        <td class="text">
			          <html:text property="vo.address.county" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Описание:</td>
			        <td class="text">
			          <html:textarea property="vo.address.description" rows="3"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Адрес 1:</td>
			        <td class="text">
			          <html:text property="vo.address.address1" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Адрес 2:</td>
			        <td class="text">
			          <html:text property="vo.address.address2" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Адрес 3:</td>
			        <td class="text">
			          <html:text property="vo.address.address3" size="65"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Адрес 4:</td>
			        <td class="text">
			          <html:text property="vo.address.address4" size="65"/>
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
			<html:link page="/organizationToManagerList.do" paramId="organizationID" paramName="OrganizationToManagerDialogForm" paramProperty="organizationVO.id_contractor" paramScope="request">
				<img border="0"	src="<%=request.getContextPath()%>/images/back.gif" ALT="Назад">
	 		</html:link>
        </td>
    </tr>

</table>
</html:form>
<iframe width=174 height=189 name="gToday:normal:agenda.js" id="gToday:normal:agenda.js" src="<%=request.getContextPath()%>/calendar/ipopeng.jsp" scrolling="no" frameborder="0" style="visibility:visible; z-index:999; position:absolute; left:-500px; top:0px;">
</iframe>
</BODY>
</HTML>