package sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sample.StudentDetails;

@Repository
public class StudentDaoImpl implements StudentDao {

	private static final Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);

	private SessionFactory sessionFactory;
	
	@Autowired(required = true)
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public void saveStudentData(StudentDetails studentData) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(studentData);
		logger.info("Person saved successfully, Person Details=" + studentData);

	}

}
