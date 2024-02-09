package edu.mu.student;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

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
		Path path = Paths.get(fileName);
		try {
			this.students = new Student[(int) Files.lines(path).count()];
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Scanner scanner = new Scanner(new FileInputStream(fileName));
			int counter = 0;
			while(scanner.hasNextLine()) {
				int id = scanner.nextInt();
				String name1 = scanner.next();
				String name2 = scanner.next();
				double grade = scanner.nextDouble();
				String name = name1 + " " + name2;
				Student myStudent = new Student(id, name, grade);
				students[counter] = myStudent;
				counter++;
				System.out.println("\nStudent Object: ");
				System.out.println(myStudent);
			}
			scanner.close();
			return true;
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found!");
			return false;
		}
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

