package com.saitej.springboot.validationexceptionhandling.repository;

import com.saitej.springboot.validationexceptionhandling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
