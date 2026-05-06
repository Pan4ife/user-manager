package io.slava.usermanager.repository;


import io.slava.usermanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User, Long> {
}
