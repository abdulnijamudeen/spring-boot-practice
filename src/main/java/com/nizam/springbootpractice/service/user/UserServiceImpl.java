package com.nizam.springbootpractice.service.user;

import java.util.List;

import javax.transaction.Transactional;

import com.nizam.springbootpractice.entity.User;
import com.nizam.springbootpractice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        log.info("Save user");
        return userRepository.save(user);
    }
    
    @Override
    public List<User> allUsers() {
        log.info("Get all users");
        return userRepository.findAll();
    }
    
    @Override
    public User getUserById(Long id) throws Exception {
        log.info("Get user by id");
        return userRepository.findById(id)
        .orElseThrow(() -> new Exception("User not found with id : " + id));
    }
    
}
