package com.example.ShoppingCartApp.service;

import org.springframework.stereotype.Service;

import com.example.ShoppingCartApp.domain.model.UserAccountModel;
import com.example.ShoppingCartApp.entity.UserAccount;

@Service
public interface UserAccountService {
	
	public UserAccountModel createNewUser(UserAccount userAccount) throws Exception;
	
	public UserAccountModel userlookup(Long userId);

}
