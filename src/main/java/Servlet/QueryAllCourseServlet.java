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

import Service.QueryAllCourseService;
import VO.Course;
@WebServlet("/queryAllCourseServlet")
public class QueryAllCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ResultSet rs=null;
		QueryAllCourseService service = new QueryAllCourseService();
		ArrayList<Course> allCourse = null;
			allCourse = new ArrayList<Course>();
			rs=service.queryCheck();
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
		RequestDispatcher dis = request.getRequestDispatcher("queryAllCourseSuccess.jsp");
		dis.forward(request, response);
		}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}