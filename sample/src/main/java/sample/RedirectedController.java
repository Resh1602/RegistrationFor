package sample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sample.StudentManager;
import sample.StudentManagerImpl;

@Controller
public class RedirectedController {

	private StudentManager studentManager;

	@Autowired(required = true)
	//@Qualifier(value = "studentManager")
	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
	}

	@RequestMapping(value = "/redirect", params = "submit", method = RequestMethod.GET)
	public void save(@ModelAttribute("studentData") StudentDetails studentData) {
		/*StudentDetails studentData = new StudentDetails();
		studentData.setName(req.getParameter("name"));
		studentData.setAge(Integer.parseInt(req.getParameter("age")));*/
		
		if(studentData.getAge() == 0){
			//new person, add it
			this.studentManager.saveStudentData(studentData);
		} 
		
		//studentManager.saveStudentData(studentData);

	}

}
