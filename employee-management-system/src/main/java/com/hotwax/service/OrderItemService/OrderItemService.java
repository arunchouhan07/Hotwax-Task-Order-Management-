package com.hotwax.service.OrderItemService;

import com.hotwax.DTO.OrderHeaderDTO;
import com.hotwax.DTO.OrderItemDTO;

import java.util.List;

public interface OrderItemService {

    OrderItemDTO createOrderItem(OrderItemDTO orderItemDTO);

    List<OrderItemDTO> getAllOrdersList();


}
