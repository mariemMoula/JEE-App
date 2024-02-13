package com.test.forms;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

public class ConnectionForm {
	private String resultat ;
	public void verifierIdentifiant(HttpServletRequest req ) {
		String nom = req.getParameter("nom"); 
		String prenom = req.getParameter("prenom"); 
		if (nom != null && prenom != null) {
            if (nom.equalsIgnoreCase("admin")) {
                resultat = "Success!";
            } else {
                resultat = "Failed to login :(";
            }
        } else {
            resultat = "Failed to login: invalid parameters";
        }
    }
		
	
	
	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	} 
	
}
