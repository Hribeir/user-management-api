package com.henriqueribeiro.user_management.repository;

import com.henriqueribeiro.user_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
