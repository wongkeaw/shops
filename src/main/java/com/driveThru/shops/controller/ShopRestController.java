package com.driveThru.shops.controller;


import com.driveThru.shops.entity.Order;
import com.driveThru.shops.model.ShopItem;
import com.driveThru.shops.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/rest/shop")
public class ShopRestController {

    @Autowired
    OrderService orderService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> update(@RequestBody final Order order){
        orderService.update(order);
        return orderService.getAll();
    }

    @GetMapping
    public List<List<ShopItem>> getAll() {
        List<List<ShopItem>> shops = new ArrayList<>();

        for (int row = 0 ; row < 10 ; row++){
            ArrayList<ShopItem> shi = new ArrayList<>() ;
            for (int cal = 0 ; cal < 4 ; cal++){
                ShopItem shop  = new ShopItem() ;
                shop.setName("Name"+ row +""+cal );
                shop.setDescription("Description"+ row +""+cal );
                shop.setAmountDue(10);
                shop.setAmountMade(2000);
                shop.setImgUrl("/images/Fried_chicken_1.jpg");
                shi.add(shop) ;
            }
            shops.add(shi) ;
        }
        return  shops ;

    }

}

