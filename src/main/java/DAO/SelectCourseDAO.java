package DAO;

import VO.SC;

import Util.DbUtil;

public class SelectCourseDAO{
	public Boolean select(SC sc) {
		String sql = "insert into sc values('"+sc.getSno()+"','"+sc.getCno()+"',null);";
		int result = DbUtil.executeUpdate(sql);	
			if (result!=0)
				return true;
			else
				return false;
		}
}
