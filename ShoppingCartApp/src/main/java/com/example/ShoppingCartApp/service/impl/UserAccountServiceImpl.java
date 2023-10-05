package com.example.ShoppingCartApp.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShoppingCartApp.domain.model.UserAccountModel;
import com.example.ShoppingCartApp.entity.UserAccount;
import com.example.ShoppingCartApp.repository.UserAccountRepository;
import com.example.ShoppingCartApp.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService {
	
	@Autowired
	private UserAccountRepository userAccountRepository;

	public UserAccountModel createNewUser(UserAccount userAccount) throws Exception {		
		userAccountRepository.save(userAccount);
		return new UserAccountModel().builder()
				    .firstName(userAccount.getFirstName())
				    .lastName(userAccount.getLastName())
				    .gender(userAccount.getGender())
				    .lastLogin(userAccount.getLastLogin())
				    .address(userAccount.getAddress())
				    .contactNo(userAccount.getContactNo())
				    .email(userAccount.getEmail())
				    .build();
	}

	public UserAccountModel userlookup(Long userId) {
		Optional<UserAccount> usrDtl = userAccountRepository.findById(userId);
		return usrDtl.isEmpty() ? new UserAccountModel() : new UserAccountModel().builder()
			    .firstName(usrDtl.get().getFirstName())
			    .lastName(usrDtl.get().getLastName())
			    .gender(usrDtl.get().getGender())
			    .lastLogin(usrDtl.get().getLastLogin())
			    .address(usrDtl.get().getAddress())
			    .contactNo(usrDtl.get().getContactNo())
			    .email(usrDtl.get().getEmail())
			    .build() ;
	}

}
