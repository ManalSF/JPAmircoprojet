package main.java.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.model.Articles;
//import main.java.model.DBConnection;


public class Catalogue extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private DBConnection conn=new DBConnection();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Catalogue() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String Categorie = request.getParameter("Categorie");
		/*if(Categorie==null) {
			Categorie="Contemporain";
		}*/
		
		//List<Articles> articles = conn.MontrerArticles();
		//request.setAttribute("articles", articles);
		//request.setAttribute("Cat", Categorie);
		
		request.getRequestDispatcher("Catalogue.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doGet(request, response);
	}

}

