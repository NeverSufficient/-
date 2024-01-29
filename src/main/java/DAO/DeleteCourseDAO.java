package DAO;

import VO.Course;

import Util.DbUtil;

public class DeleteCourseDAO{
	public Boolean delete(Course course) {
		String sql = "delete from course where cno = '"+course.getCno()+"';";
		int result = DbUtil.executeUpdate(sql);	
			if (result!=0)
				return true;
			else
				return false;
		}
}