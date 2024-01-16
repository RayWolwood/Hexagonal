package com.hexagon.demo.adapters.in.web.dto;

import lombok.Value;

import java.util.UUID;

@Value
public class OrderRs {
    UUID id;
    String name;
}
