package com.cg.cfg;

import org.springframework.context.annotation.*;

import com.cg.bean.Address;
import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("com")
public class MyConfig {
//    @Bean("h")
//    @Scope("prototype")
//    public HelloWorld getBean() {
//        HelloWorld hello = new HelloWorld();
//        hello.setName("Priya");
//        return hello;
//    }
//
//    @Bean("e")
//    public Employee getBean1() {
//    //    return new Employee();         //------->field injection
//        return new Employee(getBean2());  //------>constructor injection
//    }
//    @Bean
//    public Address getBean2() {
//        return new Address();
//    }
//    public Address getBean3(){
//        Address add=new Address();
//        add.setCity("Delhi");
//        add.setCountry("India");
//        add.setZip(1234);
//        return add;
//    }


}