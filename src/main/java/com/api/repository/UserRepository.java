package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Users;


@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	public Users findByUsername(String username);
}