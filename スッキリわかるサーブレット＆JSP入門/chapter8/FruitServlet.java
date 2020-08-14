package chapter8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FruitServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,
		HttpServletResponse response)throws ServletException,IOException {
		Fruit f = new Fruit("ichigo",700);
		HttpSession session = request.getSession();
		RequestDispatcher d = request.getRequestDispatcher("/show.jsp");
		d.forward(request, response);
	}
}
