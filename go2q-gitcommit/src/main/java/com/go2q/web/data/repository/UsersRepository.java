package com.go2q.web.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.go2q.web.data.entity.Users;


public interface UsersRepository extends JpaRepository<Users, Integer> {

}
