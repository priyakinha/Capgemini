package com.cg.main;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {

        //=======Task-1,2=======
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
        Employee emp=(Employee) ctx.getBean("e");
        emp.showEmployee();


        //=====Task-3========
//        SBU sbu=(SBU) ctx.getBean("s");
//        sbu.display();



        //======Task-4=========
//        SBU sbu = (SBU) ctx.getBean("s");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Employee ID: ");
//        int id = sc.nextInt();
//        Employee e = sbu.getEmployee(id);
//        if(e!=null)
//        {
//            System.out.println("=======Employee Info======");
//            System.out.println("Employee ID : "+e.getEmpId());
//            System.out.println("Employee Name : "+e.getName());
//            System.out.println("Employee Salary : "+e.getSalary());
//            System.out.println("Employee Age : "+e.getAge());
//        }
//        else
//        {
//            System.out.println("Employee Not Found");
//        }





    }
}
