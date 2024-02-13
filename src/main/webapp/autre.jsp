<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>VOUS ETES SUR AUTRE JSP FILE</h1>
	<h1>DATA SESSION </h1>
	 <p>Nom: <%= session.getAttribute("nom") %></p>
    <p>Prénom: <%= session.getAttribute("prenom") %></p>
</body>
</html>