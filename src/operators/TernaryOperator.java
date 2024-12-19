package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		boolean isAuthenticated = true;
		
		if(isAuthenticated)
			System.out.println("You are logged in successfully.");
		else 
			System.out.println("You are not logged in.");
		
		String result = (isAuthenticated) ? "Logged-in" : "Not Logged-in";
		System.out.println(result);
	}
	
}
