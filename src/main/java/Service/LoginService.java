package Service;

import VO.Login;

import java.sql.SQLException;

import DAO.LoginDAO;

public class LoginService {
	public Boolean loginCheck(Login login) throws SQLException{
		LoginDAO loginCheck=new LoginDAO();
        Boolean flag= loginCheck.login(login);
        return flag;
   }
}