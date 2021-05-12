package com.nizam.springbootpractice.service.user;

import java.util.List;

import javax.transaction.Transactional;

import com.nizam.springbootpractice.entity.User;
import com.nizam.springbootpractice.handler.RestException;
import com.nizam.springbootpractice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public User getUserById(Long id) throws RestException {
        log.info("Get user by id");
        return userRepository.findById(id)
                .orElseThrow(() -> new RestException("User not found with id : " + id, HttpStatus.NOT_FOUND));
    }

}
