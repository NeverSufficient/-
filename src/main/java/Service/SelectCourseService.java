package Service;

import VO.SC;

import DAO.SelectCourseDAO;

public class SelectCourseService {
	public Boolean selectCheck(SC sc){
		SelectCourseDAO selectCheck=new SelectCourseDAO();
        Boolean flag= selectCheck.select(sc);
        return flag;
   }
}