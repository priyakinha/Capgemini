package com.cg.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class EmployeeMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        PEmployee obj=new PEmployee();
//        CEmployee obj=new CEmployee();
        obj.setName("Kinha");
        obj.setDob(LocalDate.of(2004,10,12));
        obj.setSalary(56000);
//        obj.setPay_per_hour(800);
        em.persist(obj);
        em.getTransaction().commit();
        System.out.println("Created...");
    }
}
