package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.Course;
import Service.DeleteCourseService;

@WebServlet("/deleteCourseServlet")
public class DeleteCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cno = request.getParameter("cno");
		Course course = new Course();
		course.setCno(cno);
		DeleteCourseService service = new DeleteCourseService();
		if (service.deleteCheck(course)) {
			response.sendRedirect("deleteCourseSuccess.jsp");
		}  else
		 response.sendRedirect("deleteCourseFailure.jsp");
	}
}
