package org.example.business;

import org.example.entities.Department;
import org.example.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WorkManager implements Impl {
    List<Employee> employees;
    List<Department> departments;

    public WorkManager() {
        this.employees=new ArrayList<>();
        this.departments=new ArrayList<>();
    }

    public WorkManager(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void getAllEmployee() {
       employees.stream()
               .forEach(employee -> {
                   System.out.println(employee.getEmployeeId()+" numaralı id'ye sahip çalışanlar sisteme eklendi");
               });
    }

    @Override
    public void deleteEmployee(int employeeId) {
        List<Employee> deleteEmployees=employees.stream()
                .filter(employee -> employee.getEmployeeId()!=employeeId)
                .collect(Collectors.toList());

        if(deleteEmployees.size()<employees.size()){
            employees=deleteEmployees;
            System.out.println("Çalışan silindi: "+ employeeId);
        }else {
            System.out.println("Belirtilen çalışan bulunamadı");
        }
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);

    }

    @Override
    public void displaySalaryOfEmployeesInDepartment(int departmentId) {
        System.out.println("Departman ID'si " + departmentId + " olan çalışanların maaşları:");

        employees.stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .forEach(employee -> {
                    double salary = departments.stream()
                            .filter(department -> department.getDepartmentId() == departmentId)
                            .findFirst()
                            .map(Department::getSalary)
                            .orElse(0.0);

                    System.out.println(employee.getEmployeeName() + " " + employee.getEmployeeLastName() +
                            ", Maaş: " + salary);
                });
    }

    @Override
    public void changeEmployeeDepartment(int employeeId, int newDepartmentId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employee.setDepartmentId(newDepartmentId);
                System.out.println("Çalışan ID: " + employeeId + " departmanı değiştirildi. Yeni departman ID: " + newDepartmentId);
                return;
            }
        }
        System.out.println("Çalışan ID: " + employeeId + " bulunamadı.");
    }
    }



