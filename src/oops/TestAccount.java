package oops;

public class TestAccount {

	public static void main(String[] args) {

		Account acc = new Account();

		acc.insert(10654773, "Rasel Mahmud", 10000);

		acc.displayProfile();

		acc.checkBalance();

		acc.deposit(2000);

		acc.checkBalance();

		acc.withdraw(5000);

		acc.checkBalance();

	}
}

class Account {

	int acc_no;
	String acc_name;
	float amount;

	// method to initialize object

	void insert(int acc, String name, float amnt) {
		acc_no = acc;
		acc_name = name;
		amount = amnt;
	}

	// deposit method

	void deposit(float amnt) {
		amount = amount + amnt;
	}

	// withdraw method

	void withdraw(float amnt) {
		if (amount < amnt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amnt;
			System.out.println(amnt + " Taka Withdrawal Successful");
		}
	}

	// method for checking balance

	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}

	void displayProfile() {
		System.out.println("Account No: " + acc_no + ", Name:" + acc_name + ", Current Balance:" + amount);
	}
}
