package ru.tsoy.springbootcrud.service;

import ru.tsoy.springbootcrud.entity.User;

import java.util.List;
public interface UserService {
    void createUser(User user);
    List<User> userList();
    void updateUser(User user, Long id);
    void deleteUser(Long id);
    User findUser(Long id);
}
