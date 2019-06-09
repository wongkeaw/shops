package com.driveThru.shops.repository;


import com.driveThru.shops.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

