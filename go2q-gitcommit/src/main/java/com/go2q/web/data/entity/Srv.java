package com.go2q.web.data.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="services")
public class Srv extends SPBaseEntity {

	private String name;
	private String displayName;
	private String startingletter;//CD
	private int startingnumber;//100
	private Boolean isavailable;	
	private Integer maxpersons;
	private Integer avgWaitingMins;//in minutes
}
