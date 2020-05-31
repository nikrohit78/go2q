package com.go2q.web.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.go2q.web.data.entity.Users;
import com.go2q.web.data.repository.UsersRepository;


@Service
public class UsersService {
	
	@Autowired
	UsersRepository repository;
	
	public Users createUser(Users user) {
		
		return repository.save(user);
		
	}
	
	public List<Users> findAll() {
		return repository.findAll();
	}
	
	public Users findById(Integer id) {
		return repository.findById(id).get();
	}
	
	public Users update(Users user ) {
		
//		Counters counterToUpdate = repository.findById(counter.getId()).get();
//		
//		counterToUpdate.setUpdatedonutc(new Date());
		
		return repository.save(user);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);		
	}

}
