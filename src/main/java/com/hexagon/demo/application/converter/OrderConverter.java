package com.hexagon.demo.application.converter;

import com.hexagon.demo.application.dto.OrderRq;
import com.hexagon.demo.application.dto.OrderRs;
import com.hexagon.demo.domain.in.model.Order;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class OrderConverter {

    public OrderRs toRs(Order order) {
        return new OrderRs(
                order.getId(),
                order.getName()
        );
    }

    public Order toOrder(OrderRq orderRq) {
        return new Order(
                UUID.randomUUID(),
                orderRq.getName()
        );
    }

}
