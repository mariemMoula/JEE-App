package com.testingservlets.servlets;

import java.io.IOException;

import com.test.forms.ConnectionForm;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Formulaire
 */
public class Formulaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //RELATED PATH IS : http://localhost:8080/testing/Formulaire
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
    	//On recupere les cookies
    	Cookie[] cookies = request.getCookies();
    	//Verification des cookies
    	if(cookies !=null) {
    		for(Cookie cookie: cookies) {
    			if(cookie.getName().equals("prenom")) {
    				request.setAttribute("prenom", cookie.getValue());
    	    		this.getServletContext().getRequestDispatcher("/WEB-INF/cookie.jsp").forward(request, response);

    			}
    		}
    	}else {
    		this.getServletContext().getRequestDispatcher("/WEB-INF/formulaire.jsp").forward(request, response);

    	}
    	
    	

    	
    	
    	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Attribution des parametres
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		//Si on veut acceder a la page directement sans verification
//		Auteur auteur = new Auteur(); 
//		auteur.setNom(nom);
//		auteur.setActif(true);
//		auteur.setPrenom(prenom);
//		request.setAttribute("auteur",auteur);
		
		//Si ON VEUT FAIRE UNE VERIFICATION
		ConnectionForm form = new ConnectionForm(); 
		form.verifierIdentifiant(request);
		
		 if(form.getResultat().equalsIgnoreCase("Success!")) {
		        // Setting the attributes
		        request.setAttribute("nom", nom);
		        request.setAttribute("prenom", prenom);
		        //Redirection vers la page 
		        HttpSession session = request.getSession();
		        session.setAttribute("prenom", prenom);
		        session.setAttribute("nom",nom);
		        
		        //CREATION DU COOKIE 
		         Cookie cookie =new Cookie("prenom",prenom);
		         //MODIFICATION DES PARAMETRES DU COOKIE POUR QU ELLE DURE PLUS LONGTEMPS (en seconde)
		         cookie.setMaxAge(60*60*24*30);
		         //Ajout DU COOKIE CREE
				 response.addCookie(cookie);

		        this.getServletContext().getRequestDispatcher("/WEB-INF/Received.jsp").forward(request, response);
		        

		    }else {
//        Si la vérification échoue, rediriger vers la page error.jsp
		    	this.getServletContext().getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);	
		    	}
		
//   	this.getServletContext().getRequestDispatcher("/WEB-INF/Received.jsp").forward(request, response);

		 
		 
		 
	}

	
	
	
}
