package ru.tsoy.springbootcrud.service;

import ru.tsoy.springbootcrud.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(User user);
    Iterable<User> userList();
    Optional<User> findById(long id);
    void deleteUser(User user);
}
