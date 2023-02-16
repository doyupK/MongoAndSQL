package com.example.mongoandsql.repo;

import com.example.mongoandsql.domain.maria.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
