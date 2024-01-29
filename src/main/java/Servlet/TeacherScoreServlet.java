package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.TeacherScore;
import Service.TeacherScoreService;

@WebServlet("/teacherScoreServlet")
public class TeacherScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sno = request.getParameter("sno");
		String cname = request.getParameter("cname");
		double score = Double.parseDouble(request.getParameter("score"));
		TeacherScore teacherScore = new TeacherScore();
		teacherScore.setSno(sno);
		teacherScore.setCname(cname);
		teacherScore.setScore(score);
		TeacherScoreService service = new TeacherScoreService();
		if (service.scoreCheck(teacherScore)) {
			response.sendRedirect("teacherScoreSuccess.jsp");
		}  
	}
}