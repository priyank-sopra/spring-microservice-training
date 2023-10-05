package com.example.ShoppingCartApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ShoppingCartApp.entity.UserAccount;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
	
}
