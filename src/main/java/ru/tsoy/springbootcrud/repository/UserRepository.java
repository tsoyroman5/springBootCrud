package ru.tsoy.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.tsoy.springbootcrud.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
