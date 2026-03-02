package com.cg.pl;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        IEmployeeService es=new EmployeeService();
        String result=es.createEmployee(new Employee("Rama", "ram@gmail.com", "1981-06-26"));
        System.out.println(result);

        // Finding employee
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();
        Employee femp = es.findById(id);
        if (femp == null)
            System.out.println("Invalid Employee ID");
        else
            System.out.println(femp.getName()+"\t"+femp.getEmail()+"\t"+femp.getDob());


        // Getting all employee data
        es.getAllEmployee();


        // Updating employee name
        System.out.println("Enter Employee ID:");
        String eid = sc.nextLine();
        System.out.println("Enter new employee name:");
        String name = sc.next();
        System.out.println(es.updateEmployeeName(eid,name));


        // Deleting employee
        System.out.println("Enter employee ID to be deleted:");
        String ide = sc.next();
        System.out.println(es.removeEmployee(ide));

    }

}