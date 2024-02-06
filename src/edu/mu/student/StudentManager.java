package edu.mu.student;

public class StudentManager {
  private StudentManager[] students;

  public StudentManager() {
    this.students = new StudentManager[10];
  }

  public boolean readFromFile(String fileName) {

    return true;
  }

  public void displayStudents() {
    if (students.length == 0) {
      System.out.println("There are no student!");
    }
    for (int i = 0; i < this.students.length; i++) {
      System.out.println(this.students[i].toString());
    }
  }

  public boolean updateStudentGradeById(int id, double grade) {
    for (int i = 0; i < this.students.length; i++) {
      if (this.students[i].id == id) {
        this.students[i].grade = grade;
        return true;
      }
    }
    return false;
  }
}
