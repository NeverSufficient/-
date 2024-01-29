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

import Service.StudentQuerySelectService;
import VO.StudentQuerySelect;
@WebServlet("/studentQuerySelectServlet")
public class StudentQuerySelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		javax.servlet.http.Cookie[]  cs = request.getCookies();
		String sno = (String)cs[0].getValue();
		for(int i=0;i<cs.length;i++){
			if("id".equals(cs[i].getName())) {
			    sno = (String)cs[i].getValue();
				break;
			}
		}
		StudentQuerySelect studentQuerySelect = new StudentQuerySelect();
		studentQuerySelect.setSno(sno);
		ResultSet rs=null;
		StudentQuerySelectService service = new StudentQuerySelectService();
		ArrayList<StudentQuerySelect> allCourse = null;
			allCourse = new ArrayList<StudentQuerySelect>();
			rs=service.queryCheck(studentQuerySelect);
			try {
				while(rs.next()){
					StudentQuerySelect cour = new StudentQuerySelect();
					cour.setCno(rs.getString(1));
					cour.setCname(rs.getString(2));
					cour.setCcredit(rs.getDouble(3));
					allCourse.add(cour);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		request.setAttribute("allCourse", allCourse);
		RequestDispatcher dis = request.getRequestDispatcher("studentQuerySelectSuccess.jsp");
		dis.forward(request, response);
		}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
