package com.cg.CriteriaQueryExample;

import com.cg.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class CriteriaDemo {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Product>cq=cb.createQuery(Product.class);
        Root<Product>r=cq.from(Product.class);
//        cq.select(r);
  //      Predicate con1=cb.greaterThan(r.get("price"),600000);  //----->select with where
 //       cq.select(r).where(con1);
 //       cq.select(r).where(cb.like(r.get("name"),"I%"));   //----->like

        //------------when both can be true and want value in between--------
//        Predicate con1=cb.greaterThan(r.get("price"),500000);
//        Predicate con2=cb.lessThan(r.get("price"),700000);
//        cq.select(r).where(cb.and(con1,con2));

        //---------order by-----------------
        cq.select(r).orderBy(cb.asc(r.get("price")));
        cq.select(r).orderBy(cb.desc(r.get("price")));

        List<Product> li=em.createQuery(cq).getResultList();
        li.forEach(p-> System.out.println(p));

    }
}
