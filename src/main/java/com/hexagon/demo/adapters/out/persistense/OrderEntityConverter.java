package com.hexagon.demo.adapters.out.persistense;

import com.hexagon.demo.domain.in.model.Order;
import com.hexagon.demo.adapters.out.persistense.OrderEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OrderEntityConverter {

    public static OrderEntity toEntity(Order order) {
        return new OrderEntity(
                order.getId(),
                order.getName()
        );
    }

    public static Order toOrder(OrderEntity orderEntity) {
        return new Order(
                orderEntity.getId(),
                orderEntity.getName()
        );
    }
}
