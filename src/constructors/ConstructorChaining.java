package constructors;

class StudentDet extends Object{
	// Data members
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public StudentDet() {
//		this.studentId = 100;
//		this.studentName = "Swathi";
//		this.studentAge = 18;
		this(101, "Dheshu", 25);
		studentId = 100;
		studentName = "Swathi";
		studentAge = 18;
	}
	
	public StudentDet(int sId, String sName, int sAge) {
		this(101, 26, "Cooper");
		studentId = sId;
		studentName = sName;
		studentAge = sAge;
	}
	
	public StudentDet(int studentId, int studentAge, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	void displayDetails() {
		System.out.println("Student Id : " + studentId);
		System.out.println("Student Name : " + studentName);
		System.out.println("Student Id : " + studentAge);
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		
		StudentDet student = new StudentDet();
		student.displayDetails();
	}
}
