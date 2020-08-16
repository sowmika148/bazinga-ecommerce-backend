package com.bazinga.ecommerce.backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String imageName;
}
