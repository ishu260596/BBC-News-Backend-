package com.bbcnews.service;

import com.bbcnews.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    String saveUser(User user);

    Iterable<User> getAllUser();

}
