package com.hotwax.controller;

import com.hotwax.DTO.OrderItemDTO;
import com.hotwax.service.OrderItemService.OrderItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/orderItems")
@AllArgsConstructor
public class OrderItemController {

    OrderItemService orderItemService;

    @PostMapping("/addOrderItem")
    public String createOrderItem(@RequestBody OrderItemDTO orderItemDTO){
        orderItemService.createOrderItem(orderItemDTO);
        return "OrderItem Created Successfully!!!";
    }

    @GetMapping("/getAllOrdersItem")
    public ResponseEntity<List<OrderItemDTO>> getAllOrdersItems(){
        List<OrderItemDTO> orderItemDTOS=orderItemService.getAllOrdersList();
        return ResponseEntity.ok(orderItemDTOS);
    }
}
