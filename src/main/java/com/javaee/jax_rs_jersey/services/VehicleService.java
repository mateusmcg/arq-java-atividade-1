package com.javaee.jax_rs_jersey.services;

import java.util.List;

import com.javaee.jax_rs_jersey.domain.Vehicle;

public interface VehicleService {

	List<Vehicle> getAll();

	Vehicle findById(Integer id);

	Vehicle saveVehicle(Vehicle vehicle);

	void deleteById(Integer id);
}