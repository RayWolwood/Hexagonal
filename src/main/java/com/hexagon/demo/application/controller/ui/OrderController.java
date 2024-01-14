package com.hexagon.demo.application.controller.ui;

import com.hexagon.demo.application.constants.PathConstants;
import com.hexagon.demo.application.converter.OrderConverter;
import com.hexagon.demo.application.dto.OrderRq;
import com.hexagon.demo.application.dto.OrderRs;
import com.hexagon.demo.domain.in.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(PathConstants.UI + "/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderConverter orderConverter;
    private final OrderService orderService;

    @PostMapping(value = "/save")
    public OrderRs save(@RequestBody @Valid final OrderRq orderRq) {
        return orderConverter.toRs(
                orderService.save(orderConverter.toOrder(orderRq))
        );
    }
}
