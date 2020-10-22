package com.steffani.ford.projectInterview.service;

import com.steffani.ford.projectInterview.domain.Vehicles;
import com.steffani.ford.projectInterview.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleSerive {

    @Autowired
    private VehicleRepository vehicleRepository;

    public VehicleSerive(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Iterable<Vehicles> save(List<Vehicles> vehicles) {
        return vehicleRepository.saveAll(vehicles);

    }

    public Iterable<Vehicles> list(){
        return vehicleRepository.findAll();
    }

    public Optional<Vehicles> list(String modelName){
        return vehicleRepository.findById(modelName);
    }

    public Iterable<Vehicles> getVehiclePrices(String from, String to){
        return  vehicleRepository.findAll();
    }

    public Optional<Vehicles> getByFeatures(String exterior, String interior) {
        return vehicleRepository.findById(exterior);
    }
}
