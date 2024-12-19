package conditions;

public class ConditionsWithOperator {

	public static void main(String[] args) {
		
		boolean isLoggedIn = true;
		boolean isEmailVerified = false;
		boolean isCardVerified = true;
		
		if(isLoggedIn && isEmailVerified && isCardVerified)
			System.out.println("You are allowed to make a purchase");
		else 
			System.out.println("You are not allowed to make a purchase");
		
		if(isLoggedIn) {
			if(isEmailVerified) {
				if(isCardVerified) {
					System.out.println("You are allowed to make a purchase");
				}
			}
		}
	}
}
