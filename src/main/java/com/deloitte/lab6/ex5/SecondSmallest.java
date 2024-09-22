package com.deloitte.lab6.ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondSmallest {

    public static int getSecondSmallest(int[] arr) {
        List<Integer> numberList = new ArrayList<>();
        for (int num : arr) {
            numberList.add(num);
        }
        
        Collections.sort(numberList);
        
        return numberList.get(1);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 9, 3, 7};
        
        int secondSmallest = getSecondSmallest(numbers);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
