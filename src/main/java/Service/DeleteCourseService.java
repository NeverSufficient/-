package Service;

import VO.Course;

import DAO.DeleteCourseDAO;

public class DeleteCourseService {
	public Boolean deleteCheck(Course course){
		DeleteCourseDAO deleteCheck=new DeleteCourseDAO();
        Boolean flag= deleteCheck.delete(course);
        return flag;
   }
}