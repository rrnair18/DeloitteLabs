package com.deloitte.lab4.ex1;

public class Main {
	public static void main(String[] args) {
		Person smith = new Person();
		smith.setName("Smith");
		smith.setAge(28);

		Person kathy = new Person();
		kathy.setName("Kathy");
		kathy.setAge(33);

		// a) Create Account for smith with initial balance as INR 2000 and for Kathy
		// with initial balance as 3000.(accNum should be auto generated).
		Account smithAccount = new Account(smith, 2000);
		Account kathyAccount = new Account(kathy, 3000);

		// b) Deposit 2000 INR to smith account.
		smithAccount.deposit(2000);

		// c) Withdraw 2000 INR from Kathy's account
		kathyAccount.withdraw(2000);

		// d) Display updated balances in both the account.
		System.out.println(smith.getName() + "'s updated balance: " + smithAccount.getBalance());
		System.out.println(kathy.getName() + "'s updated balance: " + kathyAccount.getBalance());

		// e) Extend the functionality through Inheritance and polymorphism. Inherit two
		// classes Savings Account and Current Account from account class. And Implement
		// the following in the respective classes.
		// For solution refer to SavingAccount.java and CurrentAccount.java

	}
}
