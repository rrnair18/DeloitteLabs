package com.deloitte.lab5.ex1;

import java.util.Scanner;

public class ValidAgeChecker {

	int age;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age : ");
		int age = sc.nextInt();

		try {	
			validateAge(age); 
			System.out.println("Age is valid: " + age);
		}
		catch(InvalidAgeException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}
	
	public static void validateAge(int age) throws InvalidAgeException {
		if (age <= 15) {
			throw new InvalidAgeException("Age must be greater than 15.");
		}
	}

}
