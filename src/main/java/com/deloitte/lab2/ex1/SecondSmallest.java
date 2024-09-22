package com.deloitte.lab2.ex1;


public class SecondSmallest {

	private static int getSecondSmallest(int[] arr) {
		
		int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }        
        
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5, 3, 7, 2, 8, 4};
		int secondSmallest = getSecondSmallest(arr);
		
		System.out.println("The second smallest element is: " + secondSmallest);

	}

}
