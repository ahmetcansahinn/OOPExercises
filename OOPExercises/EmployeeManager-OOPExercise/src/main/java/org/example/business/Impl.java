package org.example.business;

import org.example.entities.Department;
import org.example.entities.Employee;

public interface Impl {

    void addEmployee(Employee employee);
    void getAllEmployee();
    void deleteEmployee(int employeeId);
    void addDepartment(Department department);
    void displaySalaryOfEmployeesInDepartment(int departmentId);
    void changeEmployeeDepartment(int employeeId, int newDepartmentId);


    }
