package com.cg.oneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class PersonService {
    public static EntityManager em;
    static {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        em = emf.createEntityManager();
    }
    //=======Create data========
        public static void create(Person p,Dl obj){
            em.getTransaction().begin();
            p.setDl(obj); //setting foreign key
            em.persist(p);
            em.getTransaction().commit();
            System.out.println("Person Created...");
        }
        //======Read=========
    public static Person readData(int pid){
        Person p=em.find(Person.class,pid);
        return p;
    }

        //=======update==========
    public static void updateDlData(int pid){
        em.getTransaction().begin();
        Person p=em.find(Person.class,pid);
        p.getDl().setType("LMV");
        em.getTransaction().commit();
        System.out.println("Data updated successfully!!");
    }

    //======delete======
    public static void delete(int pid){
        em.getTransaction().begin();
        Person p=em.find(Person.class,pid);
        em.remove(p);
        em.getTransaction().commit();
        System.out.println("Data deleted successfully!!");
    }
}
