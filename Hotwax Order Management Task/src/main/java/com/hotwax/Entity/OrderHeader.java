package com.hotwax.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_header")
public class OrderHeader {

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_name")
    private String orderName;

    @Column(name = "placed_date")
    private Date placedDate;

    @Column(name = "approved_date")
    private Date approvedDate;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "party_id")
    private String partyId;

    @Column(name = "currency_uom_id")
    private String currencyUomId;

    @Column(name = "product_store_id")
    private String productStoreId;

    @Column(name = "sales_channel_enum_id")
    private String salesChannelEnumId;

    @Column(name = "grand_total")
    private Double grandTotal;

    @Column(name = "completed_date")
    private Date completedDate;

    @Column(name = "credit_card",columnDefinition = "VARBINARY(200)")
    private String creditCard;
}
