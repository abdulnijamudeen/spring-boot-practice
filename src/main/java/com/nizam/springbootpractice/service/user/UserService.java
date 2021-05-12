package com.nizam.springbootpractice.service.user;

import java.util.List;

import com.nizam.springbootpractice.entity.User;
import com.nizam.springbootpractice.handler.RestException;

public interface UserService {
    User save(User user);
    List<User> allUsers();
    User getUserById(Long id) throws RestException;
}
