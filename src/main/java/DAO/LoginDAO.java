package DAO;

import VO.Login;

import java.sql.ResultSet;
import java.sql.SQLException;

import Util.DbUtil;

public class LoginDAO{
	public Boolean login(Login login) throws SQLException {
		String sql = "select * from login where id = '"+login.getId()+"' and pwd = '"+login.getPassword()+"';";
		ResultSet rs = DbUtil.executeQuery(sql);	
			if (rs.next())
				return true;
			else
				return false;
		}
}