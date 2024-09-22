package com.deloitte.lab9.ex1;

import java.util.Scanner;
import java.util.function.BiFunction;

public class LambaExponent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		BiFunction<Integer, Integer, Integer> power = (x, y) -> (int) Math.pow(x, y);

		System.out.println(+a + " ^ " + b + " = " +power.apply(a, b));

		sc.close();

	}
}
