package sample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class StudentDetails {
	String name;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
