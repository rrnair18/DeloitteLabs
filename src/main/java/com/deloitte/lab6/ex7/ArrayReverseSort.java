package com.deloitte.lab6.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayReverseSort {
	public static int[] getSorted(int[] arr) {
		
        List<Integer> reversedList = new ArrayList<>();
        
        for (int num : arr) {
            String reversedString = new StringBuilder(String.valueOf(num)).reverse().toString();
            reversedList.add(Integer.parseInt(reversedString));
        }
        
        Collections.sort(reversedList);
        
        int[] sortedArray = new int[reversedList.size()];
        for (int i = 0; i < reversedList.size(); i++) {
            sortedArray[i] = reversedList.get(i);
        }
        
        return sortedArray;
    }

    public static void main(String[] args) {
    	
        int[] numbers = {123, 456, 789, 101 , 112};
        
        int[] result = getSorted(numbers);
        
        System.out.print("Sorted array after reversing: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
