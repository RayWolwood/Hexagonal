package com.hexagon.demo.application.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class OrderRq {
    @NotBlank
    String name;
}
