package com.go2q.web.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.go2q.web.data.entity.Srv;

public interface SrvRepository extends JpaRepository<Srv, Integer> {

}
