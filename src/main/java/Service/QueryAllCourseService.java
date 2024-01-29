package Service;


import java.sql.ResultSet;

import DAO.QueryAllCourseDAO;

public class QueryAllCourseService {
	public ResultSet queryCheck(){
		QueryAllCourseDAO queryCheck=new QueryAllCourseDAO();
        ResultSet rs= queryCheck.query();
        return rs;
   }
}
