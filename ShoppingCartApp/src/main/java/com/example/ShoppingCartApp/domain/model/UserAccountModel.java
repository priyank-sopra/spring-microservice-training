package com.example.ShoppingCartApp.domain.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAccountModel {
	
	@JsonProperty("firstName")
	public String firstName;	

	@JsonProperty("lastName")
	public String lastName;	

	@JsonProperty("gender")
	public String gender;	

	@JsonProperty("lastLogin")
	public Date lastLogin;		

	@JsonProperty("Address")
	public String address;	

	@JsonProperty("contactNo")
	public String contactNo;
	
	@JsonProperty("email")
	public String email;

	@JsonProperty("preferredLang")
	public String preferredLang;

}
