package com.example.rhinoda_test1.service;

import com.example.rhinoda_test1.controller.BacketController;
import com.example.rhinoda_test1.entity.Backet;
import com.example.rhinoda_test1.entity.CalculatedBacket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;

@Service
public class BacketService {

    @Autowired
    HttpClient httpClient;//изображает другой микросервис

    public CalculatedBacket CalculateBacketCost(Backet backet){//вернуть стоимость, используя внешний микросервис
//получить полную стоимость, собрать через конструктор расчитаную корзину и вернуть

        var sumOfPosition = 0;// получить из кэша
        var totalSum = 0;//взять количество товаров и сумму по позиции, кинуть в другой микросервис по http и получить из него ответ

    }
}
