package Service;

import VO.StudentQuerySelect;

import java.sql.ResultSet;

import DAO.StudentQuerySelectDAO;

public class StudentQuerySelectService {
	public ResultSet queryCheck(StudentQuerySelect studentQuerySelect){
		StudentQuerySelectDAO queryCheck=new StudentQuerySelectDAO();
        ResultSet rs= queryCheck.query(studentQuerySelect);
        return rs;
   }
}
