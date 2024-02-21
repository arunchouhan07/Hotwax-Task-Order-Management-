package com.hotwax.DTO;

import java.util.Date;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderHeaderDTO {
    private String orderId;
    private String orderName;
    private Date placedDate;
    private Date approvedDate;
    private String statusId;
    private String partyId;
    private String currencyUomId;
    private String productStoreId;
    private String salesChannelEnumId;
    private Double grandTotal;
    private Date completedDate;
    private String creditCard;
}
