<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션태그 -param</title>
</head>
<body>
	<jsp:useBean id="person" class="common.Person" scope="request" />
	<h2>포워드된 페이지에서 매개변수 확인</h2>
	<ul>
		<li><jsp:getProperty property="name" name="person"/></li>
		<li>나이 : <jsp:getProperty name="person" property="age" /></li>
		<li>본명 : <%= request.getParameter("param1") %></li>
		<li>출생 : <%= request.getParameter("param2") %></li>
		<li>특징 : <%= request.getParameter("param3") %></li>	
	</ul>
	<jsp:include page="inc/ParamInclude.jsp">
		<jsp:param value="강원도 영월" name="loc1"/>
		<jsp:param value="김삿갓면" name="loc2" />
	</jsp:include>
</body>
</html>