package com.hexagon.demo.domain.in.model;

import com.hexagon.demo.domain.validation.OrderValidation;
import lombok.Value;

import java.util.UUID;

@Value
public class Order {
    UUID id;
    String name;

    public Order(UUID id, String name) {
        this.id = id;
        this.name = name;
        OrderValidation.validate(this);
    }
}
