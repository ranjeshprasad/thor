package com.fis.innovate48.thor.skills.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="user_skills")
public class UserSkills {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private Integer userId;
	private Integer skillId;
	private Boolean notification;
	private Date createdDate;
	private Date lastUpdateDate;
	public UserSkills() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserSkills(Integer id, Integer userId, Integer skillId, Boolean notification, Date createdDate,
			Date lastUpdateDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.skillId = skillId;
		this.notification = notification;
		this.createdDate = createdDate;
		this.lastUpdateDate = lastUpdateDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}
	public Boolean getNotification() {
		return notification;
	}
	public void setNotification(Boolean notification) {
		this.notification = notification;
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
		return "UserSkills [id=" + id + ", userId=" + userId + ", skillId=" + skillId + ", notification=" + notification
				+ ", createdDate=" + createdDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}
	
	

}
