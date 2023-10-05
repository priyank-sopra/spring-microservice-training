package com.example.ShoppingCartApp.domain.request.data;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountData {
 	
	@JsonProperty("firstName")
	public String firstName;	
	
	@JsonProperty("lastName")
	public String lastName;	
	
	@JsonProperty("gender")
	public String gender;	
	
	@JsonProperty("password")
	public String password;	
	
	@JsonProperty("lastLogin")
	public Date lastLogin;	
	
	@JsonProperty("createdOn")
	public Timestamp createdOn;	
	
	@JsonProperty("passwordUpdatedOn")
	public Date passwordUpdatedOn;	
	
	@JsonProperty("Address")
	public String Address;	
	
	@JsonProperty("contactNo")
	public String contactNo;
	
	@JsonProperty("preferredLang")
	public String preferredLang;
}
