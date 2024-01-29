package Service;

import VO.SC;

import DAO.QuitCourseDAO;

public class QuitCourseService {
	public Boolean quitCheck(SC sc){
		QuitCourseDAO quitCheck=new QuitCourseDAO();
        Boolean flag= quitCheck.quit(sc);
        return flag;
   }
}