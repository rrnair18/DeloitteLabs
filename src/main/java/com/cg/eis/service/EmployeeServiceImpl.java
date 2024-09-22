package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployeeDetails() throws EmployeeException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();  

        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();
        
        Employee employee = new Employee(id, name, salary, designation);
        employee.setInsuranceScheme(findInsuranceScheme(salary, designation));
        
        sc.close();
        
        return employee;
    }

    @Override
    public String findInsuranceScheme(double salary, String designation) {
        if (salary < 20000) {
            return "No Scheme";
        } else if (salary >= 20000 && salary < 40000 ) {
            return "Scheme C";
        } else if (salary >= 40000 && salary < 60000 ) {
            return "Scheme B";
        } else if (salary >= 60000 ) {
            return "Scheme A";
        } else {
            return "No Scheme";
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        employee.displayDetails();
    }
}
