package com.hexagon.demo.domain.service;

import com.hexagon.demo.domain.in.OrderService;
import com.hexagon.demo.domain.in.model.Order;
import com.hexagon.demo.domain.out.OrderRepository;
import com.hexagon.demo.domain.out.OrderWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderWebClient orderWebClient;
    private final OrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        orderRepository.save(order)
                .ifPresent(orderWebClient::send);
        return order;
    }
}
