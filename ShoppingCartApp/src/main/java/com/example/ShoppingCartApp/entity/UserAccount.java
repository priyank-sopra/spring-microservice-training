package com.example.ShoppingCartApp.entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="USER_ACCOUNT")
public class UserAccount {
	 
	@Id
	@Column(name="USER_ID")
    @GeneratedValue
    private long userId;
	
	@Column(name="FIRST_NAME", columnDefinition = "varchar2(20)")
	public String firstName;	

	@Column(name="LAST_NAME", columnDefinition = "varchar2(20)")
	public String lastName;	

	@Column(name="GENDER", columnDefinition = "char(1)")
	public String gender;	

	@Column(name="PASSWORD", columnDefinition = "varchar2(50)")
	public String password;	

	@Column(name="LAST_LOGIN")
	public Date lastLogin;	

	@Column(name="CREATED_ON", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	public Timestamp createdOn;	

	@Column(name="PASSWORD_UPDATED_ON")
	public Date passwordUpdatedOn;	

	@Column(name="ADDRESS", columnDefinition = "varchar2(100)")
	public String address;	

	@Column(name="CONTACT_NO", columnDefinition = "varchar2(10)")
	public String contactNo;

	@Column(name="EMAIL", columnDefinition = "varchar2(100)")
	public String email;
	
	@Column(name="PREFERRED_LANG", columnDefinition = "char(2)")
	public String preferredLang;
	

}
