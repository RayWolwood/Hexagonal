package com.hexagon.demo.adapters.in.web.controller.ui;

import com.hexagon.demo.adapters.in.web.constants.PathConstants;
import com.hexagon.demo.adapters.in.web.converter.OrderConverter;
import com.hexagon.demo.adapters.in.web.dto.OrderRq;
import com.hexagon.demo.adapters.in.web.dto.OrderRs;
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
