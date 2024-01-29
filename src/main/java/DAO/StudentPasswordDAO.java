package DAO;

import VO.Student;

import Util.DbUtil;

public class StudentPasswordDAO{
	public Boolean modify(Student student) {
		String sql = "update student set Spassword = '"+student.getSpassword()+"'where Sno = '"+student.getSno()+"';";
		int result = DbUtil.executeUpdate(sql);	
			if (result!=0)
				return true;
			else
				return false;
		}
}