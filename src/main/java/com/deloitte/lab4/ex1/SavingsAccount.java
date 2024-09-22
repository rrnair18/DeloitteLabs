package com.deloitte.lab4.ex1;

//Savings Account
//Add a variable called minimum Balance and assign final modifier.
//Override method called withdraw (This method should check for minimum balance and allow withdraw to happen)

public class SavingsAccount extends Account {
	
	final double minBalance = 500;

	public SavingsAccount(Person accHolder, double initialBalance) {
		super(accHolder, initialBalance);
	}

	@Override
	public void withdraw(double amount) {
    	if (amount > 0 && Balance - amount > minBalance ) {
    		System.out.println("Minimum balance of 500 maintained. Withdrawal Successfull.");
    	} else {
    		System.out.println("Withdrawal denied! Minimum balance of INR 500 must be maintained.");
    	}
	}
	
    public static void main(String[] args) {
    	
        Person smith = new Person();
        smith.setName("Smith");
        smith.setAge(28);
    	
        SavingsAccount smithAccount = new SavingsAccount(smith, 2000);
        
        smithAccount.deposit(2000);

        System.out.println(smith.getName() + "'s Initial Balance: " + smithAccount.getBalance());
        
        smithAccount.withdraw(2000);
        System.out.println(smith.getName() + "'s New Balance: " + smithAccount.getBalance());

    }

}