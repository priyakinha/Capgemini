package com.cg.controller;

import com.cg.entity.UserBean;
import com.cg.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class LoginController {
    @Autowired
    private LoginService service;
    @PostMapping("/login")
    public String login(@RequestBody UserBean ub, HttpSession ses){
        UserBean u=service.validateUser(ub);
        if(u!=null){
            ses.setAttribute("name",ub.getId());
            return "Login Success!!";
        }else{
            return "Invalid User";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession ses){
        if(ses.getAttribute("name")!=null)
            ses.invalidate();
        return "User Logout";
    }

}
