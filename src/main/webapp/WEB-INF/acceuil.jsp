<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<p>
		<%@ include file="menu.jsp" %>
		
	</p>
		<h1>YOU RE IN THE HOME PAGE!</h1>
	<p>
		<h2>Welcome
			<%
			String name = (String) request.getAttribute("name");
		 	out.println(name);
			%>
		 </h2>
		 <p>${ !empty name ? name : ''  }</p>
		<p>
			${ names[1]} 
		</p>
	</p>
</body>
</html>