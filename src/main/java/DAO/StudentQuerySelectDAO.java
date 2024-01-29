package DAO;


import java.sql.ResultSet;

import Util.DbUtil;
import VO.StudentQuerySelect;

public class StudentQuerySelectDAO{
	public ResultSet query(StudentQuerySelect studentQuerySelect) {
		String sql = "select Cno,Cname,Ccredit from studentQuerySelect_view where sno = '"+studentQuerySelect.getSno()+"';";
		ResultSet rs = DbUtil.executeQuery(sql);		
		if(rs != null)
			return rs;
		else
			return null;
	}
}