package edu.mu.student;

public class Student {
  private int id;
  private String name;
  private double grade;

  public Student() {
  }

  public Student(int id, String name, double grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  @Override
  public String toString() {
    return "id: " + this.id + ", name: " + this.name + ", grade: " + this.grade;
  }

  public boolean equals(int id) {
    if (id == this.id) {
      return true;
    }
    return false;
  }

}
