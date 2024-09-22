package com.deloitte.lab1.ex4;

import java.util.Scanner;

public class Primes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        System.out.println("Prime numbers up to " + number + " : ");
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();    }

    public static boolean isPrime(int num) {
        
    	if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }	
}

