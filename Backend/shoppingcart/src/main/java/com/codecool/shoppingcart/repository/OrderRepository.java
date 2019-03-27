package com.codecool.shoppingcart.repository;

import com.codecool.shoppingcart.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderProduct, Long> {
}
