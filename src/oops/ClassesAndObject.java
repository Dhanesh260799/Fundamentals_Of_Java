package oops;

import java.util.Scanner;

class Student {
	
	// Data members
	int studentId;
	String studentName;
	int studentAge;
	Scanner scanner = new Scanner(System.in);
	
	// Member Function
	public void acceptDetails() {
		System.out.print("Enter student  id : ");
		studentId = scanner.nextInt();
		System.out.print("Enter Student Name : ");
		studentName = scanner.next();
		System.out.println("Enter Student Age : ");
		studentAge = scanner.nextInt();
	}
	
	public void displayDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
	}
}

public class ClassesAndObject {

	public static void main(String[] args) {
	
	// Creating an object of class Student	
	Student student = new Student();
	student.acceptDetails();
	student.displayDetails();
	
	Student student1 = new Student();
	student1.acceptDetails();
	student1.displayDetails();
	
	}
}
