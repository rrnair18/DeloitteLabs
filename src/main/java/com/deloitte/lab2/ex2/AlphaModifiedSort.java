package com.deloitte.lab2.ex2;

import java.util.Arrays;

public class AlphaModifiedSort {

    public static String sortStrings(String[] arr) {

        Arrays.sort(arr);

        int n = arr.length;
        int mid = (n % 2 == 0) ? n / 2 : (n / 2) + 1;

        for (int i = 0; i < n; i++) {
            if (i < mid) {
                arr[i] = arr[i].toUpperCase();
            } else {
                arr[i] = arr[i].toLowerCase();
            }
        }

        return String.join(", ", arr);
    }
    
    public static void main(String[] args) {
		
        String[] arr = {"Sonu", "Bonu", "Tonu" ,"Monu"};

        String result = sortStrings(arr);
        System.out.println("Sorted and modified array: " + result);
	}

}
