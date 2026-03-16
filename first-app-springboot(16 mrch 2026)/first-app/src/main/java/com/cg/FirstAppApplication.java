package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@ComponentScan("com")   //Now it will scan com package otherwise it will not scanning the bean pckg but only com.cg
@PropertySource("classpath:data.properties")
public class FirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(FirstAppApplication.class, args);
		HelloWorld h=ctx.getBean(HelloWorld.class);
		System.out.println(h.sayHello("Priya"));
		Employee e=ctx.getBean(Employee.class);
		e.printEmployeeDetails();

	}
}
