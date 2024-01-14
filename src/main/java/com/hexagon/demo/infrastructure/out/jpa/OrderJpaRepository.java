package com.hexagon.demo.infrastructure.out.jpa;

import com.hexagon.demo.domain.in.model.Order;
import com.hexagon.demo.domain.out.OrderRepository;
import com.hexagon.demo.infrastructure.out.converter.OrderEntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class OrderJpaRepository implements OrderRepository {
    private final JpaRepository<OrderEntity, UUID> jpaRepository;

    @Override
    public Optional<Order> save(Order orderEntity) {
        return Optional.of(
                        jpaRepository.save(OrderEntityConverter.toEntity(orderEntity))
                )
                .map(OrderEntityConverter::toOrder);
    }
}
