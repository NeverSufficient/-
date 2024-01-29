package DAO;

import VO.TeacherScore;

import Util.DbUtil;

public class TeacherScoreDAO{
	public Boolean score(TeacherScore teacherScore) {
		String sql = "update sc set Score = '"+teacherScore.getScore()+"'where sno = '"+teacherScore.getSno()+"' and cno = (select cno from course where cname = '"+teacherScore.getCname()+"');";
		int result = DbUtil.executeUpdate(sql);	
			if (result!=0)
				return true;
			else
				return false;
		}
}