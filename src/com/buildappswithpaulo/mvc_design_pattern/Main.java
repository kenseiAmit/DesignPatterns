package com.buildappswithpaulo.mvc_design_pattern;

import com.buildappswithpaulo.mvc_design_pattern.controller.EmployeeController;
import com.buildappswithpaulo.mvc_design_pattern.model.Employee;
import com.buildappswithpaulo.mvc_design_pattern.view.EmployeeDashboardView;

public class Main {
    public static void main(String[] args) {
        Employee employee = retrieveemployeeFromServer();
        EmployeeDashboardView employeeDashboardView = new EmployeeDashboardView();
        EmployeeController employeeController = new EmployeeController(employee, employeeDashboardView);
        employeeController.updateDashboardView();
    }
    public static Employee retrieveemployeeFromServer() {
        Employee employee = new Employee();
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setSsNumber("007");
        employee.setSalary(125000);
        return employee;
    }
}
