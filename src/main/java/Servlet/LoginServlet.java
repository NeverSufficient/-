package Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.Login;
import Service.LoginService;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String status = request.getParameter("status");
		Login login = new Login();
		login.setId(id);
		login.setPassword(pwd);
		LoginService service = new LoginService();
		Cookie c = new Cookie("id",id);
		response.addCookie(c);
		try {
			if (service.loginCheck(login) && status.equals("教师")  ) {
				response.sendRedirect("teacher.jsp");
				return;
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		} 
		try {
			if (service.loginCheck(login) && status.equals("学生")) {
				response.sendRedirect("student.jsp");
				return;
			} else
			 response.sendRedirect("loginFailure.jsp");
		}  catch (SQLException | IOException e) {
			e.printStackTrace();
		} 
		return;
	}
}

