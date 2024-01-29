package Service;

import VO.Student;

import DAO.StudentPasswordDAO;

public class StudentPasswordService {
	public Boolean modifyCheck(Student student){
		StudentPasswordDAO modifyCheck=new StudentPasswordDAO();
        Boolean flag= modifyCheck.modify(student);
        return flag;
   }
}