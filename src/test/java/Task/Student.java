package Task;

import java.util.Comparator;

public class Student {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	String name;
	int id;
	char grade;
	public Student(String name, int id, char grade) {
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	
	public String toString() {
		 return "name "+name+" id="+id+" grade-"+grade;
	 }

	

}
