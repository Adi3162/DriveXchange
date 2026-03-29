package com.example.demo.SellerRepo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Controllers.SellerController;
import com.example.demo.Model.car;

public interface sellerRepo extends JpaRepository<car, Long> {

     List<car> findAll();
     Optional<car> findById(Long id);
     List<car> findByBrandName(String brandName);   
     List<car> findBySellingPriceBetween(double min, double max);
     List<car> findByLocation(String location);
     List<car> findByCarName(String carName);
     List<car> findByStatus(String status);
     List<car> findBySellerId(Long sellerId);


}
