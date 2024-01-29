package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.Student;
import Service.StudentPasswordService;

@WebServlet("/studentPasswordServlet")
public class StudentPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String new1 = request.getParameter("new1");
		String new2 = request.getParameter("new2");
		javax.servlet.http.Cookie[]  cs = request.getCookies();
		String sno = (String)cs[0].getValue();
		for(int i=0;i<cs.length;i++){
			if("id".equals(cs[i].getName())) {
			    sno = (String)cs[i].getValue();
				break;
			}
		}
		if(new1.equals(new2)) {
			Student student = new Student();
			student.setSno(sno);
			student.setSpassword(new1);
			StudentPasswordService service = new StudentPasswordService();
			if (service.modifyCheck(student)) {
				response.sendRedirect("studentPasswordSuccess.jsp");
				return;
			}
		}else
		 response.sendRedirect("studentPasswordFailure.jsp");
		return;
	}
}

