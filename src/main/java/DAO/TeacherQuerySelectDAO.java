package DAO;


import java.sql.ResultSet;

import Util.DbUtil;
import VO.TeacherQuerySelect;

public class TeacherQuerySelectDAO{
	public ResultSet query(TeacherQuerySelect teacherQuerySelect) {
		String sql = "select * from teacherQuerySelect_view where Cname = '"+teacherQuerySelect.getCname()+"';";
		ResultSet rs = DbUtil.executeQuery(sql);		
		if(rs != null)
			return rs;
		else
			return null;
	}
}