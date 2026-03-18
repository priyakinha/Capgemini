package com.cg;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.Scanner;

@SpringBootApplication
public class SpringDataAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringDataAppApplication.class, args);
//        IEmployeeRepo erepo=ctx.getBean(IEmployeeRepo.class);
//        erepo.save(new Employee("Kinha", LocalDate.of(2004,6,16),56000));
//        System.out.println("Employee Created...");


        //-------Save data to db--------------
        EmployeeService es=ctx.getBean(EmployeeService.class);
//        es.createEmployee(new Employee("Vayuu",LocalDate.of(2009,11,5),45000));
//        es.createEmployee(new Employee("Ammy",LocalDate.of(2006,6,21),98000));
//        es.createEmployee(new Employee("Goutam",LocalDate.of(2002,4,14),77000));
//        es.createEmployee(new Employee("GoutamPriya",LocalDate.of(2001,8,9),49000));
//        es.createEmployee(new Employee("Vayuu",LocalDate.of(2009,11,5),45000));
//        es.createEmployee(new Employee("Ammy",LocalDate.of(2006,6,21),98000));



        //-----Get all employee------
        //es.getAllEmployee().forEach(e-> System.out.println(e));


        //---------find------------
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter id to find: ");
//        int id=sc.nextInt();
//        System.out.println(es.getEmployee(id));


        //--------remove-------------
//        System.out.println("Enter id to delete: ");
//        int id1=sc.nextInt();
//        System.out.println(es.removeEmployee(id1));


        //-------------update------------
      //  es.updateEmployee((new Employee(52,"GV",LocalDate.of(2003,05,06),95000)));

                            //or
//
//        Employee e=es.getEmployee(52);
//        if(e!=null){
//            e.setDob(LocalDate.of(2006,10,11));
//            System.out.println(es.updateEmployee(e));
//        }else{
//            System.out.println("Employee not found");
//        }


        //-------------------Custom methods----------------------

        // es.getEmployeeName("Vayuu").forEach(e-> System.out.println(e));  //------by non primary key
        //es.getEmployeeBySalary(50000.0).forEach(e-> System.out.println(e));//---------by salary
           es.getEmployeeByBirth(LocalDate.of(2009,11,1),LocalDate.of(2009,12,1)).forEach(e-> System.out.println(e));                                                                  //-------born in jan month


    }

}
