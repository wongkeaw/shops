package com.driveThru.shops.service;

import com.driveThru.shops.model.MemuItem;
import com.driveThru.shops.model.ShopItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private  static List<MemuItem> items = new ArrayList<>();

    OrderService(){
        for (int running = 0 ; running < 44 ; running++){
            MemuItem item  = new MemuItem() ;
            item.setId(running);
            item.setName("Name"+running );
            item.setDescription("Description "+running );
            item.setPrice(10);
            item.setImgUrl("/images/Fried_chicken_1.jpg");
            items.add(item) ;
        }
    }

    public List<MemuItem> getMemu(){
        return items;
    }

    public void update(MemuItem menuItem) {
        System.out.println("ShopItem");
        Object[] si = items.stream().filter(x -> x.getId() == menuItem.getId()).toArray() ;
        ShopItem item = (ShopItem)si[0] ;
        item.setAmountDue(item.getAmountDue() - 1);
        item.setAmountMade(item.getAmountMade() + 1);
    }
}