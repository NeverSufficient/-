package Servlet;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.StudentScoreService;
import VO.StudentScore;
@WebServlet("/studentScoreServlet")
public class StudentScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		StudentScore studentScore = new StudentScore();
		javax.servlet.http.Cookie[]  cs = request.getCookies();
		String sno = (String)cs[0].getValue();
		for(int i=0;i<cs.length;i++){
			if("id".equals(cs[i].getName())) {
			    sno = (String)cs[i].getValue();
				break;
			}
		}
		studentScore.setSno(sno);
		ResultSet rs=null;
		StudentScoreService service = new StudentScoreService();
		ArrayList<StudentScore> allCourse = null;
			allCourse = new ArrayList<StudentScore>();
			rs=service.queryCheck(studentScore);
			try {
				while(rs.next()){
					StudentScore cour = new StudentScore();
					cour.setCno(rs.getString(1));
					cour.setCname(rs.getString(2));
					cour.setCcredit(rs.getDouble(3));
					cour.setScore(rs.getDouble(4));
					allCourse.add(cour);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		request.setAttribute("allCourse", allCourse);
		RequestDispatcher dis = request.getRequestDispatcher("studentScoreSuccess.jsp");
		dis.forward(request, response);
		}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
