<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<html>
<head>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/theme/Master.css" type="text/css">
<title>dictionarySamples</title>
<meta http-equiv="Content-Type" content="text/html; charset=Windows1251">
<meta name="GENERATOR" content="Rational Application Developer">
</head>
<body>
<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT>
<%
	String form = "samplesForm";
	String dialogProperty = "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes";
%>

<form name="samplesForm">
ID:<input type="text" name="id"   size="10">
NAME:<input type="text" name="name" size="30">
<A
	href='<%=request.getContextPath()%>/organizationLookupList.do?formName=<%=form %>&fieldNames=id|name'
	onclick='return openDialog(this.href + "&searchStr=" + document.all.name.value + "%", "organizationLookupList", "<%= dialogProperty%>");'>
	<IMG SRC="<%=request.getContextPath()%>/images/more.gif" BORDER='0' ALT='Справочник организаций'></A>
	
</form>	
</body>
</html>
