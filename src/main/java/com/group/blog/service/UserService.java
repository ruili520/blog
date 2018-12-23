package com.group.blog.service;

import com.group.blog.Jpa.JpaRepositoryImpl;
import com.group.blog.entity.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JpaRepositoryImpl<IUser,String> userRepo;

    public IUser save(){
        IUser user = new IUser();
        return userRepo.save(user);
    }
}
