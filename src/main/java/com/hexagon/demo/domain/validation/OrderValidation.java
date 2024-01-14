package com.hexagon.demo.domain.validation;

import com.hexagon.demo.domain.in.model.Order;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OrderValidation {
    public static void validate(Order order) {
        if (order.getName().contains("fff")) {
            throw new RuntimeException("validation failed");
        }
    }
}
