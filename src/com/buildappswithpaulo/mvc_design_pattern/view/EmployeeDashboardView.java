package com.buildappswithpaulo.mvc_design_pattern.view;

import com.buildappswithpaulo.mvc_design_pattern.model.Employee;

public class EmployeeDashboardView {
    public void printEmployeeInformation(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("SSN: " + employee.getSsNumber());
        System.out.println("Salary: " + employee.getSalary());
    }
}
