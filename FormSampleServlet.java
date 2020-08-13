package chapter5;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request,
	HttpServletResponse response)throws ServletException,IOException {
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		
		String errorMsg = "";
		if(name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません<br>";
		}
		if(gender == null || gender.length() ==0 ) {
			errorMsg += "";
		} else {
			if(gender.equals("0")) {
				gender = "";
			} else if(gender.equals("1")){
				gender = "";
			}
		}
		String msg = name + "("+ gender +")";
		if(errorMsg.length() != 0 ) {
			msg = errorMsg;
			}
		response.setContentType("text/html; charest=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>ユーザー登録</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg +"です</p>");
		out.println("<body>");
		out.println("</html>");
		}
}
