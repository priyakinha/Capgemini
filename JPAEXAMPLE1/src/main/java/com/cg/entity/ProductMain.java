package com.cg.entity;

import jakarta.persistence.*;

import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();

        //======retrieve whole table=============

//        TypedQuery<Product> q=em.createQuery("from Product",Product.class);
//        TypedQuery<String> q=em.createQuery("select p.name from Product p",String.class);
//        List<Product> li=q.getResultList();

        //============retrieve multiple columns=================

        //-----Type-1---------
//        TypedQuery<Object[]> q=em.createQuery("select p.name,p.price,p.mfd from Product p",Object[].class);
//        List<Object[]> li=q.getResultList();
//        li.forEach(p-> System.out.println(p[0] + " " + p[1] + " " + p[2]));

        //-----Type-2---------
//        TypedQuery<ProductDTO> q=em.createQuery("select new ProductDTO( p.name,p.price,p.mfd) from Product p",ProductDTO.class);
//        List<ProductDTO> li=q.getResultList();
//        li.forEach(p-> System.out.println(p));

        //==========WHERE CLAUSE===============
//        TypedQuery<Product> q=em.createQuery("select p from Product p where p.price<700000",Product.class);
//        List<Product> li=q.getResultList();
//        li.forEach(p->System.out.println(p));

        //-----named parametrer------
//        TypedQuery<Product> q=em.createQuery("select p from Product p where p.price<:p",Product.class);
//        q.setParameter("p",700000);
//        List<Product> li=q.getResultList();
//        li.forEach(p->System.out.println(p));

        //-----like operator-------
//        TypedQuery<Product> q=em.createQuery("select p from Product p where p.name like:p",Product.class);
//        q.setParameter("p","G%");
//        List<Product> li=q.getResultList();
//        li.forEach(p->System.out.println(p));

        //========DML OPERATIONS=========

        //------update------
//        em.getTransaction().begin();
//        Query q=em.createQuery("update Product p set p.price=650000 where p.id=103");
//        int row=q.executeUpdate();
//        em.getTransaction().commit();
//        System.out.println("Updated-->"+row);

        //----Native query->direct with table-------
        em.getTransaction().begin();
        Query q=em.createNativeQuery("update product_table p set p.price=550000 where p.pid=103");
        int row=q.executeUpdate();
        em.getTransaction().commit();
        System.out.println("Updated-->"+row);


    }
}
