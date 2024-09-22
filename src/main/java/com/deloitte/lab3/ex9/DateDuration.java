package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDuration {

    public static void printDuration(String inputDate) {

    	LocalDate startDate = LocalDate.parse(inputDate);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(startDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.printf("Duration from %s to today is: %d years, %d months, and %d days.%n",
                inputDate, years, months, days);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        scanner.close();

        printDuration(inputDate);
    }
}
