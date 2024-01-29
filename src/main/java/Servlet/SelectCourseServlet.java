package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.SC;
import Service.SelectCourseService;

@WebServlet("/selectCourseServlet")
public class SelectCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		javax.servlet.http.Cookie[]  cs = request.getCookies();
		String sno = (String)cs[0].getValue();
		for(int i=0;i<cs.length;i++){
			if("id".equals(cs[i].getName())) {
			    sno = (String)cs[i].getValue();
				break;
			}
		}
		String cno = request.getParameter("cno");
		SC sc = new SC();
		sc.setSno(sno);
		sc.setCno(cno);
		SelectCourseService service = new SelectCourseService();
		if (service.selectCheck(sc)) {
			response.sendRedirect("selectCourseSuccess.jsp");
		}  else
		 response.sendRedirect("selectCourseFailure.jsp");
	}
}
