package com.go2q.web.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.go2q.web.data.entity.Srv;
import com.go2q.web.data.repository.SrvRepository;

@Service
public class SrvService {
	
	@Autowired
	SrvRepository repository;
	
	public Srv createSrv(Srv srv) {
		
		return repository.save(srv);
		
	}
	
	public List<Srv> findAll() {
		return repository.findAll();
	}
	
	/*public Srv findById(Integer id) {
		return repository.findById(id).get();
	}*/
	
	public Srv update(Srv srv ) {
		
//		Counters counterToUpdate = repository.findById(counter.getId()).get();
//		
//		counterToUpdate.setUpdatedonutc(new Date());
		
		return repository.save(srv);
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);		
	}

}
