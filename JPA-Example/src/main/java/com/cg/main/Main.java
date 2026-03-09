package com.cg.main;

import com.cg.entity.Product;
import jakarta.persistence.*;
import jakarta.transaction.Transaction;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Product p1=new Product("Book",1500,50, LocalDate.of(2025,6,20));
//        Product p2=new Product(104,"Ball",500,100, LocalDate.of(2026,12,25));
//        Product p3=new Product(105,"HP-ENVY",195000,6, LocalDate.of(2026,1,25));
//        Product p4=new Product(106,"Google Pixel",56000,10, LocalDate.of(2025,9,15));

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu"); //prepares Hibernate to talk to db
        EntityManager em=emf.createEntityManager(); //bridge between your Java object and db
        EntityTransaction tx=em.getTransaction();  //db operation must happen inside a transaction for ACID prop.
        tx.begin(); //db is ready to accept changes
        em.persist(p1);// INSERT query is prepared But not executed yet
//        em.persist(p2);
//        em.persist(p3);
//        em.persist(p4);

//        Product p=em.find(Product.class,105); //--->the object will be in persistence context
//        Product p=em.find(Product.class,104);
       // p.setPrice(200);   ----->update
//        if(p!=null) {
//           em.remove(p); //delete the data
//            System.out.println(p);
//        }else{
//            System.out.println("Product Not Found!!");
//        }


 //-----------------true → If object is inside persistence context (managed)--------
//        Product p=em.find(Product.class,101);
//        boolean b=em.contains(p);
//        System.out.println(b);

//--------------------read all the data from db-------------
//        List<Product> li=em.createQuery("select p from Product p").getResultList();  //can also use directly from Product
//        li.forEach(p-> System.out.println(p));

        tx.commit(); //SQL is executed
       // System.out.println("Product Created....");

    }
}
