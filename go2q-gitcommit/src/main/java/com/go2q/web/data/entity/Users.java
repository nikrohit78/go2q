package com.go2q.web.data.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Users extends SPBaseEntity {

	
	private Integer counter_id;
	private Integer service_id;
	
	private String username;
	private String useremail;
	private String usermobile;
	private Integer userroleid;
	private String userpassword;
	private Boolean active = new Boolean(true);
	private Boolean issystemaccount = new Boolean(false);

}
