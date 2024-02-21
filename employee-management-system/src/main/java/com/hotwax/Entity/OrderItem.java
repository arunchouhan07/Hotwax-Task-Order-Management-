package com.hotwax.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_item_seq_id")
    private String orderItemSeqId;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "item_description")
    private String itemDescription;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "unit_amount")
    private String unitAmount;

    @Column(name = "item_type_enum_id")
    private String itemTypeEnumId;

    @OneToOne
    private OrderHeader orderHeader;
}
