package com.codingdojo.driverslicense.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class License {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String number;
    @Column
    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private Date expiration_date;
    @Column
    @Size(max=2)
    private String state;
    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date createdAt;
    
    @Column
    @DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    private Date updatedAt;
    
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    
    
    private Person person;
    
    public License() {
    }
    
//    public License(String number, Date expiration_date, String state, Person person) {
//    	this.number = number;
//    	this.expiration_date = expiration_date;
//    	this.state = state;
//    }
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    public Long getId() {
    	return id;
    }
   
    public void setId(Long id) {
    	this.id = id;
    }
    
    public String getNumber() {
    	return number;
    }
    
    public void setNumber(String number) {
    	this.number = number;
    }
    
    public Date getExpiration_date() {
    	return expiration_date;
    }
    
    public void setExpiration_date(Date expiration_date) {
    	this.expiration_date = expiration_date;
    }
    
    public String getState() {
    	return state;
    }
    
    public void  setState(String state) {
    	this.state = state;
    }
    
    public Date createdAt() {
    	return createdAt;
    }
    
    public void setCreatedAt(Date creatdAt) {
    	this.createdAt = new Date();
    }
    
    public Date updatedAt() {
    	return updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
    	this.updatedAt = new Date();
    }
    
    public Person getPerson() {
    	return person;
    }
    
    public void setPerson(Person person) {
    	this.person = person;
    }
    
    	
	
		
   
    
}    