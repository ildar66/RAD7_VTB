<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.vtb.value.*"%>
<%
	String form = "OrganizationCrmInfoForm";
%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/Master.css">

	<TITLE><bean:write name="<%=form %>" property="vo.account_name"/></TITLE>
</HEAD>
<BODY class="content">

<html:form action="/organizationCrmInfo.do">
<html:errors/>

<table class="main">
    <tr class="title">
    	<td class="title" colspan="2">
	    	<IMG SRC="<%=request.getContextPath()%>/images/cancel.gif" BORDER='0' ALT='Закрыть окно' onclick="document.body.style.cursor='auto'; if (opener != null) {opener.focus();} window.close();">
			<IMG SRC="<%=request.getContextPath()%>/images/empty.gif" BORDER='0' ALT='' WIDTH='3'>
	 		<A HREF='#'><IMG SRC="<%=request.getContextPath()%>/images/print.gif" BORDER='0' onclick='window.print()' ALT='Напечатать'></A>						
        </td>
    </tr>

	<tr class="printable">
		<td class="printable">
			<table class="print" STYLE="FONT-FAMILY: Arial,Verdana; FONT-SIZE: 8pt;">
			    <tr class="print">
			        <td class="print" colspan="2">Наименование:</td>
			        <td class="print"><bean:write name="<%=form %>" property="vo.account_name"/></td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Полное юридическое Наименование:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.account_fullname"/>
			        </td>
			    </tr>
			    <tr class="printable">
			        <td class="print" colspan="2">Организационно-правовая форма:</td>
			        <td class="print">
						<html:select property="vo.id_opf" styleId="id_opf" style="width: 345pt" disabled="true">
							<html:option value="">_____________________________________________</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.OWNERSHIP_FORM_TYPE_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Дата учреждения компании:</td>
			        <td class="print">
			        	<bean:write name="<%=form %>" property="dateOfRegistrationStr"/>
			        </td>
			    </tr>			    
			    <tr class="print">
			        <td class="print" colspan="2">Категория клиента:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.category"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Отрасль:</td>
			        <td class="print">
						<html:select property="vo.id_industry" styleId="id_industry" style="width: 345pt" disabled="true">
							<html:option value="">_____________________________________________</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.INDUSTRY_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Описание бизнеса:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.business_description"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Кол-во сотрудников:</td>
			        <td class="print">
			          	<bean:write name="<%=form %>" property="vo.employees_count"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Регион:</td>
			        <td class="print">
						<html:select property="vo.id_region" styleId="id_region" style="width: 345pt" disabled="true">
							<html:option value="">_____________________________________________</html:option>
							<html:options collection="<%= com.vtb.value.BeanKeys.REGION_LIST%>" property="id" labelProperty="name"/>
						</html:select>			          
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Рейтинг:</td>
			        <td class="print">
			          <bean:write name="<%=form %>"  property="vo.rating"/>
			        </td>
			    </tr>			    
			    <tr class="print">
			        <td class="print" colspan="2">Телефон компании:</td>
			        <td class="print">
			          <bean:write name="<%=form %>"  property="vo.phone"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Факс компании:</td>
			        <td class="print">
			          <bean:write name="<%=form %>"  property="vo.fax"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">Е-mail организации:</td>
			        <td class="print">
			          <bean:write name="<%=form %>"  property="vo.email"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">ИНН:</td>
			        <td class="print">
			          <bean:write name="<%=form %>"  property="vo.INN"/>
			        </td>
			    </tr>
			    <tr class="print">
			        <td class="print" colspan="2">КПП:</td>
			        <td class="print">
			          <bean:write name="<%=form %>" property="vo.KPP"/>
			        </td>
			    </tr>			    			    			    			    			    			    			    			    			    			    			    			    			    			    
			</table>
		</td>
	</tr>
	
	<logic:present name="<%=BeanKeys.ORGANIZATION_TO_ADDRESS_LIST%>">

    <TR class="printable">
		<TD class="printable" colspan="2">
			<table class="print" STYLE="FONT-FAMILY: Arial,Verdana; FONT-SIZE: 8pt;">
				<caption align="left" class="print" style="font-weight: bold; FONT-SIZE: 9pt;">Адреса для организации:</caption>
				<!-- Table header -->
				<tr class="print" style="background-color: 'D6EBFF'">
					<td class="print" style="font-weight: bold">Город</td>
					<td class="print" style="font-weight: bold">Индекс</td>
					<td class="print" style="font-weight: bold">Страна</td>
					<td class="print" style="font-weight: bold">Округ</td>
					<td class="print" style="font-weight: bold">Описание</td>
					<td class="print" style="font-weight: bold">Адрес 1</td>
					<td class="print" style="font-weight: bold">Адрес 2</td>
					<td class="print" style="font-weight: bold">Адрес 3</td>
					<td class="print" style="font-weight: bold">Адрес 4</td>
				</tr>
				<!-- Table body -->
				<logic:iterate id="item" name="<%=BeanKeys.ORGANIZATION_TO_ADDRESS_LIST%>">
					<logic:present name="item">
						<tr>
							<td class="print"><bean:write name="item" property="city" filter="true"/></td>
							<td class="print"><bean:write name="item" property="postalCode" filter="true"/></td>
							<td class="print"><bean:write name="item" property="country" filter="true"/></td>
							<td class="print"><bean:write name="item" property="county" filter="true"/></td>
							<td class="print"><bean:write name="item" property="description" filter="true"/></td>
							<td class="print"><bean:write name="item" property="address1" filter="true"/></td>
							<td class="print"><bean:write name="item" property="address2" filter="true"/></td>
							<td class="print"><bean:write name="item" property="address3" filter="true"/></td>
							<td class="print"><bean:write name="item" property="address4" filter="true"/></td>
		    	        </tr>
					</logic:present>
				</logic:iterate>	
				
			</table>
		</TD>
	</TR>

	</logic:present>
	
	<logic:present name="<%=BeanKeys.ORGANIZATION_TO_GROUP_LIST%>">

    <TR class="printable">
		<TD class="printable" colspan="2">
			<table class="print" STYLE="FONT-FAMILY: Arial,Verdana; FONT-SIZE: 8pt;">
				<caption align="left" class="print" style="font-weight: bold; FONT-SIZE: 9pt;">Группы, в состав которых входит организация:</caption>
				<!-- Table header -->
				<tr class="print" style="background-color: 'D6EBFF'">
					<td class="print" style="font-weight: bold">№ SPO</td>
					<td class="print" style="font-weight: bold">№ CRM</td>
					<td class="print" style="font-weight: bold">Имя группы</td>
					<td class="print" style="font-weight: bold">Тип группы</td>
					<td class="print" style="font-weight: bold">описание</td>
				</tr>
				<!-- Table body -->
				<logic:iterate id="item" name="<%=BeanKeys.ORGANIZATION_TO_GROUP_LIST%>">
					<logic:present name="item">
						<tr>
							<td class="print"><bean:write name="item" property="spoID" filter="true"/></td>
							<td class="print"><bean:write name="item" property="crmID" filter="true"/></td>
							<td class="print"><bean:write name="item" property="name" filter="true"/></td>
							<td class="print"><bean:write name="item" property="type" filter="true"/></td>
							<td class="print"><bean:write name="item" property="description" filter="true"/></td>
		    	        </tr>
					</logic:present>
				</logic:iterate>	
				
			</table>
		</TD>
	</TR>

	</logic:present>
	
	<logic:present name="<%=BeanKeys.ORGANIZATION_TO_GOVERN_LIST%>">

    <TR class="printable">
		<TD class="printable" colspan="2">
			<table class="print" STYLE="FONT-FAMILY: Arial,Verdana; FONT-SIZE: 8pt;">
				<caption align="left" class="print" style="font-weight: bold; FONT-SIZE: 9pt;">Управление для организации:</caption>
				<!-- Table header -->
				<tr class="print" style="background-color: 'D6EBFF'">
					<td class="print" style="font-weight: bold">название органа</td>
					<td class="print" style="font-weight: bold">тип документа</td>
					<td class="print" style="font-weight: bold">Периодичность действия</td>
					<td class="print" style="font-weight: bold">Присутствие</td>
				</tr>
				<!-- Table body -->
				<logic:iterate id="item" name="<%=BeanKeys.ORGANIZATION_TO_GOVERN_LIST%>">
					<logic:present name="item">
						<tr>
							<td class="print"><bean:write name="item" property="name" filter="true"/></td>
							<td class="print"><bean:write name="item" property="docType" filter="true"/></td>
							<td class="print"><bean:write name="item" property="activityPeriod" filter="true"/></td>
							<td class="print">
			                    <logic:equal name="item" property="isWithInAccount" value="true">ДА</logic:equal>
								<logic:equal name="item" property="isWithInAccount" value="false">НЕТ</logic:equal>							
							</td>
		    	        </tr>
					</logic:present>
				</logic:iterate>	
				
			</table>
		</TD>
	</TR>

	</logic:present>
	
	<logic:present name="<%=BeanKeys.ORGANIZATION_TO_SHAREHOLDER_LIST%>">

    <TR class="printable">
		<TD class="printable" colspan="2">
			<table class="print" STYLE="FONT-FAMILY: Arial,Verdana; FONT-SIZE: 8pt;">
				<caption align="left" class="print" style="font-weight: bold; FONT-SIZE: 9pt;">Акционеры для организации:</caption>
				<!-- Table header -->
				<tr class="print" style="background-color: 'D6EBFF'">
					<td class="print" style="font-weight: bold">Название владельца/акционера</td>
					<td class="print" style="font-weight: bold">Категория</td>
					<td class="print" style="font-weight: bold">Процент участия</td>
				</tr>
				<!-- Table body -->
				<logic:iterate id="item" name="<%=BeanKeys.ORGANIZATION_TO_SHAREHOLDER_LIST%>">
					<logic:present name="item">
						<tr>
							<td class="print"><bean:write name="item" property="fio" filter="true"/></td>
							<td class="print"><bean:write name="item" property="category" filter="true"/></td>
							<td class="print"><bean:write name="item" property="part" filter="true"/></td>
		    	        </tr>
					</logic:present>
				</logic:iterate>	
				
			</table>
		</TD>
	</TR>

	</logic:present>
	
	<logic:present name="<%=BeanKeys.ORGANIZATION_TO_MANAGERS_LIST%>">

    <TR class="printable">
		<TD class="printable" colspan="2">
			<table class="print" STYLE="FONT-FAMILY: Arial,Verdana; FONT-SIZE: 8pt;">
				<caption align="left" class="print" style="font-weight: bold; FONT-SIZE: 9pt;">Контакты для организации:</caption>
				<!-- Table header -->
				<tr class="print" style="background-color: 'D6EBFF'">
					<td class="print" style="font-weight: bold">ФИО</td>
					<td class="print" style="font-weight: bold">Должность</td>
					<td class="print" style="font-weight: bold">На основании чего действует</td>
					<td class="print" style="font-weight: bold">Информация об адресе</td>
				</tr>
				<!-- Table body -->
				<logic:iterate id="item" name="<%=BeanKeys.ORGANIZATION_TO_MANAGERS_LIST%>">
					<logic:present name="item">
						<tr>
							<td class="print">
								<bean:write name="item" property="lastName" filter="true"/>
								<bean:write name="item" property="firstName" filter="true"/>
								<bean:write name="item" property="middleName" filter="true"/>
							</td>
							<td class="print"><bean:write name="item" property="title" filter="true"/></td>
							<td class="print"><bean:write name="item" property="reason" filter="true"/></td>
                			<td class="print" title=' город : <bean:write name="item" property="address.city" filter="true"/>&#13; индекс: <bean:write name="item" property="address.postalCode" filter="true"/>&#13; страна: <bean:write name="item" property="address.country" filter="true"/>&#13; округ : <bean:write name="item" property="address.county" filter="true"/>&#13; Описание: <bean:write name="item" property="address.description" filter="true"/>&#13; Адрес 1: <bean:write name="item" property="address.address1" filter="true"/>&#13; Адрес 2: <bean:write name="item" property="address.address2" filter="true"/>&#13; Адрес 3: <bean:write name="item" property="address.address3" filter="true"/>&#13; Адрес 4: <bean:write name="item" property="address.address4" filter="true"/>&#13; ID: <bean:write name="item" property="address.id" filter="true"/>'>
			                	<IMG SRC='<%=request.getContextPath()%>/images/more.gif' BORDER='0'
			                		 title=' город : <bean:write name="item" property="address.city" filter="true"/>&#13; индекс: <bean:write name="item" property="address.postalCode" filter="true"/>&#13; страна: <bean:write name="item" property="address.country" filter="true"/>&#13; округ : <bean:write name="item" property="address.county" filter="true"/>&#13; Описание: <bean:write name="item" property="address.description" filter="true"/>&#13; Адрес 1: <bean:write name="item" property="address.address1" filter="true"/>&#13; Адрес 2: <bean:write name="item" property="address.address2" filter="true"/>&#13; Адрес 3: <bean:write name="item" property="address.address3" filter="true"/>&#13; Адрес 4: <bean:write name="item" property="address.address4" filter="true"/>&#13; ID: <bean:write name="item" property="address.id" filter="true"/>'>
							</td>							
		    	        </tr>
					</logic:present>
				</logic:iterate>	
				
			</table>
		</TD>
	</TR>

	</logic:present>
	
	<logic:present name="<%=BeanKeys.ORGANIZATION_TO_OKVED_LIST%>">

    <TR class="printable">
		<TD class="printable" colspan="2">
			<table class="print" STYLE="FONT-FAMILY: Arial,Verdana; FONT-SIZE: 8pt;">
				<caption align="left" class="print" style="font-weight: bold; FONT-SIZE: 9pt;">ОКВЭД для организации:</caption>
				<!-- Table header -->
				<tr class="print" style="background-color: 'D6EBFF'">
					<td class="print" style="font-weight: bold">Имя "ОКВЭД"</td>
					<td class="print" style="font-weight: bold">код</td>
					<td class="print" style="font-weight: bold">Описание</td>
					<td class="print" style="font-weight: bold">родительский "ОКВЭД"</td>
				</tr>
				<!-- Table body -->
				<logic:iterate id="item" name="<%=BeanKeys.ORGANIZATION_TO_OKVED_LIST%>">
					<logic:present name="item">
						<tr>
							<td class="print"><bean:write name="item" property="name" filter="true"/></td>
							<td class="print"><bean:write name="item" property="okved" filter="true"/></td>
							<td class="print"><bean:write name="item" property="description" filter="true"/></td>
							<td class="print"><bean:write name="item" property="parent.name" filter="true"/></td>
		    	        </tr>
					</logic:present>
				</logic:iterate>	
				
			</table>
		</TD>
	</TR>

	</logic:present>					
	
	
    <tr class="title">
    	<td class="title" colspan="2">
	    	<IMG SRC="<%=request.getContextPath()%>/images/cancel.gif" BORDER='0' ALT='Закрыть окно' onclick="document.body.style.cursor='auto'; if (opener != null) {opener.focus();} window.close();">
			<IMG SRC="<%=request.getContextPath()%>/images/empty.gif" BORDER='0' ALT='' WIDTH='3'>
	 		<A HREF='#'><IMG SRC="<%=request.getContextPath()%>/images/print.gif" BORDER='0' onclick='window.print()' ALT='Напечатать'></A>						
        </td>
    </tr>
</table>
</html:form>

</BODY>
</HTML>