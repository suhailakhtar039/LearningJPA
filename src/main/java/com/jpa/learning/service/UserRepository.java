package com.jpa.learning.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.learning.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
