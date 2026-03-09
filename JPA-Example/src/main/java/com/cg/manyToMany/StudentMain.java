package com.cg.manyToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();

        //============Assign Already existed course to new student===========\

//        em.getTransaction().begin();
//        Student s=new Student("GV");
//        Course c=em.find(Course.class,2);
//        Set<Course> li=new HashSet<>();
//        li.add(c);
//        s.setCourses(li);
//        em.persist(s);
//        em.getTransaction().commit();
//        System.out.println("Created...");

        //============create student and courses=============
//        Student s=new Student("Priya");
//        Course c=new Course("Java");
//        Course c1=new Course("Spring");
//        em.persist(c);
//        em.persist(c1);
//       Set<Course> li=new HashSet<>();
//        li.add(c);
//        li.add(c1);

        //=========give error bcz data in list is not persisted============
//        li.add(new Course("Java"));
//        li.add(new Course("Spring"));
        //=============================================================
//        s.setCourses(li);
//        em.persist(s);
//        em.getTransaction().commit();
//        System.out.println("Created...");
    }
}
