package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.car;
import com.example.demo.SellerRepo.sellerRepo;

@Service
public class sellerService {

	@Autowired
	private sellerRepo repo;
	
	public car addCar(car c) {
//validation for car name to not take car as a null
	    if (c.getCarName() == null || c.getCarName().isEmpty()) {
	        throw new RuntimeException("Car name is required");
	    }
//price sathi validation price he empty aani 0 nahi pahije
	    if (c.getSellingPrice() <= 0) {
	        throw new RuntimeException("Price must be greater than 0");
	    }

	    c.setStatus("PENDING");

	    return repo.save(c);
	}	
	
	public List<car> getAllCars() {
	    return repo.findAll();
	}
	
	
	
	public car updateCar(Long id, car updatedCar) {

	    car existingCar = repo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Car not found"));
       //validation for all fields 
	    if (updatedCar.getCarName() != null)
	        existingCar.setCarName(updatedCar.getCarName());

	    if (updatedCar.getBrandName() != null)
	        existingCar.setBrandName(updatedCar.getBrandName());

	    if (updatedCar.getModelName() != null)
	        existingCar.setModelName(updatedCar.getModelName());

	    if (updatedCar.getFuelType() != null)
	        existingCar.setFuelType(updatedCar.getFuelType());

	    if (updatedCar.getLocation() != null)
	        existingCar.setLocation(updatedCar.getLocation());

	    if (updatedCar.getDescription() != null)
	        existingCar.setDescription(updatedCar.getDescription());

	    if (updatedCar.getOwnershipType() != null)
	        existingCar.setOwnershipType(updatedCar.getOwnershipType());

	    if (updatedCar.getContactNumber() != null)
	        existingCar.setContactNumber(updatedCar.getContactNumber());

	    if (updatedCar.getKm() != 0)
	        existingCar.setKm(updatedCar.getKm());

	    if (updatedCar.getSellingPrice() != 0)
	        existingCar.setSellingPrice(updatedCar.getSellingPrice());

	    if (updatedCar.getManufacturingYear() != 0)
	        existingCar.setManufacturingYear(updatedCar.getManufacturingYear());

	    return repo.save(existingCar);
	}
	
	
	
	public String deleteCar(Long id) {

	    if (!repo.existsById(id)) {
	        throw new RuntimeException("Car not found");
	    }

	    repo.deleteById(id);

	    return "Car deleted successfully";
	}
	
	
	public car getCarById(Long id) {
	    return repo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Car not found"));
	}
	
	public List<car> getCarByName(String name) {
	    return repo.findByCarName(name);
	}
	
	
	public List<car> getCarByBrand(String brand) {
	    return repo.findByBrandName(brand);
	}
	
	
	public List<car> getCarsByPrice(double min, double max) {
	    return repo.findBySellingPriceBetween(min, max);
	}
	
	public List<car> getCarsByLocation(String location) {
	    return repo.findByLocation(location);
	}
	
	public List<car> getApprovedCars() {
	    return repo.findByStatus("APPROVED");
	}
	
	public List<car> getCarsBySeller(Long sellerId) {
	    return repo.findBySellerId(sellerId);
	}
}
