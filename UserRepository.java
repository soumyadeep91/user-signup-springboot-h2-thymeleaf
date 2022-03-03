package com.soumya.springbbot.springbootstudentdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soumya.springbbot.springbootstudentdetails.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
