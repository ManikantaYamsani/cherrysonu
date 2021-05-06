package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

	

	User findByUserName(String username);
}
