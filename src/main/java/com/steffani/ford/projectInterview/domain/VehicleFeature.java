package com.steffani.ford.projectInterview.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.util.List;

@Embeddable
@Data
@AllArgsConstructor
public class VehicleFeature {

    @Embedded
    private Exterior exterior;
    @Embedded
    private Interior interior;


    public VehicleFeature() {}
}
