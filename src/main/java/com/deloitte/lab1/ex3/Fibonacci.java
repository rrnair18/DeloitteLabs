package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Fibonacci {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int recursiveResult = fibonacciRecursive(n);
        int iterativeResult = fibonacciIterative(n);

        System.out.println("Recursive result: " + recursiveResult);
        System.out.println("Iterative result: " + iterativeResult);
        
        sc.close();
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 2) {
            return 1;
        }

        int first = 1;
        int second = 1;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;

    }
}
