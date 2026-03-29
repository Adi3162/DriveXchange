package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.car;
import com.example.demo.Service.sellerService;


@RestController
@RequestMapping("/api/seller")  
public class SellerController {

    @Autowired
    private sellerService service;

    @PostMapping("/add-car")
    public car saveData(@RequestBody car c1) {
        return service.addCar(c1);
    }
    
    
    @GetMapping("/my-cars")
    public List<car> getMyCars() {
        return service.getAllCars();
    }
    
    
    @PutMapping("/update-car/{id}")
    public car updateCar(@PathVariable Long id, @RequestBody car c) {
        return service.updateCar(id, c);
    }
    
    
    @DeleteMapping("/delete-car/{id}")
    public String deleteCar(@PathVariable Long id) {
        return service.deleteCar(id);
    }
    
    
    @GetMapping("/car/{id}")
    public car getCar(@PathVariable Long id) {
        return service.getCarById(id);
    }
    
    @GetMapping("/search")
    public List<car> searchCar(@RequestParam String name) {
        return service.getCarByName(name);
    }
    
    @GetMapping("/search-by-brand")
    public List<car> searchByBrand(@RequestParam String brand) {
        return service.getCarByBrand(brand);
    }
    
    @GetMapping("/filter-by-price")
    public List<car> filterByPrice(@RequestParam double min, @RequestParam double max) {
        return service.getCarsByPrice(min, max);
    }
    
    @GetMapping("/filter-by-location")
    public List<car> filterByLocation(@RequestParam String location) {
        return service.getCarsByLocation(location);
    }
    
    @GetMapping("/approved-cars")
    public List<car> getApprovedCars() {
        return service.getApprovedCars();
    }
    
    @GetMapping("/my-cars/{sellerId}")
    public List<car> getMyCars(@PathVariable Long sellerId) {
        return service.getCarsBySeller(sellerId);
    }
}