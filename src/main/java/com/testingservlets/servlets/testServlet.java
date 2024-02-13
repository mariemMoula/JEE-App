package com.testingservlets.servlets;

import java.io.IOException;

import com.testing.beans.Auteur;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public testServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");  
//        response.setCharacterEncoding("UTF-8");
//        PrintWriter pw = response.getWriter();
//        pw.println("doGet method succeeded!");
    	
//    	String message = "message renvoye depuis la requete vers le JSP FILE";
//    	request.setAttribute("msg", message);
//    	
    	//Creation du bean auteur Object
    	Auteur auteur = new Auteur();
    	auteur.setNom("Amoura");
    	auteur.setPrenom("Amira");
    	auteur.setActif(true);
    	//Envoyer cet objet dans la requete 
    	request.setAttribute("auteur", auteur);
    	
    	this.getServletContext().getRequestDispatcher("/WEB-INF/mimi.jsp").forward(request, response);
    	
    }
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
