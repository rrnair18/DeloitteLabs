package com.deloitte.lab1.ex7;

import java.util.Scanner;

public class CheckNumber {

    public static boolean checkNumber(int number) {

        String numStr = Integer.toString(number);

        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) < numStr.charAt(i - 1)) {
                return false; 
            }
        }

        return true;
    }

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter to check you number: ");
        int number = sc.nextInt();

        if (checkNumber(number)) {
            System.out.println(number + " is in increasing order.");
        } else {
            System.out.println(number + " is not in increasing order.");
        }
        
        sc.close();
    }
}