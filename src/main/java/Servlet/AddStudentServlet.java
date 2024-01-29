package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.Student;
import Service.AddStudentService;

@WebServlet("/addStudentServlet")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sno = request.getParameter("sno");
		String sname = request.getParameter("sname");
		String ssex = request.getParameter("ssex");
		String sage = request.getParameter("sage");
		String sclass = request.getParameter("sclass");
		String spassword = request.getParameter("spassword");
		Student student = new Student();
		student.setSno(sno);
		student.setSname(sname);
		student.setSsex(ssex);
		student.setSage(sage);
		student.setSclass(sclass);
		student.setSpassword(spassword);
		AddStudentService service = new AddStudentService();
		if (service.addCheck(student)) {
			response.sendRedirect("addStudentSuccess.jsp");
		}  else
		 response.sendRedirect("addStudentFailure.jsp");
	}
}

