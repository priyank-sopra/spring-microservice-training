package com.example.ShoppingCartApp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ShoppingCartApp.domain.request.data.CartData;
import com.example.ShoppingCartApp.service.UserCartService;

@RestController
@RequestMapping("/user-cart")
public class UserCartController {
	
	@Autowired
	UserCartService userCartService;

	@GetMapping("/{userId}")
	public ResponseEntity<Collection<CartData>> getUserCart(@PathVariable Long userId) throws Exception{
		return new ResponseEntity(userCartService.getActiveCart(userId), HttpStatus.OK);
	}
	
	/*
	 * @PutMapping public ResponseEntity<CartData> updateCart(@RequestBody CartData
	 * cartData) throws Exception { return new
	 * ResponseEntity(userCartService.updateCart(cartData), HttpStatus.ACCEPTED); }
	 */
	
	@PostMapping
	public ResponseEntity<CartData> createCart(@RequestBody CartData cartData) throws Exception {		
		return new ResponseEntity(userCartService.updateCart(cartData), HttpStatus.CREATED);
	}
}

