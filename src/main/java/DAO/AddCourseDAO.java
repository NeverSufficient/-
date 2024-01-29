package DAO;

import VO.Course;

import Util.DbUtil;

public class AddCourseDAO{
	public Boolean add(Course course) {
		String sql = "insert into course values('"+course.getCno()+"','"+course.getCname()+"','"+course.getCcredit()+"','"+course.getCintroduction()+"');";
		int result = DbUtil.executeUpdate(sql);	
			if (result!=0)
				return true;
			else
				return false;
		}
}