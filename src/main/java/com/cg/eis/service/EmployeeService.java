package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

public interface EmployeeService {
    
    Employee getEmployeeDetails() throws EmployeeException;
    
    String findInsuranceScheme(double salary, String designation);
    
    void displayEmployeeDetails(Employee employee);
}


