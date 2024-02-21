package com.hotwax.service.OrderItemService;

import com.hotwax.DTO.OrderItemDTO;
import com.hotwax.Entity.OrderHeader;
import com.hotwax.Entity.OrderItem;
import com.hotwax.Mapper.OrderItemMapper;
import com.hotwax.repository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderItemServiceIml implements OrderItemService{

    @Autowired
    OrderItemRepository orderItemRepository;
    @Override
    public OrderItemDTO createOrderItem(OrderItemDTO orderItemDTO) {

        OrderItem orderItem=OrderItemMapper.mapToOrderItem(orderItemDTO);
        OrderItem savedOrderItem=orderItemRepository.save(orderItem);
        OrderItemDTO respOrderItemDto=OrderItemMapper.mapToOrderItemDto(savedOrderItem);

        return respOrderItemDto;
    }

    @Override
    public List<OrderItemDTO> getAllOrdersList() {
        List<OrderItem>orderItemList =  orderItemRepository.findAll();
        return orderItemList.stream().map(OrderItemMapper::mapToOrderItemDto).collect(Collectors.toList());
    }

}
