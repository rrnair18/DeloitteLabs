package com.deloitte.lab4.ex1;

//Current Account
//a) Add a variable called overdraft Limit
//b) Overridden method called withdraw (checks whether overdraft limit is reached and returns a Boolean value accordingly)

public class CurrentAccount extends Account {

	double overDraftLimit = -500;

	public CurrentAccount(Person accHolder, double initialBalance) {
		super(accHolder, initialBalance);
	}

// The original method 'withdraw' is of void type and it cannot be overridden using a boolean type
//    @Override
//    public boolean withdraw(double amount) {
//        if (Balance > overDraftLimit) {
//            return true;
//        }
//        else {
//        	return false;
//        }
//    }

	@Override
	public void withdraw(double amount) {
		
		if (Balance > 0 && Balance - amount > overDraftLimit) {
			System.out.println("Overdraft Limit not reached");
			Balance -= amount;
		} else {
			System.out.println("Overdraft Limit reached. Transcation Unsuccessfull");
		}
	}
	

	    public static void main(String[] args) {
	    	
	        Person kathy = new Person();
	        kathy.setName("Kathy");
	        kathy.setAge(33);
	        
	        CurrentAccount kathyAccount = new CurrentAccount(kathy, 3000);
	      
	        kathyAccount.withdraw(2000);
	        System.out.println(kathy.getName() + "'s Initial Balance: " + kathyAccount.getBalance());
	        
	        kathyAccount.withdraw(1500);
	        System.out.println(kathy.getName() + "'s Final Balance: " + kathyAccount.getBalance());
	        
	        
	    }



}
