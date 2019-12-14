package sample;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.StudentDao;
import sample.StudentDaoImpl;

@Service
public class StudentManagerImpl implements StudentManager {

	private StudentDao studentDao;
	
	@Autowired(required = true)
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@Transactional
	public void saveStudentData(StudentDetails studentData) {
		this.studentDao.saveStudentData(studentData);
		
	}

}
