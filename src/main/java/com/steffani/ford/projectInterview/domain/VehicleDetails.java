package com.steffani.ford.projectInterview.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Data
@Embeddable
@AllArgsConstructor
public class VehicleDetails {

    private String make;
    private String model;
    private String modelYear;
    private String bodyStyle;
    private String engine;
    private String drivetype;
    private String color;
    private String MPG;
    @Embedded
    private VehicleFeature vehicleFeature;
    @Embedded
    private VehiclePrice vehiclePrice;

    public VehicleDetails() {}
}
