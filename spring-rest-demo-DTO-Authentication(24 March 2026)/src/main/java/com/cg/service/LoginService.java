package com.cg.service;

import com.cg.dao.UserRepo;
import com.cg.entity.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class LoginService {
    @Autowired
    private UserRepo repo;
    public UserBean validateUser(UserBean ub){
        Optional<UserBean> op=repo.findById(ub.getId());
        if(op.isPresent()){
            if(op.get().getPassword().equals(ub.getPassword()))
                return op.get();
        }
        return null;
    }

}
