package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {

    public static void main(String[] args) throws EmployeeException {
		EmployeeService employeeService = new EmployeeServiceImpl();

		try {
			Employee employee = employeeService.getEmployeeDetails();
			employeeService.displayEmployeeDetails(employee);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}