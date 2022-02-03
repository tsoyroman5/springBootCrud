package ru.tsoy.springbootcrud.service;

import ru.tsoy.springbootcrud.entity.User;
import ru.tsoy.springbootcrud.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> userList() {
        List<User> result = new ArrayList<>();
        userRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public void updateUser(User user, Long id) {
        User userDB = userRepository.findById(id).get();
        userDB.setName(user.getName());
        userDB.setSurname(user.getSurname());
        userDB.setAge(user.getAge());
        userRepository.save(userDB);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findUser(Long id) {
        return userRepository.findById(id).get();
    }
}
