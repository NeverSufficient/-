package Service;

import VO.Teacher;

import DAO.TeacherPasswordDAO;

public class TeacherPasswordService {
	public Boolean modifyCheck(Teacher teacher){
		TeacherPasswordDAO modifyCheck=new TeacherPasswordDAO();
        Boolean flag= modifyCheck.modify(teacher);
        return flag;
   }
}