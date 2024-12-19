package com.tyj.Eccormerce.repository;

import com.tyj.Eccormerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
