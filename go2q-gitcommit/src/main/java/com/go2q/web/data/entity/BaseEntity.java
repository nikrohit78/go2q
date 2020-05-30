package com.go2q.web.data.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private int displayorder;
	private Date createdonutc = new Date();
	private Date updatedonutc= new Date();

	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	//doesnt work
	@PrePersist
	void preInsert() {
		System.out.println("pre insert "+updatedonutc);
	   if (this.createdonutc == null)
	       this.createdonutc = new Date();
	   this.updatedonutc = new Date();
	   
	}
}
