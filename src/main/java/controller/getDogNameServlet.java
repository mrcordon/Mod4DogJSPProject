/**
 * @author Mike Cordon - mrcordon@dmacc.edu
 * CIS 175 - Spring 2024
 * Feb 4, 2024
 */


package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dog;

/**
 * Servlet implementation class getDogNameServlet
 */
@WebServlet("/getDogNameServlet")
public class getDogNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDogNameServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String dogName = request.getParameter("dogName");
		String dogBreed = request.getParameter("dogBreed");
		
		Dog dog = new Dog(dogName, dogBreed);
		
		request.setAttribute("dog2", dog);
		
		getServletContext().getRequestDispatcher("/howBig.jsp").forward(request, response);
	}

}
