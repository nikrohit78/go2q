package com.go2q.web.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.go2q.web.data.entity.Counters;


public interface CountersRepository extends JpaRepository<Counters, Integer> {
	
	

}
