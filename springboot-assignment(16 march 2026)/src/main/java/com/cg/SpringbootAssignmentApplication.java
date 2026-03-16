package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SpringbootAssignmentApplication {

    public static void main(String[] args) {

        //=====Task-1,2=========================

//        ApplicationContext ctx=SpringApplication.run(SpringbootAssignmentApplication.class, args);
//        Employee emp=ctx.getBean(Employee.class);
//        emp.showEmployee();



        //===========Task-3=============

        ApplicationContext ctx = SpringApplication.run(SpringbootAssignmentApplication.class, args);
//        SBU sbu = ctx.getBean(SBU.class);
//        sbu.display();



        //==========Task-4==========

        Scanner sc = new Scanner(System.in);
        System.out.print("Employee ID : ");
        int id = sc.nextInt();
        SBU sbu = ctx.getBean(SBU.class);
        Employee emp = sbu.getEmployee(id);
        if(emp != null) {
            System.out.println("=====Employee Info:=======");
            System.out.println("Employee ID : " + emp.getEmpId());
            System.out.println("Employee NAME : " + emp.getName());
            System.out.println("Employee SALARY : " + emp.getSalary());
        }
        else {
            System.out.println("Employee not found");
        }
    }

}
