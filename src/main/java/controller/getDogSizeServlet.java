/**
 * @author Mike Cordon - mrcordon@dmacc.edu
 * CIS 175 - Spring 2024
 * Feb 4, 2024
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dog;

/**
 * Servlet implementation class getDogSizeServlet
 */
@WebServlet("/getDogSizeServlet")
public class getDogSizeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDogSizeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String dogWeight = request.getParameter("dogWeight");  // gets dog weight from browser input
		
		Dog d = new Dog(Integer.parseInt(dogWeight)); // instantiation of dog object
		
		request.setAttribute("dog", d);  // set attribute for JSP
		
		getServletContext().getRequestDispatcher("/results.jsp").forward(request, response);		
		
	}

}
