package com.hexagon.demo.adapters.in.web.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class OrderRq {
    @NotBlank
    String name;
}
