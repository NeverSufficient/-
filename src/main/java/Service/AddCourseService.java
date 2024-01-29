package Service;

import VO.Course;

import DAO.AddCourseDAO;

public class AddCourseService {
	public Boolean addCheck(Course course){
		AddCourseDAO addCheck=new AddCourseDAO();
        Boolean flag= addCheck.add(course);
        return flag;
   }
}