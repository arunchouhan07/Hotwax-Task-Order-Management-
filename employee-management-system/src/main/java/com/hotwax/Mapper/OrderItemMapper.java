package com.hotwax.Mapper;

import com.hotwax.DTO.OrderItemDTO;
import com.hotwax.Entity.OrderHeader;
import com.hotwax.Entity.OrderItem;

public class OrderItemMapper {
    public static OrderItemDTO mapToOrderItemDto(OrderItem orderItem){
        OrderHeader orderHeader=new OrderHeader();
        orderHeader.setOrderId(orderItem.getOrderHeader().getOrderId());
        orderHeader.setOrderName(orderItem.getOrderHeader().getOrderName());
        orderHeader.setPlacedDate(orderItem.getOrderHeader().getPlacedDate());
        orderHeader.setApprovedDate(orderItem.getOrderHeader().getApprovedDate());
        orderHeader.setStatusId(orderItem.getOrderHeader().getStatusId());
        orderHeader.setPartyId(orderItem.getOrderHeader().getPartyId());
        orderHeader.setCurrencyUomId(orderItem.getOrderHeader().getCurrencyUomId());
        orderHeader.setProductStoreId(orderItem.getOrderHeader().getProductStoreId());
        orderHeader.setSalesChannelEnumId(orderItem.getOrderHeader().getSalesChannelEnumId());
        orderHeader.setGrandTotal(orderItem.getOrderHeader().getGrandTotal());
        orderHeader.setCompletedDate(orderItem.getOrderHeader().getCompletedDate());

        return new OrderItemDTO(
                orderItem.getOrderId(),
                orderItem.getOrderItemSeqId(),
                orderItem.getProductId(),
                orderItem.getItemDescription(),
                orderItem.getQuantity(),
                orderItem.getUnitAmount(),
                orderItem.getItemTypeEnumId(),
                orderHeader
        );
    }

    public static OrderItem mapToOrderItem(OrderItemDTO orderItemDTO){
        OrderHeader orderHeader=new OrderHeader();
        orderHeader.setOrderId(orderItemDTO.getOrderHeader().getOrderId());
        orderHeader.setOrderName(orderItemDTO.getOrderHeader().getOrderName());
        orderHeader.setPlacedDate(orderItemDTO.getOrderHeader().getPlacedDate());
        orderHeader.setApprovedDate(orderItemDTO.getOrderHeader().getApprovedDate());
        orderHeader.setStatusId(orderItemDTO.getOrderHeader().getStatusId());
        orderHeader.setPartyId(orderItemDTO.getOrderHeader().getPartyId());
        orderHeader.setCurrencyUomId(orderItemDTO.getOrderHeader().getCurrencyUomId());
        orderHeader.setProductStoreId(orderItemDTO.getOrderHeader().getProductStoreId());
        orderHeader.setSalesChannelEnumId(orderItemDTO.getOrderHeader().getSalesChannelEnumId());
        orderHeader.setGrandTotal(orderItemDTO.getOrderHeader().getGrandTotal());
        orderHeader.setCompletedDate(orderItemDTO.getOrderHeader().getCompletedDate());

        return new OrderItem(
                orderItemDTO.getOrderId(),
                orderItemDTO.getOrderItemSeqId(),
                orderItemDTO.getProductId(),
                orderItemDTO.getItemDescription(),
                orderItemDTO.getQuantity(),
                orderItemDTO.getUnitAmount(),
                orderItemDTO.getItemTypeEnumId(),
                orderHeader
                );
    }
}
