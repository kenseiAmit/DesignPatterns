package com.buildappswithpaulo.mvc_design_pattern.controller;

import com.buildappswithpaulo.mvc_design_pattern.model.Employee;
import com.buildappswithpaulo.mvc_design_pattern.view.EmployeeDashboardView;

public class EmployeeController {
    private Employee employee;
    private EmployeeDashboardView employeeDashboardView;

    public EmployeeController(Employee employee, EmployeeDashboardView employeeDashboardView) {
        this.employee = employee;
        this.employeeDashboardView = employeeDashboardView;
    }
    public void setEmployeeName(String firstName, String lastName) {
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
     }
     public String getEmployeeNmae() {
        return employee.getFirstName() + " " + employee.getLastName();
     }
     public void setSSN(String ssn) {
        employee.setSsNumber(ssn);
     }
     public String getSSN() {
        return employee.getSsNumber();
     }
     public void updateDashboardView() {
        employeeDashboardView.printEmployeeInformation(employee);
     }
}
