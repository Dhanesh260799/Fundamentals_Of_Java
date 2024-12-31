package constructors;

class Person {
	String name;
	public Person() {
		System.out.println("Person class constructor invoked");
		name = "Swathi";
	}
	
	public Person(String name) {
		System.out.println("Person class Parameterized constructor Invoked");
		this.name = name;
	}
}

class Employee extends Person {
	String designation;
	public Employee() {
		System.out.println("Employee class constructor invoked");
		designation = "Manager";
	}
	
	public Employee(String designation) {
		super("Swathi");
		System.out.println("Employee class Parameterized constructor Invoked");
		this.designation = designation;
	}
}

public class ConstructorChainingWithInheritence {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		Employee employee1 = new Employee("Manager");
	}

}
