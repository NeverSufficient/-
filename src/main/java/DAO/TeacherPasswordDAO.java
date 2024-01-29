package DAO;

import VO.Teacher;

import Util.DbUtil;

public class TeacherPasswordDAO{
	public Boolean modify(Teacher teacher) {
		String sql = "update teacher set Tpassword = '"+teacher.getTpassword()+"'where Tno = '"+teacher.getTno()+"';";
		int result = DbUtil.executeUpdate(sql);	
			if (result!=0)
				return true;
			else
				return false;
		}
}