package com.steffani.ford.projectInterview.controller;

import com.steffani.ford.projectInterview.domain.Vehicles;
import com.steffani.ford.projectInterview.service.VehicleSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("")
public class VehiclesController {

    @Autowired
    private VehicleSerive vehicleSerive;

    public VehiclesController(VehicleSerive vehicleSerive) {
        this.vehicleSerive = vehicleSerive;
    }



    @GetMapping("/getVehicleInformation")
    public Iterable<Vehicles> getVehicleInformation(){
        return vehicleSerive.list();
    }

    @GetMapping("/getVehicleModelName/{modelName}")
    public Optional<Vehicles> getVehicleModelName(@PathVariable String modelName){
        return vehicleSerive.list(modelName);
    }

    @GetMapping("/getVehiclePrice/{From}/{TO}")
    public Iterable<Vehicles> getVehiclePrice(@PathVariable String From, @PathVariable String TO){
        return vehicleSerive.getVehiclePrices(From,TO);
    }

    @GetMapping("/getVehicleByFeatures/{exterior}/{interior}")
    public Optional<Vehicles> getVehicleByFeatures(@PathVariable String exterior, String interior){
        return vehicleSerive.getByFeatures(exterior,interior);
    }
}
