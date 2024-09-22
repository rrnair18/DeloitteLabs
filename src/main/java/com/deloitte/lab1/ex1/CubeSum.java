package com.deloitte.lab1.ex1;

import java.util.Scanner;

class CubeSum {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();


        int cubeSum = calculateCubeSum(number);
        System.out.println("The sum of the cubes of the digits is: " + cubeSum);
        
        sc.close();

	}
	
	
    public static int calculateCubeSum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum;
    }

}
