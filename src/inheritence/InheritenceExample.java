package inheritence;

import java.util.Scanner;

class Student{
	// Data members
	private int studentId;
	private String studentName;
	private int studentAge;
	Scanner scanner = new Scanner(System.in);
	
	
	public Student() {
		studentId = 100;
		studentName = "Swathi";
		studentAge = 18;
	}
	
	public Student(int sId, String sName, int sAge) {
		this.studentId = sId;
		this.studentName = sName;
		this.studentAge = sAge;
	}
	
	void acceptDetails() {
		System.out.println("Enter Student Id: ");
		studentId = scanner.nextInt();
		System.out.println("Enter Student Name: ");
		studentName = scanner.next();
		System.out.println("Enter Student Age: ");
		studentAge = scanner.nextInt();
	}
	void displayDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Age : " + studentAge);
	}
}

class Marks extends Student {
	protected float objectiveMarks;
	protected float subjectiveMarks;
	void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter Objective Marks: ");
		objectiveMarks = scanner.nextFloat();
		System.out.println("Enter Subjective Marks: ");
		subjectiveMarks = scanner.nextFloat();
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Student Objective Marks : " + objectiveMarks);
		System.out.println("Student Subjective Marks : " + subjectiveMarks);
	}
}

class Sports extends Marks {
	protected float score;
	void acceptDetails() {
		super.acceptDetails();
		System.out.println("Enter Sports Score: ");
		score = scanner.nextFloat();
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Sports Score : " + score);
	}
}

class Result extends Sports {
	private float totalMarks, averageMarks;
	void calculate() {
		totalMarks = objectiveMarks + subjectiveMarks + score;
		averageMarks = totalMarks / 3;
		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Average Marks : " + averageMarks);
	}
	
}


public class InheritenceExample {

	public static void main(String[] args) {
		
		Result obj = new Result();
		obj.acceptDetails();
		obj.displayDetails();
//		Sports obj = new Sports();
//		obj.acceptDetails();
//		obj.displayDetails();
		
//		Marks marks = new Marks();
//		marks.acceptDetails();
////		marks.acceptDetails1();
//		marks.displayDetails();
////		marks.displayDetails1();
	}
}
