package com.fis.innovate48.thor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "USER_REGISTRATION")
@Data
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	id;
	
	@Column(name = "F_NAME")
	private String	fName;
	
	@Column(name = "L_NAME")
	private String	lName;
	
	@Column(name = "E_CODE")
	private String	eCode;
	
	@Column
	private String	email;
	
	@Column
	private String	password;
	
	@Column
	private Character	gender;
	
	@Column
	private String	profilePicPath;
	
	@Column(name = "BASE_LOCATION")
	private String	baseLocation;
	
	@Column
	private Date	dob;
	
	@Column
	private String	country;
	
	@Column
	private String	address;
	
	@Column(name = "CREATED_ON")
	private Date	createdOn;
	
	@Column(name = "LAST_MODIFY")
	private Date	lastModify;
	
	@Column
	private Boolean	active;
	
	@Column
	private Boolean	notify;

}
