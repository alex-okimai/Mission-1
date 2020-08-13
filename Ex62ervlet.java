package chapter6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex62ervlet")
public class Ex62ervlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)throws ServletException,IOException{
		int rand = (int)(Math.random()*10);
		if(rand % 2 == 1 ) {
			response.sendRedirect("/ex62/redirected.jsp");
		} else {
			RequestDispatcher d = request.getRequestDispatcher("/forwarded.jsp");
			d.forward(request, response);
		}
	}
}
