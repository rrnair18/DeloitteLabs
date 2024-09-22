package com.deloitte.lab2.ex3;

import java.util.Arrays;

public class ReverseAndSort {

    public static int[] getSorted(int[] arr) {
    	
        int[] revNum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            String revStr = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            revNum[i] = Integer.parseInt(revStr);
        }

        Arrays.sort(revNum);

        return revNum;
    }
	
	
	
	public static void main(String[] args) {
		
		 int[] array = {123, 456, 789, 101, 112};

		 int[] result = getSorted(array);
		 System.out.println("Sorted array with reversed numbers: " + Arrays.toString(result));
	}

}
