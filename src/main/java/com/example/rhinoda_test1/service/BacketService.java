package com.example.rhinoda_test1.service;

import com.example.rhinoda_test1.controller.BacketController;
import com.example.rhinoda_test1.entity.Backet;
import com.example.rhinoda_test1.entity.CalculatedBacket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BacketService {

    @Autowired
    BacketController backetController;

    public CalculatedBacket CalculateBacketCost(Backet backet){//вернуть стоимость, используя внешний микросервис
//получить полную стоимость, собрать через конструктор расчитаную корзину и вернуть

        var sumOfPosition = 0;// получить из кэша
        var totalSum = 0;//получить из другого микросервиса по http

    }
}
