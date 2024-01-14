package com.hexagon.demo.domain.out;

import com.hexagon.demo.domain.in.model.Order;

import java.util.Optional;

public interface OrderRepository {
    Optional<Order> save(Order order);
}
