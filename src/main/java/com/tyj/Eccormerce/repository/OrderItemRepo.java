package com.tyj.Eccormerce.repository;

import com.tyj.Eccormerce.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderItemRepo extends JpaRepository <OrderItem, Long>, JpaSpecificationExecutor<OrderItem> {
}
