package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.Course;
import Service.AddCourseService;

@WebServlet("/addCourseServlet")
public class AddCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cno = request.getParameter("cno");
		String cname = request.getParameter("cname");
		double ccredit = Double.parseDouble(request.getParameter("ccredit"));
		String cintroduction = request.getParameter("cintroduction");
		Course course = new Course();
		course.setCno(cno);
		course.setCname(cname);
		course.setCcredit(ccredit);
		course.setCintroduction(cintroduction);
		AddCourseService service = new AddCourseService();
		if (service.addCheck(course)) {
			response.sendRedirect("addCourseSuccess.jsp");
		}  else
		 response.sendRedirect("addCourseFailure.jsp");
	}
}