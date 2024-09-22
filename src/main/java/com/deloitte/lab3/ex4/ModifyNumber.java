package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class ModifyNumber {
	
	    public static int modifyNumber(int number1) {
	    	
	        String numStr = String.valueOf(number1);
	        
	        StringBuffer modifiedNumber = new StringBuffer();
	        
	        for (int i = 0; i < numStr.length() - 1; i++) {
	        	
	            int currentDigit = Character.getNumericValue(numStr.charAt(i));
	            int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));	           
	            
	            int difference = Math.abs(currentDigit - nextDigit);
	            
	            modifiedNumber.append(difference);
	        }
	        
	        modifiedNumber.append(numStr.charAt(numStr.length() - 1));
	        
	        return Integer.parseInt(modifiedNumber.toString());
	    }

	    public static void main(String[] args) {
	    	
			Scanner sc = new Scanner(System.in);

	        
	        System.out.println("Enter your number : ");
	        int input = sc.nextInt();
	        
	        int result = modifyNumber(input);
	        
	        System.out.println("Modified Number: " + result);
	        
	        sc.close();
	    }
	}



