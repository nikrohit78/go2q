package com.go2q.web.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.go2q.web.data.entity.Counters;
import com.go2q.web.data.repository.CountersRepository;

@Service
public class CountersService {
	
	@Autowired
	CountersRepository repository;
	
	public Counters createCounter(Counters counter) {
		
		return repository.save(counter);
		
	}
	
	public List<Counters> findAll() {
		return repository.findAll();
	}
	
	/*public Counters findById(Integer id) {
		//return repository.findById(id).get();
		return repository.findById(id);
	}*/
	
	public Counters update(Counters counter ) {
		
//		Counters counterToUpdate = repository.findById(counter.getId()).get();
//		
//		counterToUpdate.setUpdatedonutc(new Date());
		
		return repository.save(counter);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);		
	}

}
