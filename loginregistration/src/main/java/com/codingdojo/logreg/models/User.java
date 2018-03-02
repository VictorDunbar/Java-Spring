package com.codingdojo.logreg.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;




@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue
	private Long id;
	
	
	@Size(min=2, message="First name is too short")
	@Pattern(regexp="[a-zA-Z]*", message="Letters and spaces only")
	private String first_name;
	@Size(min=2, message="Last name is too short")
	@Pattern(regexp="[a-zA-Z]*", message="Letters and spaces only")
	private String last_name;
	@Email
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Past
	private Date birthday;
	@Size(min=3)
	private String password;
	private Date createdAt;
	private Date updatedAt;
	private Date lastLoggedIn;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "user",
			joinColumns = @JoinColumn(name="user_id")
	)
	
	
	@PrePersist()
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate()
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(Date lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}
	
	
}
