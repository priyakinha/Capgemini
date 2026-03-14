package com.cg.main;

import com.cg.bean.Librarian;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //=======Setter Injection==========
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
//        Librarian lib=(Librarian) ctx.getBean("l");
//        lib.issueBook();

        //Constructor Injection
        ApplicationContext ctx=new ClassPathXmlApplicationContext("bean2.xml");
        Librarian lib=(Librarian)ctx.getBean("lib");
        lib.issueBook();
    }
}
