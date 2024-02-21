package com.hotwax.DTO;

import com.hotwax.Entity.OrderHeader;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDTO {

    private String orderId;

    private String orderItemSeqId;

    private String productId;

    private String itemDescription;

    private String quantity;

    private String unitAmount;

    private String itemTypeEnumId;

    private OrderHeader orderHeader;
}
