package constructors;

class Student extends Object{
	// Data members
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public Student() {
//		this.studentId = 100;
//		this.studentName = "Swathi";
//		this.studentAge = 18;
		studentId = 100;
		studentName = "Swathi";
		studentAge = 18;
	}
	
	public Student(int sId, String sName, int sAge) {
		this.studentId = sId;
		this.studentName = sName;
		this.studentAge = sAge;
	}
	
	void displayDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Id : " + studentAge);
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.displayDetails();
		
		Student student1 = new Student(101, "Dheshu", 25);
		student1.displayDetails();
		
		Student student2 = new Student(102, "Cooper", 3);
		student2.displayDetails();
	}
}
