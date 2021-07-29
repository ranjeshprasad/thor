package com.fis.innovate48.thor.registration.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user_registartion")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	id;
	private String	fName;
	private String	lName;
	private String	eCode;
	private String	email;
	private String	password;
	private Character	gender;
	private String	profilePicPath;
	private String	baseLocation;
	private Date	dob;
	private String	country;
	private String	address;
	private Date	createdOn;
	private Date	lastModify;
	private Boolean	active;
	private Boolean	notify;

}
