package Service;

import VO.Course;

import java.sql.ResultSet;

import DAO.QueryCourseDAO;

public class QueryCourseService {
	public ResultSet queryCheck(Course course){
		QueryCourseDAO queryCheck=new QueryCourseDAO();
        ResultSet rs= queryCheck.query(course);
        return rs;
   }
}
