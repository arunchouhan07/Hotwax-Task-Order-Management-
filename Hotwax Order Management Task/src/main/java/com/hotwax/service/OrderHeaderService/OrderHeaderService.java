package com.hotwax.service.OrderHeaderService;

import com.hotwax.DTO.OrderHeaderDTO;

import java.util.List;

public interface OrderHeaderService {
    List<OrderHeaderDTO> getAllOrdersData();

    OrderHeaderDTO createOrderHeader(OrderHeaderDTO orderHeaderDTO);

    OrderHeaderDTO getOrderAllById(String id);

    OrderHeaderDTO updateOrder(String id, OrderHeaderDTO employeeDto);

    boolean deleteOrder(String id);
}
