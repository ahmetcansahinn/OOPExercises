package org.example.entities;

public class Department {
    private int departmentId;
    private String departmentName;

    private double salary;

    public Department() {
    }

    public Department(int departmentId, String departmentName,double salary) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.salary=salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
