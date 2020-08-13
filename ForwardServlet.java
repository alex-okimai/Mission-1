package chapter6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForwardServlet")
public class ForwardServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)throws ServletException,IOException{
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/JSP/forwardServlet.jsp");
		dispatcher.forward(request, response);
	}
}
