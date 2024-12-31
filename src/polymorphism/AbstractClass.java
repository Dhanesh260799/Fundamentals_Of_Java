package polymorphism;

abstract class ABCBank {
	
	public static void message() {
		System.out.println("Welcome to ABC Bank!!");
	}
	
	abstract void openAccount();
	abstract void closeAccount();
	
}

abstract class BankAccount extends ABCBank {
	
	abstract void deposit();
	abstract void withdraw();
	abstract void balance();
	
}

class SavingAccount extends BankAccount {

	@Override
	void deposit() {
		System.out.println("Deposit in Saving Account");
		
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw from Saving Account");
		
	}

	@Override
	void balance() {
		System.out.println("Balance in Saving Account");
		
	}

	@Override
	void openAccount() {
		System.out.println("Open Account");
		
	}

	@Override
	void closeAccount() {
		System.out.println("Close Account");
		
	}
	
}

class CurrentAccount extends BankAccount {

	@Override
	void deposit() {
		System.out.println("Deposit in Current Account");
		
	}

	@Override
	void withdraw() {
		System.out.println("Withdraw from Current Account");
		
	}

	@Override
	void balance() {
		System.out.println("Balance in Current Account");
		
	}

	@Override
	void openAccount() {
		System.out.println("Open Account");
		
	}

	@Override
	void closeAccount() {
		System.out.println("Close Account");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		
		ABCBank.message();
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.message();
		savingAccount.deposit();
		savingAccount.withdraw();
		savingAccount.balance();
		savingAccount.openAccount();
		savingAccount.closeAccount();
		
		System.out.println("**************"); 
		
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.deposit();
		currentAccount.withdraw();
		currentAccount.balance();
		currentAccount.openAccount();
		currentAccount.closeAccount();
		
	}
}
