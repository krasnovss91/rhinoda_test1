package com.example.rhinoda_test1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Backet {

    int productId;
    int amountProducts;
    String paymentType;
    int addressId;

}
