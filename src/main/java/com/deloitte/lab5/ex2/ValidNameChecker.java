package com.deloitte.lab5.ex2;

import java.util.Scanner;

public class ValidNameChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String FirstName;
		String LastName;

		System.out.println("Enter First Name : ");
		FirstName = sc.nextLine();

		System.out.println("Enter Last Name : ");
		LastName = sc.nextLine();

		try {
			isNameEmpty(FirstName, LastName);
			System.out.println("Name entry accepted");
		} catch (InvalidNameException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			sc.close();
		}

	}

	public static void isNameEmpty(String FName, String LName) throws InvalidNameException {
		if (FName.isBlank()) {
			throw new InvalidNameException("First Name is blank. ");
		} else if (LName.isBlank()) {
			throw new InvalidNameException("Last Name is blank ");
		}
	}
}
