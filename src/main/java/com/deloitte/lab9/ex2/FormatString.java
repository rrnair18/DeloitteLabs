package com.deloitte.lab9.ex2;

import java.util.Scanner;

public class FormatString {

	@FunctionalInterface
	interface StringSpaceSplit {
		void apply(String s);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string : ");
		String input = sc.nextLine();

		StringSpaceSplit stringFormatter = (str) ->  System.out.println("Formatted string : "+ String.join(" ", str.split("")));
	
		stringFormatter.apply(input);
		sc.close();

	}
}
