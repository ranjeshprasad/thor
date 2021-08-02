package com.fis.innovate48.thor.skills.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="skills")
public class Skills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer	id;
	
	private Integer createrId;
	private String skillName;
	private String version;
	private Character status;
	private Date createdDate;
	private Date lastUpdateDate;
	
	
	public Skills() {
		super();
	}


	public Skills(Integer id, Integer createrId, String skillName, String version, Character status,
			Date createdDate, Date lastUpdateDate) {
		super();
		this.id = id;
		this.createrId = createrId;
		this.skillName = skillName;
		this.version = version;
		this.status = status;
		this.createdDate = createdDate;
		this.lastUpdateDate = lastUpdateDate;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getCreaterId() {
		return createrId;
	}


	public void setCreaterId(Integer createrId) {
		this.createrId = createrId;
	}


	public String getSkillName() {
		return skillName;
	}


	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public Character getStatus() {
		return status;
	}


	public void setStatus(Character status) {
		this.status = status;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}


	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}


	@Override
	public String toString() {
		return "UserSkills [id=" + id + ", createrId=" + createrId + ", skillName=" + skillName + ", version=" + version
				+ ", status=" + status + ", createdDate=" + createdDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}
	
	

}
