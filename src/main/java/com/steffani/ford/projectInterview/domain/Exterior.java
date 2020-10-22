package com.steffani.ford.projectInterview.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import java.util.ArrayList;

@Data
@Embeddable
@AllArgsConstructor
public class Exterior {
    private ArrayList<String> exterior;

    public Exterior() {}
}
