package com.hexagon.demo.domain.in;

import com.hexagon.demo.domain.in.model.Order;

/**
 * API ядра бизнес логики
 */
public interface OrderService {
    Order save(Order order);
}
