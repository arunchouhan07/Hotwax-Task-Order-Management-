package com.hotwax.controller;

import com.hotwax.DTO.OrderHeaderDTO;
import com.hotwax.service.OrderHeaderService.OrderHeaderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrderHeaderController {

    OrderHeaderService orderHeaderService;

    @PostMapping
    public String createEmployee(@RequestBody OrderHeaderDTO employeeDto) {
        OrderHeaderDTO savedEmployeeData = orderHeaderService.createOrderHeader(employeeDto);
        return "Order Add Successfully";
        //return new ResponseEntity<>(savedEmployeeData, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<OrderHeaderDTO>> getAllOrders() {
        List<OrderHeaderDTO> orders = orderHeaderService.getAllOrdersData();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("{id}")
    public ResponseEntity<OrderHeaderDTO> getOrderById(@PathVariable("id") String orderId) {
        OrderHeaderDTO order = orderHeaderService.getOrderAllById(orderId);
        return ResponseEntity.ok(order);
    }

    @PutMapping("/update/{orderId}")
    public ResponseEntity<OrderHeaderDTO> updateOrderName(
            @PathVariable("orderId") String orderId,
            @RequestBody OrderHeaderDTO updateOrderRequestDTO) {
        OrderHeaderDTO updatedOrder = orderHeaderService.updateOrder(orderId, updateOrderRequestDTO);
        return ResponseEntity.ok(updatedOrder);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id")String orderId){
            if(orderHeaderService.deleteOrder(orderId)){
                return ResponseEntity.ok("Order Delete Successfully");
            }
            else{
                return ResponseEntity.ok("Order Not Found");
            }
    }
}
