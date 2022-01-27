package com.example.rhinoda_test1.service;

import com.example.rhinoda_test1.controller.BacketController;
import com.example.rhinoda_test1.entity.Backet;
import org.springframework.beans.factory.annotation.Autowired;

public class BacketService {

    @Autowired
    BacketController backetController;

    public float CalculateTotalSum(Backet backet){//вернуть стоимость, используя внешний микросервис

        var totalSum = 0;
        return totalSum;
    }
}
