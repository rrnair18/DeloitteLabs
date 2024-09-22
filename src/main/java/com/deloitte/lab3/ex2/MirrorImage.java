package com.deloitte.lab3.ex2;

import java.util.Scanner;

public class MirrorImage {
    

    public static String getImage(String str) {

        StringBuffer sb = new StringBuffer(str);

        String reversedString = sb.reverse().toString();
        
        String output = str + "|" + reversedString;
        
        return output;
    }

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter your string : ");  
    	String input = sc.nextLine();
    	
        String result = getImage(input);
        System.out.println("Output: " + result);
        
        sc.close();
    }
}