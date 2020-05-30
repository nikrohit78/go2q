package com.go2q.web.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.go2q.web.data.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	

}
