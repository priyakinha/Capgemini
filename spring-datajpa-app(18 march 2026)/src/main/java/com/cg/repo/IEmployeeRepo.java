package com.cg.repo;
import com.cg.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IEmployeeRepo extends JpaRepository<Employee,Integer> {


    //@Query("select e from Employee e where e.name=:n")    //used when property name dont match with the findByName or any other
   // public List<Employee> findByName(@Param("n") String name);

    public List<Employee> findByName(String name);

    //custom method to find by name(by non primary key) we have just given the format findBy is a method in jparepository and
    //  Name is the property name(from Employee) exact same as we are making jpa repository of the employee class


    //-------------find employee sal<50000----------------
    public List<Employee> findBySalaryLessThan(double salary);

    //--------------employee born in particular month----------------
    public List<Employee> findByDobBetween(LocalDate start, LocalDate end);

}
