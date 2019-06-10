package com.driveThru.shops.controller;


import com.driveThru.shops.model.MemuItem;
import com.driveThru.shops.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest/order")
public class OrderRestController {

    @Autowired
    OrderService orderService ;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<MemuItem> update(@RequestBody final MemuItem memuItem){
        orderService.update(memuItem);
        return orderService.getMemu() ;
    }

    @GetMapping
    public List<MemuItem> getAll() {
        return orderService.getMemu() ;
    }

}

