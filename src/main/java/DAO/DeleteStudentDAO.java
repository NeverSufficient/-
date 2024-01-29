package DAO;

import VO.Student;

import Util.DbUtil;

public class DeleteStudentDAO{
	public Boolean delete(Student student) {
		String sql = "delete from student where sno = '"+student.getSno()+"';";
		int result = DbUtil.executeUpdate(sql);	
			if (result!=0)
				return true;
			else
				return false;
		}
}