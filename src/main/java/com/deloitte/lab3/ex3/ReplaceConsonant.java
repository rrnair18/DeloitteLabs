package com.deloitte.lab3.ex3;

import java.util.Scanner;

public class ReplaceConsonant {

	public static String alterString(String str) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			if (isConsonant(currentChar)) {
				char nextChar = (char) (currentChar + 1);
				result.append(nextChar);
			} else {
				result.append(currentChar);
			}
		}

		return result.toString();
	}

	public static boolean isConsonant(char ch) {
		
		char lowerChar = Character.toLowerCase(ch);
		boolean checkConsonant = (lowerChar >= 'a' && lowerChar <= 'z') && ("aeiou".indexOf(lowerChar) == -1);
		return checkConsonant;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string : ");
		String input = sc.nextLine();

		String result = alterString(input);

		System.out.println("Altered String: " + result);

		sc.close();
	}
}
