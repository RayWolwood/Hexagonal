package com.hexagon.demo.application.dto;

import lombok.Value;

import java.util.UUID;

@Value
public class OrderRs {
    UUID id;
    String name;
}
