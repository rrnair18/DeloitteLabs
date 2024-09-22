package com.deloitte.lab3.ex5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TextCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        String line;
        
        System.out.println("Enter the text (Press 'Enter' on an empty line to finish):");
             
        while (!(line = scanner.nextLine()).isEmpty()) {
            text.append(line).append(" ");
        }

        scanner.close();
        
        String inputText = text.toString();
        
        int charCount = inputText.replace("\n", "").replace(" ", "").length();
        
        StringTokenizer tokenizer = new StringTokenizer(inputText);
        int wordCount = tokenizer.countTokens();
        
        int lineCount = inputText.length() - inputText.replace(".", "").length();
        
        System.out.println("Number of Characters (excluding spaces): " + charCount);
        System.out.println("Number of Words: " + wordCount);
        System.out.println("Number of Lines: " + lineCount);
    }
}
