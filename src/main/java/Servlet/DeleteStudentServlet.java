package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.Student;
import Service.DeleteStudentService;

@WebServlet("/deleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sno = request.getParameter("sno");
		Student student = new Student();
		student.setSno(sno);
		DeleteStudentService service = new DeleteStudentService();
		if (service.deleteCheck(student)) {
			response.sendRedirect("deleteStudentSuccess.jsp");
		}  else
		 response.sendRedirect("deleteStudentFailure.jsp");
	}
}
