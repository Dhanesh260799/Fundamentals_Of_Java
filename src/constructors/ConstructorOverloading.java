package constructors;

class StudentDetail extends Object{
	// Data members
	private int studentId;
	private String studentName;
	private int studentAge;
	
	public StudentDetail() {
//		this.studentId = 100;
//		this.studentName = "Swathi";
//		this.studentAge = 18;
		studentId = 100;
		studentName = "Swathi";
		studentAge = 18;
	}
	
	public StudentDetail(int sId, String sName, int sAge) {
		studentId = sId;
		studentName = sName;
		studentAge = sAge;
	}
	
	public StudentDetail(int studentId, int studentAge, String studentName) {
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
public class ConstructorOverloading {

	public static void main(String[] args) {
		
		StudentDetail student = new StudentDetail();
		student.displayDetails();
		
		StudentDetail student1 = new StudentDetail(101, 25, "Dheshu");
		student1.displayDetails();
		
		StudentDetail student2 = new StudentDetail(102, "Cooper", 3);
		student2.displayDetails();
	}
}
