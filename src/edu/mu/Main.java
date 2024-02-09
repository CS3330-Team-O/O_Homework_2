package edu.mu;
import edu.mu.student.StudentManager;

public class Main {

  public static void main(String[] args) {
    // Instantiate StudentManager, perform operations based on the requirements.
	System.out.println("Create StudentManager");
    StudentManager studentManager = new StudentManager();
    // Read student data from a file and initialize Student objects.
    System.out.println("Read from file");
    boolean fileReadStatus = studentManager.readFromFile("studentData.txt");
    // Display all students.
    System.out.println("Students: ");
    studentManager.displayStudents();
    // Search for a student by ID.
    System.out.println("Search student by ID 101: ");
    boolean studentFound = studentManager.searchStudentById(101);
    // Update the grade of a student by ID.
    System.out.println("Update Student ID 102 to grade 95: ");
    boolean studentGradeUpdateStatus = studentManager.updateStudentGradeById(102, 95);
    // Display all students after the update.
    System.out.println("Students: ");
    studentManager.displayStudents();
  }

}
