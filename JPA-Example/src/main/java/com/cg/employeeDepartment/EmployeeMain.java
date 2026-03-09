package com.cg.employeeDepartment;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
        Department dept=new Department("HR");
        List<Employee> li=new ArrayList<>();
        li.add(new Employee("Priya",40000));
        em.getTransaction().begin();
        dept.setEmp(li);
        em.persist(dept);
        em.getTransaction().commit();
        System.out.println("Created...");
    }
}
