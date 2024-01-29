package DAO;


import java.sql.ResultSet;

import Util.DbUtil;
import VO.Course;

public class QueryCourseDAO{
	public ResultSet query(Course course) {
		String str1 = course.getCname()+"%";
		String str2 = "%"+course.getCname();
		String str3 = "%"+course.getCname()+"%";
		String sql = "select * from course where cname like '"+ str1 +"'"+"or cname like '"+str2+"'or cname like '"+str3+"';";
		ResultSet rs = DbUtil.executeQuery(sql);		
		if(rs != null)
			return rs;
		else
			return null;
	}
}