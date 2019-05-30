package com.driveto.shops.controller;


import com.driveto.shops.entity.Order;
import com.driveto.shops.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public List<Order> getAll() {
        return orderService.getAll();
    }

}

