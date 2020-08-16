package com.bazinga.ecommerce.backend.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Cart {
    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private int productId;
}
