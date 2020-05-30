package com.go2q.web.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.go2q.web.data.entity.Category;
import com.go2q.web.data.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	/*public Category findById(Integer id) {
		return repository.findById(id);
	}
	*/
	public Category update(Category cat ) {
		
		Category catToUpdate = repository.getOne(cat.getId());
//		
//		catToUpdate.setUpdatedonutc(new Date());
		
		
		return repository.save(catToUpdate);
	}

}
