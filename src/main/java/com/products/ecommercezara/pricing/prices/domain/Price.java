package com.products.ecommercezara.pricing.prices.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "prices")
public class Price {

    private Integer brandId;   //INTEGER not null

    private LocalDate startDate; //DATETIME not null

    private LocalDate endDate;   //DATETIME not null

    @Id
    private Integer priceList; //INTEGER not null

    private Integer productId; //INTEGER not null

    private Integer priority;  //INTEGER not null

    private BigDecimal price;     //DECIMAL not null

    private String curr;      //VARCHAR not null
}
