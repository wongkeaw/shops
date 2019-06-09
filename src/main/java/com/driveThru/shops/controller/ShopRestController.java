package com.driveThru.shops.controller;


import com.driveThru.shops.model.ShopItem;
import com.driveThru.shops.service.ShopServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest/shop")
public class ShopRestController {

    @Autowired
    ShopServer shopServer ;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<ShopItem> update(@RequestBody final ShopItem shopItem){
        shopServer.update(shopItem);
        return shopServer.getMemu() ;
    }

    @GetMapping
    public List<ShopItem> getAll() {
        return shopServer.getMemu() ;
    }

}

