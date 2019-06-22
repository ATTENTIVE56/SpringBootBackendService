package com.gfg.amit.SpringBootBackendService.service;

import com.gfg.amit.SpringBootBackendService.model.User;
import com.gfg.amit.SpringBootBackendService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoService {
    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){

        return null;
    }

    public User findUserById(Long id){

        return null;
    }

    public User createUser(User user){

        return null;
    }

    public User updateUser(User user){

        return null;
    }

    public void deleteUser(Long id){

    }
}
