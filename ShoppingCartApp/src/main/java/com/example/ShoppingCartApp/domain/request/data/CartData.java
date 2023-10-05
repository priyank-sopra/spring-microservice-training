package com.example.ShoppingCartApp.domain.request.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartData {
	
	@JsonProperty("cartId")
	private long cartId;
	
	@JsonProperty("userId")
	private long userId;
	
	@JsonProperty("itemId")
	private long itemId;
	
	@JsonProperty("itemQty")
	private Integer itemQty;

}
