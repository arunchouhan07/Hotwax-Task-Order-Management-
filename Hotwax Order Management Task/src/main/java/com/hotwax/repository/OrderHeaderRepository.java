package com.hotwax.repository;

import com.hotwax.Entity.OrderHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHeaderRepository extends JpaRepository<OrderHeader, Long> {
    // You can add custom query methods here if needed
}
