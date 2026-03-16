package com.cg.config;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public Employee emp1() {
        return new Employee(1845, "Harriet", 40000,"FS", 30);
    }

    @Bean
    public Employee emp2() {
        return new Employee(3346, "John", 45000,"Sogeti", 32);
    }

    @Bean
    public SBU sbu() {
        SBU s = new SBU();
        s.setSbuId(102);
        s.setSbuHead("Kiran Rao");
        s.setSbuName("Product Engineering Services");
        s.setEmpList(Arrays.asList(emp1(), emp2()));
        return s;
    }
}