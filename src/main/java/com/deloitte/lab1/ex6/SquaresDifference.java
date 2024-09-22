package com.deloitte.lab1.ex6;

import java.util.Scanner;

public class SquaresDifference {

    public static int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i; 
            sum += i; 
        }
        
        int squareOfSum = sum * sum; 
        
        return sumOfSquares - squareOfSum;
    }
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
    	System.out.print("Enter the value of n: ");
    	int n = sc.nextInt(); 
        
        int result = calculateDifference(n);
        System.out.println("The difference for n = " + n + " is: " + result);
        sc.close();
        
    }

}

