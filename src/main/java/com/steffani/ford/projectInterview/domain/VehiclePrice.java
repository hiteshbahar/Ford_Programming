package com.steffani.ford.projectInterview.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
@AllArgsConstructor
public class VehiclePrice {

    private String MSRP;
    private String savings;
    private String finalPrice;

    public  VehiclePrice() {}
}
