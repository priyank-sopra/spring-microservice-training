package com.example.ShoppingCartApp.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ShoppingCartApp.domain.request.data.CartData;
import com.example.ShoppingCartApp.entity.UserCart;

@Repository
public interface UserCartRepository extends JpaRepository<UserCart, Long> {
	
	@Query(value = "SELECT * FROM USER_CART where active = 'Y' and user_id=:userId ORDER BY cart_id", nativeQuery = true)
	   public Collection<UserCart> getUserCart(@Param("userId") Long userId);

}
