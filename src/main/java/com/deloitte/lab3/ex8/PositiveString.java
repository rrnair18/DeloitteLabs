package com.deloitte.lab3.ex8;

import java.util.Scanner;

public class PositiveString {

    public static boolean isPositiveString(String str) {

        str = str.toUpperCase(); //Mixed case strings might be incorrectly determined due to ASCII representation

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < str.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string : ");
		String input = sc.nextLine();
        
        if (isPositiveString(input)) {
            System.out.println(input + " is a positive string.");
        } else {
            System.out.println(input + " is not a positive string.");
        }
        
        sc.close();
    }
}
