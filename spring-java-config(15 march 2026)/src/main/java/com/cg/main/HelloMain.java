package com.cg.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import com.cg.cfg.MyConfig;

public class HelloMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        HelloWorld h = ctx.getBean( HelloWorld.class);
        System.out.println(h.sayHello());
        Employee e = ctx.getBean(Employee.class);
        e.printEmployeeDetails();
    }
}