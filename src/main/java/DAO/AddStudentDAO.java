package DAO;

import VO.Student;

import Util.DbUtil;

public class AddStudentDAO{
	public Boolean add(Student student) {
		String sql = "insert into student values('"+student.getSno()+"','"+student.getSname()+"','"+student.getSsex()+"','"+student.getSage()+"','"+student.getSclass()+"','"+student.getSpassword()+"');";
		int result = DbUtil.executeUpdate(sql);	
			if (result!=0)
				return true;
			else
				return false;
		}
}