package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HelloController {

    @GetMapping("abc/{n}")
    public String sayHello(@PathVariable("n")String name){
        return "Hello World "+name;
    }




//    @GetMapping("abc")
//    public String sayHello(){
//        return "Hello";      //------attach the .html extension from the app.properies if using @controller
//    }


    //-------------Can also use responseBody here if use controller above and want the text view---------------
//    @GetMapping("abc")
//    public @ResponseBody String sayHello(){
//        return "Hello World";
//    }


}
