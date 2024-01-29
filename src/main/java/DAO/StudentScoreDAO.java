package DAO;


import java.sql.ResultSet;

import Util.DbUtil;
import VO.StudentScore;

public class StudentScoreDAO{
	public ResultSet score(StudentScore studentScore) {
		String sql = "select Cno,Cname,Ccredit,Score from studentScore_view where Sno = '"+studentScore.getSno()+"';";
		ResultSet rs = DbUtil.executeQuery(sql);		
		if(rs != null)
			return rs;
		else
			return null;
	}
}