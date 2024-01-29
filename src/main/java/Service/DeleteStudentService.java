package Service;

import VO.Student;

import DAO.DeleteStudentDAO;

public class DeleteStudentService {
	public Boolean deleteCheck(Student student){
		DeleteStudentDAO deleteCheck=new DeleteStudentDAO();
        Boolean flag= deleteCheck.delete(student);
        return flag;
   }
}