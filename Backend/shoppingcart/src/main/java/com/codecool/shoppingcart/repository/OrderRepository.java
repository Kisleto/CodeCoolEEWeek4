package com.codecool.shoppingcart.repository;

import com.codecool.shoppingcart.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
