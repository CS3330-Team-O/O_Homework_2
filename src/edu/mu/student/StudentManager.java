package edu.mu.student;

public class StudentManager {
  private Student[] students;

  public StudentManager() {
    this.students = new Student[10];
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
      if (this.students[i].getId() == id) {
        this.students[i].setGrade(grade);
        return true;
      }
    }
    return false;
  }
}
