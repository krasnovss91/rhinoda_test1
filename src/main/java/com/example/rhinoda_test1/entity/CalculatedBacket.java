package com.example.rhinoda_test1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalculatedBacket {

    int productId;
    int amountProducts;
    float sumOfPosition;
    float totalSum;
}
