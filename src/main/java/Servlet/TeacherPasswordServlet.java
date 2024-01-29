package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.Teacher;
import Service.TeacherPasswordService;

@WebServlet("/teacherPasswordServlet")
public class TeacherPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String new1 = request.getParameter("new1");
		String new2 = request.getParameter("new2");
		javax.servlet.http.Cookie[]  cs = request.getCookies();
		String tno = (String)cs[0].getValue();
		for(int i=0;i<cs.length;i++){
			if("id".equals(cs[i].getName())) {
			    tno = (String)cs[i].getValue();
				break;
			}
		}
		if(new1.equals(new2)) {
			Teacher teacher = new Teacher();
			teacher.setTno(tno);
			teacher.setTpassword(new1);
			TeacherPasswordService service = new TeacherPasswordService();
			if (service.modifyCheck(teacher)) {
				response.sendRedirect("teacherPasswordSuccess.jsp");
				return;
			}
		}else
		 response.sendRedirect("teacherPasswordFailure.jsp");
		return;
	}
}

