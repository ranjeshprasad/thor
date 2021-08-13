package com.fis.innovate48.thor.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UsersDto implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@JsonProperty(value = "id")
	private Integer	id;
	
	@JsonProperty(value = "first_name")
	private String	fName;
	
	@JsonProperty(value = "last_name")
	private String	lName;
	
	@JsonProperty(value = "employee_code")
	private String	eCode;
	
	@JsonProperty(value = "email")
	private String	email;
	
	@JsonProperty(value = "password")
	private String	password;
	
	@JsonProperty(value = "gender")
	private Character	gender;
	
	@JsonProperty(value = "profile_pic_path")
	private String	profilePicPath;
	
	@JsonProperty(value = "base_location")
	private String	baseLocation;
	
	@JsonProperty(value = "date_of_birth")
	private Date	dob;
	
	@JsonProperty(value = "country")
	private String	country;
	
	@JsonProperty(value = "address")
	private String	address;
	
	@JsonProperty(value = "created_date")
	private Date	createdOn;
	
	@JsonProperty(value = "last_modified_date")
	private Date	lastModify;
	
	@JsonProperty(value = "is_active")
	private Boolean	active;
	
	@JsonProperty(value = "notify")
	private Boolean	notify;

}
