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

import Service.QueryCourseService;
import VO.Course;
@WebServlet("/queryCourseServlet")
public class QueryCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cname = request.getParameter("cname");
		Course course = new Course();
		course.setCname(cname);
		ResultSet rs=null;
		QueryCourseService service = new QueryCourseService();
		ArrayList<Course> allCourse = null;
			allCourse = new ArrayList<Course>();
			rs=service.queryCheck(course);
			try {
				
				while(rs.next()){
					Course cour = new Course();
					cour.setCno(rs.getString(1));
					cour.setCname(rs.getString(2));
					cour.setCcredit(rs.getDouble(3));
					cour.setCintroduction(rs.getString(4));
					allCourse.add(cour);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		request.setAttribute("allCourse", allCourse);
		RequestDispatcher dis = request.getRequestDispatcher("queryCourseSuccess.jsp");
		dis.forward(request, response);
		}	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}