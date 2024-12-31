package polymorphism;

interface IABCBank {
	
	default void welcome() {
		System.out.println("Welcome to ABC Bank!!");
	};
	void openAccount();
	void closeAccount();
}

interface IBankAccount {
	void deposit();
	void withdraw();
	void balance();
}

class Saving implements IBankAccount, IABCBank {

	@Override
	public void deposit() {
		System.out.println("Deposit in saving account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw from saving account");
		
	}

	@Override
	public void balance() {
		System.out.println("Balance in saving account");
		
	}

	@Override
	public void openAccount() {
		System.out.println("Open account");
		
	}

	@Override
	public void closeAccount() {
		System.out.println("Close account");
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		Saving saving = new Saving();
		saving.welcome();
		saving.deposit();
		saving.withdraw();
		saving.balance();
		saving.openAccount();
		saving.closeAccount();
	}
}
