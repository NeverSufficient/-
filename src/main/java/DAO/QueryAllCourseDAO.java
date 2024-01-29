package DAO;


import java.sql.ResultSet;

import Util.DbUtil;

public class QueryAllCourseDAO{
	public ResultSet query() {
		String sql = "select * from course;";
		ResultSet rs = DbUtil.executeQuery(sql);		
		if(rs != null)
			return rs;
		else
			return null;
	}
}