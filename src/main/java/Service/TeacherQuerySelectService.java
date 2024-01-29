package Service;

import VO.TeacherQuerySelect;

import java.sql.ResultSet;

import DAO.TeacherQuerySelectDAO;

public class TeacherQuerySelectService {
	public ResultSet queryCheck(TeacherQuerySelect teacherQuerySelect){
		TeacherQuerySelectDAO queryCheck=new TeacherQuerySelectDAO();
        ResultSet rs= queryCheck.query(teacherQuerySelect);
        return rs;
   }
}

