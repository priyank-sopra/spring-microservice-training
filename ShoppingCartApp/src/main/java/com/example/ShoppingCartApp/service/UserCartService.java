package com.example.ShoppingCartApp.service;

import java.util.Collection;

import com.example.ShoppingCartApp.domain.request.data.CartData;
import com.example.ShoppingCartApp.entity.UserCart;

public interface UserCartService {

	public Collection<CartData> getActiveCart(Long userId) throws Exception;
	public UserCart createCart(CartData cartAction) throws Exception;
	public UserCart updateCart(CartData cartAction) throws Exception;
	
}
