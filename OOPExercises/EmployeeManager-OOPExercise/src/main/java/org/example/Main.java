package org.example;

import org.example.business.WorkManager;
import org.example.entities.Department;
import org.example.entities.Employee;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        WorkManager workManager=new WorkManager();

        workManager.addEmployee(new Employee(1,"Ali","Can",1));
        workManager.addEmployee(new Employee(2,"Mehmet","Can",2));
        workManager.addEmployee(new Employee(3,"Cansu","Canan",3));

        workManager.addDepartment(new Department(1,"Satış Departmanı",20000));
        workManager.addDepartment(new Department(2,"Pazarlama Departmanı",30000));
        workManager.addDepartment(new Department(3,"It Departmanı",25000));

        workManager.getAllEmployee();
        workManager.deleteEmployee(2);
        workManager.getAllEmployee();
        workManager.displaySalaryOfEmployeesInDepartment(3);
        workManager.changeEmployeeDepartment(1,3);




    }
}