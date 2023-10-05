package com.example.ShoppingCartApp.entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="USER_CART")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCart {
		
	@Id
	@Column(name="CART_ID")
    @GeneratedValue
    private long cartId;
	
	@Column(name="USER_ID", nullable = false)
	private long userId;
	
	@Column(name="ITEM_ID", nullable = false)
	private long itemId;
	
	@Column(name="ITEM_QTY", nullable = false, columnDefinition = "NUMBER DEFAULT 1")
	private Integer itemQty;
	
	@Column(name="active", columnDefinition = "char(1) DEFAULT 'Y'")
	private String active;
}
