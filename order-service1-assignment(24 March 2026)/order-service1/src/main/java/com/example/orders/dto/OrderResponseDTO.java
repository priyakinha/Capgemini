package com.example.orders.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderResponseDTO {
    private Long orderId;
    private String customerName;
    private String email;
    private String productName;
    private int quantity;
    private double pricePerUnit;
    private double totalAmount;


}
