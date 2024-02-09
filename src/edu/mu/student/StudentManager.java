package edu.mu.student;

public class StudentManager {
<<<<<<< HEAD
	private StudentManager[] students;

	public StudentManager() {
		this.students = new StudentManager[10];

=======
	private Student[] students;
	
	public StudentManager() {
		
	}
	public StudentManager(Student[] students) {
		this.students = new Student[10];
		
>>>>>>> c8cee11c814303b50190cc6f90824148495b0146
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

<<<<<<< HEAD

	/*public boolean readFromFile(String fileName) {

	}*/
}
=======
	
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
>>>>>>> c8cee11c814303b50190cc6f90824148495b0146
