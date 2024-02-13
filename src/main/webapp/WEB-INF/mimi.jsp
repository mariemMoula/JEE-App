<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MiMi Page</title>
</head>
<body>
	<h1>IN THE MIMI PAGE</h1>
	<p>
		<% String msg = (String) request.getAttribute("msg"); %>
        <%= msg %>
	</p>
	<p>
		<% 
			for(int i=0 ; i<20;i++){
				out.println("UNE NOUVELLE LIGNE <br/>");
			}
		%>
	</p>
	<p>
		<%@ include file="menu.jsp" %>
		
	</p>
	<p>
		GETTING DATA FROM OBJECT AUTEUR : 
		${ auteur.nom} ${ auteur.prenom } 
	</p>
	<p>
		${auteur.actif ? 'Vous Etes tres ACTIF ! ' : 'Vous  Etes INACTIF ! ' }
	</p>
	
	
</body>
</html>