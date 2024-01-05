package com.cetpa.repository;

import com.cetpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
  User findByEmail(String username);

   // User findByEmail(String username);
}
