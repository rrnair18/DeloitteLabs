package com.deloitte.lab9.ex5;
import java.util.Scanner;

interface FactorialCalculator {
    long calculate(int num);
}

public class CalculateFactorial {

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();

        FactorialCalculator methodRefCalc = CalculateFactorial::factorial;
        long factorialUsingMethodRef = methodRefCalc.calculate(number);
        System.out.println("Factorial of " + number + " using method reference: " + factorialUsingMethodRef);


        sc.close();
    }
}
