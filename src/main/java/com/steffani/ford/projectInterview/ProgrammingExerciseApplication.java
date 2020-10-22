package com.steffani.ford.projectInterview;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.steffani.ford.projectInterview.domain.Vehicles;
import com.steffani.ford.projectInterview.service.VehicleSerive;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ProgrammingExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgrammingExerciseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(VehicleSerive vehicleSerive){
		return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Vehicles>> typeReference = new TypeReference<List<Vehicles>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/vehicles.json");
			try {
				List<Vehicles> vehicles = mapper.readValue(inputStream,typeReference);
				vehicleSerive.save(vehicles);
				System.out.println("Vehicles Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}

}
