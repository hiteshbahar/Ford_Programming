package com.steffani.ford.projectInterview.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@Entity
public class Vehicles {

    @JsonProperty("Vehicles")
    private ArrayList <Vehicle> Vehicle = new ArrayList<>();


    public Vehicles() {}
}
