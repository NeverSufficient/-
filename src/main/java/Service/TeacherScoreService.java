package Service;

import VO.TeacherScore;

import DAO.TeacherScoreDAO;

public class TeacherScoreService {
	public Boolean scoreCheck(TeacherScore teacherScore){
		TeacherScoreDAO scoreCheck=new TeacherScoreDAO();
        Boolean flag= scoreCheck.score(teacherScore);
        return flag;
   }
}