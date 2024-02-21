package com.hotwax.service.OrderHeaderService;

import com.hotwax.DTO.OrderHeaderDTO;
import com.hotwax.EncrptDecrpt.TrippleDes;
import com.hotwax.Entity.OrderHeader;
import com.hotwax.Exception.CoustomException;
import com.hotwax.Mapper.OrderHeaderMapper;
import com.hotwax.repository.OrderHeaderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderHeaderServiceIml implements OrderHeaderService {

    OrderHeaderRepository orderHeaderRepository;

    TrippleDes t;

    {
        try {
            t = new TrippleDes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public OrderHeaderDTO createOrderHeader(OrderHeaderDTO orderHeaderDTO) {

        String encryptCreditCard =t.encrypt(orderHeaderDTO.getCreditCard());
        orderHeaderDTO.setCreditCard(encryptCreditCard);
        OrderHeader orderHeader = OrderHeaderMapper.mapToOrder(orderHeaderDTO);
        OrderHeader saveOrderHeader = orderHeaderRepository.save(orderHeader);
        return OrderHeaderMapper.mapToOrderHeaderDto(saveOrderHeader);
    }

    @Override
    public OrderHeaderDTO getOrderAllById(String id) {
       OrderHeader orderHeader = orderHeaderRepository.findById(Long.parseLong(id)).orElseThrow(()->
               new CoustomException("Order not Found By Given Id :"+id));

       String decryptCreditCard= t.decrypt(orderHeader.getCreditCard());
       orderHeader.setCreditCard(decryptCreditCard);
       return OrderHeaderMapper.mapToOrderHeaderDto(orderHeader);
    }

    @Override
    public OrderHeaderDTO updateOrder(String id, OrderHeaderDTO orderHeaderDTO) {
        OrderHeader orderHeader = orderHeaderRepository.findById(Long.parseLong(id)).orElseThrow(()->
                new CoustomException("Order Not Find by Given Id"+id));

        String encryptCreditCard =t.encrypt(orderHeaderDTO.getCreditCard());
        orderHeaderDTO.setCreditCard(encryptCreditCard);

        orderHeader = OrderHeaderMapper.mapToOrder(orderHeaderDTO);
        OrderHeader saveOrderHeader = orderHeaderRepository.save(orderHeader);
        return OrderHeaderMapper.mapToOrderHeaderDto(saveOrderHeader);
    }

    @Override
    public List<OrderHeaderDTO> getAllOrdersData() {
        List<OrderHeader> orderHeaderList = orderHeaderRepository.findAll();
        for(OrderHeader o: orderHeaderList){
            String decryptCreditCard=t.decrypt(o.getCreditCard());
            o.setCreditCard(decryptCreditCard);
        }

        return orderHeaderList.stream().map(
                OrderHeaderMapper::mapToOrderHeaderDto).collect(Collectors.toList());
    }

    @Override
    public boolean deleteOrder(String id) {
        if (orderHeaderRepository.existsById(Long.parseLong(id))) {
            orderHeaderRepository.findById(Long.parseLong(id)).orElseThrow(() ->
                    new CoustomException("Order Not Found By Given Id:" + id));

            orderHeaderRepository.deleteById(Long.parseLong(id));
            return true;
        }else{
            return false;
        }
    }
}
