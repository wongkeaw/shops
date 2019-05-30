package com.driveto.shops.service;

import com.driveto.shops.entity.Order;
import com.driveto.shops.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public void update(Order user) {
        orderRepository.save(user);
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }
}
