package basics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		 // Scanner Class - Getting an input from user 
		  Scanner scanner = new Scanner(System.in); 
		  System.out.print("Enter Your Name: "); 
		  String name1 = scanner.nextLine(); 
		  System.out.print("Enter Your Age: "); 
		  int age1 = scanner.nextInt(); 
		  System.out.print("Enter Your Gender(M/F): "); 
		  char gender1 = scanner.next().charAt(0); 
		  System.out.print("Enter Your Contact Number: ");
		  double contact = scanner.nextDouble();
		  
		  System.out.println("Enter Your Name: " + name1);
		  System.out.println("Enter Your Age: " + age1);
		  System.out.println("Enter Your Gender(M/F): " + gender1);
		  System.out.println("Enter Your Contact Number: " + contact);
		  
	}
}
