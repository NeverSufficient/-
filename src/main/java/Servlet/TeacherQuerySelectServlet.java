package Servlet;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.TeacherQuerySelectService;
import VO.TeacherQuerySelect;
@WebServlet("/teacherQuerySelectServlet")
public class TeacherQuerySelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cname = request.getParameter("cname");
		Cookie c = new Cookie("cname",cname);
		response.addCookie(c);
		TeacherQuerySelect teacherQuerySelect = new TeacherQuerySelect();
		teacherQuerySelect.setCname(cname);
		ResultSet rs=null;
		TeacherQuerySelectService service = new TeacherQuerySelectService();
		ArrayList<TeacherQuerySelect> allCourse = null;
			allCourse = new ArrayList<TeacherQuerySelect>();
			rs=service.queryCheck(teacherQuerySelect);
			try {
				while(rs.next()){
					TeacherQuerySelect cour = new TeacherQuerySelect();
					cour.setSno(rs.getString(1));
					cour.setSname(rs.getString(2));
					cour.setSsex(rs.getString(3));
					cour.setSclass(rs.getString(4));
					cour.setCname(rs.getString(5));
					allCourse.add(cour);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		request.setAttribute("allCourse", allCourse);
		RequestDispatcher dis = request.getRequestDispatcher("teacherQuerySelectSuccess.jsp");
		dis.forward(request, response);
		}	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}