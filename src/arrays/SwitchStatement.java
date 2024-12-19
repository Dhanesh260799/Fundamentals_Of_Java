package arrays;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("admin - Gets full access");
		System.out.println("Subadmin - Gets access to create/delete courses");
		System.out.println("testprep - Gets access to create/delete tests ");
		System.out.println("user - Gets access to consume content");
		System.out.print("Enter your choice : ");
		String user = scanner.nextLine();
		
		switch(user) {
		case "admin":
			System.out.println("Gets full access");
			break;
			
		case "subadmin":
			System.out.println("Gets access to create/delete courses");
			break;
			
		case "testprep":
			System.out.println("Gets access to create/delete tests ");
			break;
			
		case "user":
			System.out.println("Gets access to consume content");
			break;
			
		default:
			System.out.println("You are a trial user");
			break;
		}
	}
}
