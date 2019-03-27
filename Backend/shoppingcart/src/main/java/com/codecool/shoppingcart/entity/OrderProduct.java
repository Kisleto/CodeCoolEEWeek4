package com.codecool.shoppingcart.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProduct {

    private String name;

    private double price;

    private Integer quantity;
}
