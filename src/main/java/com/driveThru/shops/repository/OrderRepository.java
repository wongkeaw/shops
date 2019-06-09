package com.driveThru.shops.repository;


import com.driveThru.shops.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

