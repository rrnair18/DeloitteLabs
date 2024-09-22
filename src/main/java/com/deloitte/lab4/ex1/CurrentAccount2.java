package com.deloitte.lab4.ex1;

public class CurrentAccount2 extends Account {

	double overDraftLimit = -500;

	public CurrentAccount2(Person accHolder, double initialBalance) {
		super(accHolder, initialBalance);
	}

}
