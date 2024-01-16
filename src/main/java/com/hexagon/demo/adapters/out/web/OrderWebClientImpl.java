package com.hexagon.demo.adapters.out.web;

import com.hexagon.demo.domain.in.model.Order;
import com.hexagon.demo.domain.out.OrderWebClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class OrderWebClientImpl implements OrderWebClient {
    private final RestTemplate restTemplate;

    @Override
    public void send(Order orderEntity) {
        restTemplate.postForEntity("http://url.com", orderEntity, Order.class);
    }
}
