package com.steffani.ford.projectInterview.repository;

import com.steffani.ford.projectInterview.domain.Vehicles;
import org.springframework.data.repository.CrudRepository;


public interface VehicleRepository extends CrudRepository<Vehicles, String> {
}
