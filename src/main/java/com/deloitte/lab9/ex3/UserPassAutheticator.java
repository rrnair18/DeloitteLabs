package com.deloitte.lab9.ex3;

import java.util.Scanner;

interface Authenticator{
	boolean authenticate(String validUserName, String validPassword);
}

public class UserPassAutheticator {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	String validUserName = "demo123";
	String validPassword = "new123";
	
	Authenticator a = (username, password) ->  validUserName.equals(username) && validPassword.equals(password);
	
    System.out.print("Enter Username: ");
    String inputUsername = sc.nextLine();

    System.out.print("Enter Password: ");
    String inputPassword = sc.nextLine();
    
    boolean isAuthenticated = a.authenticate(inputUsername, inputPassword);
    
    if (isAuthenticated) {
        System.out.println("Authentication Successful!");
    } else {
        System.out.println("Invalid Username or Password.");
    }

    sc.close();
		
	}
	
}
