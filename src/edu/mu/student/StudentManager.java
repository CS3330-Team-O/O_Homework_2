package edu.mu.student;

public class StudentManager {
	private StudentManager[] students;

	public StudentManager() {
		this.students = new StudentManager[10];

	}

	public StudentManager[] getStudents() {
		return students;
	}

	public void setStudents(StudentManager[] students) {
		this.students = students;
	}


	/*public boolean readFromFile(String fileName) {

	}*/
}
