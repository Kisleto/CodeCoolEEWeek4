package com.codecool.shitwish.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShopItem {
    @Id
    @GeneratedValue
    private long id;

    @NotNull(message = "Product name is required.")
    private String name;

    private String category; //needed?

    private String imgURL;

    private String description;

    private double price;
}
