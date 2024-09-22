package com.deloitte.lab4.ex1;

public class Account{
	
	static long accountCounter = 0;
	long AccNum;
	double Balance;
	Person accHolder = new Person();
	
    public Account(Person accHolder, double initialBalance) {
        this.AccNum = ++accountCounter; 
        this.accHolder = accHolder;
        this.Balance = initialBalance; 
        System.out.println("Accout Creation by " + accHolder.name + " is successfull");
    }
	
    public void deposit(double amount) {
    	Balance += amount;
    }

	public void withdraw(double amount) {
    	if (amount > 0 && (Balance - amount) >= 500) {
    		Balance -= amount;
    	} else {
    		System.out.println("Withdrawal denied! Minimum balance of INR 500 must be maintained.");
    	}
    }

    double getBalance() {
    	return Balance;		
    }

    public long getAccNum() {
    	return AccNum;
    }

    public void setAccNum(long accNum) {
		AccNum = accNum;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}
	
}



