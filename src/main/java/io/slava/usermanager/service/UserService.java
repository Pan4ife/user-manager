package io.slava.usermanager.service;


import io.slava.usermanager.model.User;

import java.util.List;

public interface UserService {
        void addUser(User user);
        List<User> getAllUsers();
        User getById(Long id);
        void updateUser(User user);
        void deleteById(Long id);
}
