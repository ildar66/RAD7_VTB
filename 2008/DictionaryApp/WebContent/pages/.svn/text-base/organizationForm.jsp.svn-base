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

	<TITLE>Справочник организаций</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "OrganizationDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'><html:link page="/organizationList.do" styleClass="navigator">Справочник организаций</html:link> &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

<html:form action="/organizationProcess.do" focus="shortName">
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
			if(!field_check(theForm['fullName'], 'Полное юридическое Наименование', 0, true)) return false;
			if(!field_check(theForm['shortName'], 'Наименование', 0, true)) return false;
			if(!field_check(theForm['dateOfRegistration'], 'Дата учреждения компании', 7, false)) return false;
			if(!field_check(theForm['employees_count'], 'Кол-во сотрудников', 3, false)) return false;
			if(!field_check(theForm['id_opf'], 'Организационно-правовая форма', 3, true)) return false;
			if(!field_check(theForm['id_industry'], 'Отрасль', 3, true)) return false;
			if(!field_check(theForm['id_region'], 'Регион', 3, true)) return false;
			if(!field_check(theForm['email'], 'eMail', 5, false)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "OrganizationListForm=" + document.<%= form %>['vo.id_contractor'].value;
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
			<html:link page="/organizationList.do" styleClass="navigator" >
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
			          <html:text property="vo.id_contractor" size="20" styleId="id" readonly="true"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Наименование:</td>
			        <td class="text">
			          <html:text property="vo.account_name" size="85" styleId="shortName"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Полное юридическое Наименование:</td>
			        <td class="text">
			          <html:text property="vo.account_fullname" size="85" styleId="fullName"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Организационно-правовая форма:</td>
			        <td class="text">
						<html:select property="vo.id_opf" styleId="id_opf" style="width: 345pt">
							<html:option value="">_____________________________________________</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.OWNERSHIP_FORM_TYPE_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Дата учреждения компании:</td>
			        <td class="text">
			        	<html:text property="dateOfRegistrationStr" size="7" styleId="dateOfRegistration"/>
						<a href="javascript:void(0)" onclick="popCalInFrame(document.<%= form %>.dateOfRegistration);return false;" HIDEFOCUS>
							<img name="popcal" align="absbottom" src="<%=request.getContextPath()%>/images/calbtn.gif" width="34" height="22" border="0" alt=""></a>			
			        </td>
			    </tr>			    
			    <tr>
			        <td class="text" colspan="2">Категория клиента:</td>
			        <td class="text">
			          <html:text property="vo.category" size="85" styleId="category"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Отрасль:</td>
			        <td class="text">
						<html:select property="vo.id_industry" styleId="id_industry" style="width: 345pt">
							<html:option value="">_____________________________________________</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.INDUSTRY_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Описание бизнеса:</td>
			        <td class="text">
			          <html:textarea property="vo.business_description" rows="7" styleId="business_description"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Кол-во сотрудников:</td>
			        <td class="text">
			          <html:text property="vo.employees_count" size="25" styleId="employees_count"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Регион:</td>
			        <td class="text">
						<html:select property="vo.id_region" styleId="id_region" style="width: 345pt">
							<html:option value="">_____________________________________________</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.REGION_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Рейтинг:</td>
			        <td class="text">
			          <html:text property="vo.rating" size="25" styleId="city"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Телефон компании:</td>
			        <td class="text">
			          <html:text property="vo.phone" size="25" styleId="phone"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Факс компании:</td>
			        <td class="text">
			          <html:text property="vo.fax" size="25" styleId="fax"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">Е-mail организации:</td>
			        <td class="text">
			          <html:text property="vo.email" size="25" styleId="email"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">ИНН:</td>
			        <td class="text">
			          <html:text property="vo.INN" size="25" styleId="INN"/>
			        </td>
			    </tr>
			    <tr>
			        <td class="text" colspan="2">КПП:</td>
			        <td class="text">
			          <html:text property="vo.KPP" size="25" styleId="KPP"/>
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
			<html:link page="/organizationList.do" styleClass="navigator" >
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