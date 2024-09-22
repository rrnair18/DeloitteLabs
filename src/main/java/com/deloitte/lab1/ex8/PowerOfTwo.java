package com.deloitte.lab1.ex8;

import java.util.Scanner;

public class PowerOfTwo {

    static boolean checkNumber(int n)
    {
        if (n == 0)
            return false;

        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check if it is a power of 2: ");
		int n = sc.nextInt();
		
		boolean result = checkNumber(n);
		
		System.out.println("The number " + n + " being a power of 2 is "+ result);

	}
	



}
