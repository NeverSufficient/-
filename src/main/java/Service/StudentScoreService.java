package Service;

import VO.StudentScore;

import java.sql.ResultSet;

import DAO.StudentScoreDAO;

public class StudentScoreService {
	public ResultSet queryCheck(StudentScore studentScore){
		StudentScoreDAO queryCheck=new StudentScoreDAO();
        ResultSet rs= queryCheck.score(studentScore);
        return rs;
   }
}