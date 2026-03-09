package com.cg.oneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {

        PersonService ps=new PersonService();
        Person p=new Person("Vayu", LocalDate.of(2003,05,06));
        Dl obj=new Dl(LocalDate.of(2042,12,11),LocalDate.of(2032,11,12),"LMV,HMV");
        ps.create(p,obj);
        System.out.println("Enter pid to search");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ps.readData(n));
        System.out.println("Enter pid to update data: ");
        int n2=sc.nextInt();
        ps.updateDlData(n2);
        System.out.println("Enter pid to delete data: ");
        int n3=sc.nextInt();
        ps.delete(n3);


    }
}
