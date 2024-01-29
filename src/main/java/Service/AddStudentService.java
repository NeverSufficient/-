package Service;

import VO.Student;

import DAO.AddStudentDAO;

public class AddStudentService {
	public Boolean addCheck(Student student){
		AddStudentDAO addCheck=new AddStudentDAO();
        Boolean flag= addCheck.add(student);
        return flag;
   }
}