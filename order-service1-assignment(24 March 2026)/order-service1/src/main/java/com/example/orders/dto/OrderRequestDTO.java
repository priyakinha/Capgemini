package com.example.orders.dto;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequestDTO {
 @Max(100)
 private long orderid;
 @NotBlank
 @NotEmpty
@Size(min=3)
 private String customerName;
 @Email
 private String email;
 @NotNull
 private String productName;
 @NotNull
 @Min(1)
 private int quantity;
 private double pricePerUnit;

 public OrderRequestDTO(){}

 public OrderRequestDTO(String customerName, String email, int quantity, String productName, double pricePerUnit) {
  this.customerName = customerName;
  this.email = email;
  this.quantity = quantity;
  this.productName = productName;
  this.pricePerUnit = pricePerUnit;
 }
}
