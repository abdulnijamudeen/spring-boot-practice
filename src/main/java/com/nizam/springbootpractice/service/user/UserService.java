package com.nizam.springbootpractice.service.user;

import java.util.List;

import com.nizam.springbootpractice.entity.User;

public interface UserService {
    User save(User user);
    List<User> allUsers();
    User getUserById(Long id) throws Exception;
}
