package com.gfg.amit.SpringBootBackendService.service;

import com.gfg.amit.SpringBootBackendService.model.User;
import com.gfg.amit.SpringBootBackendService.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserDaoService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();

    }

    public User getUserById(Long id){

        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.get();
    }

    public User createUser(User user){
        userRepository.save(user);
        return user;
    }

    public User updateUser(User user){
        userRepository.save(user);
        return user;
    }

    public User deleteUser(Long id){
        User user = getUserById(id);
        userRepository.deleteById(id);
        return user;
    }
}
