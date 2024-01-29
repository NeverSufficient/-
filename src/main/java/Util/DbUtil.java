package Util;
import java.sql.*;

public class DbUtil {

	private static final String URL = "jdbc:mysql://localhost:3306/选课管理系统?user=root&password=&useSSL=true&characterEncoding=utf-8";
	protected static Statement s=null;
	protected static ResultSet rs = null;
	protected static Connection conn = null;
	public static synchronized Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static int executeUpdate(String sql)
	{
		int result = 0;
		try {
			s = getConnection().createStatement();
			result = s.executeUpdate(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}
	public static ResultSet executeQuery(String sql)
	{
		
		try {
			s = getConnection().createStatement();
			rs = s.executeQuery(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}	
	public static void rollback() {
		try {
			getConnection().rollback();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void close()
	{
		try
		{
			if(rs!=null)
				rs.close();
			if(s!= null)
				s.close();
			if(conn!=null)
				conn.close();
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}	
}