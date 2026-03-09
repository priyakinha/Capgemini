package com.cg.oneToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class QuestionMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();
//        Question q=new Question("Whst is Java?","M");
//        List<Answer> li=new ArrayList<>();
//        li.add(new Answer("Java is Object oriented",q));
//        li.add(new Answer("Java is simple",q));
//        li.add(new Answer("Java is pi",q));
//        em.getTransaction().begin();
//        q.setAnswer(li);
//        em.persist(q);
//        em.getTransaction().commit();
//        System.out.println("Created...");

//        Question q=em.find(Question.class,2);
//        System.out.println(q.getQuestionName());

        Answer ans=em.find(Answer.class,103);
        System.out.println("=======Answer=======");
        System.out.println(ans.getAnswer());
        System.out.println("=======Question========");
        System.out.println(ans.getQuestion().getQuestionName());
    }
}
