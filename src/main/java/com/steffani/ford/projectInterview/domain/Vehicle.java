package com.steffani.ford.projectInterview.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity
public class Vehicle {

    @Id
    private String vehicleId;
    @Embedded
    private VehicleDetails vehicleDetails;

    public Vehicle() {}
}



