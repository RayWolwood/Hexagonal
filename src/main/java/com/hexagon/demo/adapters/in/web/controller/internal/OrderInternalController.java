package com.hexagon.demo.adapters.in.web.controller.internal;

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

@RestController(PathConstants.INTERNAL + "/orders")
@RequiredArgsConstructor
public class OrderInternalController {
    private final OrderConverter orderConverter;
    private final OrderService orderService;

    @PostMapping("/save")
    public OrderRs save(@RequestBody @Valid final OrderRq orderRq) {
        return orderConverter.toRs(
                orderService.save(orderConverter.toOrder(orderRq))
        );
    }
}
