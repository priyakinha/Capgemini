package com.cg;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringDataAppApplication.class, args);
        IEmployeeRepo erepo=ctx.getBean(IEmployeeRepo.class);
        erepo.save(new Employee("Kinha", LocalDate.of(2004,6,16),56000));
        System.out.println("Employee Created...");
    }

}
