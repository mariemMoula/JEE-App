<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User IN</title>
</head>
<body>
	<h1>
		DATA RECEIVED SUCCEFULLY ! 
		
	</h1> 
	<h1>DATA SESSION </h1>
	 <p>Nom: <%= session.getAttribute("nom") %></p>
    <p>Prénom: <%= session.getAttribute("prenom") %></p>
	
	<h1>User Data</h1>
	
	<p>Nom: ${nom}</p>
	<p>Prénom: ${prenom}</p>
	

	<p>
		YOU RE ACTIF ! 
	</p>
	 
</body>
</html>