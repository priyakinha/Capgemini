package com.cg.EmployeeCriteriaQuery;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class CriteriaEmployeeMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
        CriteriaBuilder cb=em.getCriteriaBuilder();
        CriteriaQuery<Object[]> cq=cb.createQuery(Object[].class);  //because the query will return two columns and defines what type of res we obtain
        Root<CriteriaEmployee> r=cq.from(CriteriaEmployee.class);   //data should come from the CriteriaEmployee entity table

        //=======group by deptname===========
        cq.multiselect( r.get("dept"),cb.count(r));
        cq.groupBy(r.get("dept"));

        List<Object[]> li = em.createQuery(cq).getResultList();
        for(Object[] obj : li){
            System.out.println(obj[0] + " " + obj[1]);
        }
    }
}
