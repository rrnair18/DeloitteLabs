package com.deloitte.lab1.ex5;

import java.util.Scanner;

public class CalculateSum {
	
	public static void main(String[] args)	{  
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();
	        sc.close();

	        int sum = calculateSum(n);
	        System.out.println("The sum of first " + n + " natural numbers divisible by 3 or 5 is: " + sum);
	}
	
	 public static int calculateSum(int n) {
		 
	        int sum = 0;
	        int count = 0;
	        int i = 1;
	        
	        // Loop until 'count' reaches 'n'
	        while (count < n) {
	            if (i % 3 == 0 || i % 5 == 0) {
	                sum += i;
	                count++;
	            }
	            i++;
	        }
	        return sum;
	}
	
}



