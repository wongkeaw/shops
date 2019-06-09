package com.driveThru.shops.service;

import com.driveThru.shops.model.ShopItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopServer {

    private  static List<ShopItem> shops = new ArrayList<>();

    ShopServer(){
        for (int running = 0 ; running < 44 ; running++){
            ShopItem shop  = new ShopItem() ;
            shop.setId(running);
            shop.setName("Name"+running );
            shop.setDescription("Description "+running );
            shop.setAmountDue(10);
            shop.setAmountMade(2000);
            shop.setImgUrl("/images/Fried_chicken_1.jpg");
            shops.add(shop) ;
        }
    }

    public List<ShopItem> getMemu(){
        return  shops ;
    }

    public void update(ShopItem shopItem) {
        System.out.println("ShopItem");
        Object[] si = shops.stream().filter(x -> x.getId() == shopItem.getId()).toArray() ;
        ShopItem item = (ShopItem)si[0] ;
        item.setAmountDue(item.getAmountDue() - 1);
        item.setAmountMade(item.getAmountMade() + 1);
    }
}
