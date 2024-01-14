package com.hexagon.demo.domain.out;

import com.hexagon.demo.domain.in.model.Order;

/**
 * Порт внешнего сервиса
 */
public interface OrderWebClient {
    void send(Order order);
}
