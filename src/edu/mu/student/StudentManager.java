package edu.mu.student;

public class StudentManager {
	private Student[] students;
	
	public StudentManager() {
		
	}
	public StudentManager(Student[] students) {
		this.students = new Student[10];
		
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	
	public boolean readFromFile(String fileName) {
	
		return true;
	}
	
	public boolean searchStudentById(int id) {
		for (int i=0; i < students.length; i++)
		{
			if(students[i].equals(id)) {
				System.out.println(students[i].toString());
				return true;
			}
		}
		
		System.out.println("Student ID not found!");
		return false;

	}

}