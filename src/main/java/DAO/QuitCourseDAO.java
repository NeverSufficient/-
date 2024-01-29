package DAO;

import VO.SC;

import Util.DbUtil;

public class QuitCourseDAO{
	public Boolean quit(SC sc) {
		String sql = "delete from sc where sno = '"+sc.getSno()+"' and cno = '"+sc.getCno()+"';";
		int result = DbUtil.executeUpdate(sql);	
			if (result!=0)
				return true;
			else
				return false;
		}
}