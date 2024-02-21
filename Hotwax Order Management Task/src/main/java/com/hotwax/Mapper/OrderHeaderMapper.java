package com.hotwax.Mapper;

import com.hotwax.DTO.OrderHeaderDTO;
import com.hotwax.Entity.OrderHeader;

public class OrderHeaderMapper {
    public static OrderHeaderDTO mapToOrderHeaderDto(OrderHeader orderHeader){
        return new OrderHeaderDTO(
                orderHeader.getOrderId(),
                orderHeader.getOrderName(),
                orderHeader.getPlacedDate(),
                orderHeader.getApprovedDate(),
                orderHeader.getStatusId(),
                orderHeader.getPartyId(),
                orderHeader.getCurrencyUomId(),
                orderHeader.getProductStoreId(),
                orderHeader.getSalesChannelEnumId(),
                orderHeader.getGrandTotal(),
                orderHeader.getCompletedDate(),
                orderHeader.getCreditCard()
        );
    }

    public static OrderHeader mapToOrder(OrderHeaderDTO orderHeaderDTO){
        return new OrderHeader(
                orderHeaderDTO.getOrderId(),
                orderHeaderDTO.getOrderName(),
                orderHeaderDTO.getPlacedDate(),
                orderHeaderDTO.getApprovedDate(),
                orderHeaderDTO.getStatusId(),
                orderHeaderDTO.getPartyId(),
                orderHeaderDTO.getCurrencyUomId(),
                orderHeaderDTO.getProductStoreId(),
                orderHeaderDTO.getSalesChannelEnumId(),
                orderHeaderDTO.getGrandTotal(),
                orderHeaderDTO.getCompletedDate(),
                orderHeaderDTO.getCreditCard()
        );
    }
}

























