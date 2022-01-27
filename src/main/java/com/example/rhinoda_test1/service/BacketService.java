package com.example.rhinoda_test1.service;

import com.example.rhinoda_test1.entity.Backet;
import com.example.rhinoda_test1.entity.CalculatedBacket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;

@Service
public class BacketService {

    @Autowired
    HttpClient httpClient;//изображает другой микросервис

    public CalculatedBacket CalculateBacketCost(Backet backet) {//вернуть стоимость, используя внешний микросервис
//получить полную стоимость, собрать через конструктор расчитаную корзину и вернуть

        var sumOfPosition = getSumOfPosition(backet);
        //использовать springframework.cache
        var totalSum = httpClient.send(backet.getAmountProducts() + sumOfPosition, responseHandler());//взять количество товаров и сумму по позиции, кинуть в другой микросервис по http и получить из него ответ

        var calculatedBacket = new CalculatedBacket(backet.getProductId(), backet.getAmountProducts(), sumOfPosition, totalSum);//соберём через конструктор объект расчитанной корзины

        return calculatedBacket;
    }

    //сделать метод для получения суммы по позиции из кэша
    @Cacheable(cacheNames = "sumOfPosition")
    private float getSumOfPosition(Backet backet) {
        var sumOfPosition = 0;//инициализировали переменную для данных из кэша
        if (sumOfPosition == 0) {//если ничего нет, идём в другой микросервис, берём данные оттуда и помещаем в кэш
            sumOfPosition = httpClient.send(backet.getProductId(), requestHandler());//получим данные из микросервиса по productId
        }
        return sumOfPosition;
    }
}
