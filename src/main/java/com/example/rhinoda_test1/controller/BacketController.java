package com.example.rhinoda_test1.controller;

import com.example.rhinoda_test1.entity.Backet;
import com.example.rhinoda_test1.entity.CalculatedBacket;
import com.example.rhinoda_test1.service.BacketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BacketController {

    @Autowired
    BacketService backetService;

    @PostMapping("/getBacket")
    public void getBacket(Backet backet){//поймать по сети объект "Корзина" и передать его сервису

    }

    public CalculatedBacket setCalculatedBacket(){//

    }

}
