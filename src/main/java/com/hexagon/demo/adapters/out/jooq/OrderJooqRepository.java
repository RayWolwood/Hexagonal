package com.hexagon.demo.adapters.out.jooq;

import com.hexagon.demo.domain.in.model.Order;
import com.hexagon.demo.domain.out.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class OrderJooqRepository implements OrderRepository {

    @Override
    public Optional<Order> save(Order order) {
        return Optional.empty();
    }
}
