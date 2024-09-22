package com.deloitte.lab2.ex4;

import java.util.Arrays;


public class ArrayModifier {
    public static int[] modifyArray(int[] inputArray) {

        Arrays.sort(inputArray);
        int[] tempArray = new int[inputArray.length];
        int uniqueCount = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0 || inputArray[i] != inputArray[i - 1]) {
                tempArray[uniqueCount++] = inputArray[i];
            }
        }

        int[] resultArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            resultArray[i] = tempArray[i];
        }

        Arrays.sort(resultArray);
        for (int i = 0; i < resultArray.length / 2; i++) {
            int temp = resultArray[i];
            resultArray[i] = resultArray[resultArray.length - 1 - i];
            resultArray[resultArray.length - 1 - i] = temp;
        }

        return resultArray;
    }

    public static void main(String[] args) {
    		
        int[] input = {7, 6, 1, 5, 8, 1, 9, 7, 3};
        int[] modifiedArray = modifyArray(input);

        System.out.println(Arrays.toString(modifiedArray));
    }
}