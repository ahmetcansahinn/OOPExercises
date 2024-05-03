package org.example.entities;

public class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeLastName;
    private int departmentId;




    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeLastName, int departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeLastName = employeeLastName;
        this.departmentId=departmentId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
}

