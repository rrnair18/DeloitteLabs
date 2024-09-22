package com.cg.eis.exception;

public class EmployeeException extends Exception {
	
	private static final long serialVersionUID = 7423320335019369534L;

	public EmployeeException(String message) {
		super(message);
	}
	
	//Exception used in Employee.java, EmployeeService.java, EmployeeServiceImpl.java & Main.java under com.cg.eis package
	//To validate exception run Main.java under com.cg.eis package

}
