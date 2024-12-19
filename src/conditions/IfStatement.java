package conditions;

public class IfStatement {

	public static void main(String[] args) {
		
		boolean isAuthenticated = true;
		
		if(isAuthenticated)
			System.out.println("Logged In");
		if(!isAuthenticated)
			System.out.println("Not Logged In");
	}
}
