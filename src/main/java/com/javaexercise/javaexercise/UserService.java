package com.javaexercise.javaexercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    private final UserDAO dao;
    public void createUser(User usuario){
        this.dao.save(usuario);
    }

    public User getUser(Long id){
        return this.dao.findById(id).orElse(null);
    }

}
