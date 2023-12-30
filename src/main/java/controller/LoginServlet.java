package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	User user = new User();
       
 
    public LoginServlet() {super();}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("txtname");
		String password = request.getParameter("txtpassword");
		
		if (name.equals("maiconcardoso@hotmail.com") && password.equals("senha@123")) {
			user.setName("Maicon Cardoso");
			response.sendRedirect("account.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
	}

}
