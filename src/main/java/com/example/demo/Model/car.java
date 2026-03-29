package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long carId;
	    private String carName;
	    private String brandName;
	    private String modelName;
	    private int manufacturingYear;
	    private double sellingPrice;
	    private int km;
        private String fuelType;
	    private String location;
	    private String description;
	    private String ownershipType;
	    private String contactNumber;
	    private String status;
	    
	    private Long sellerId;

		public Long getCarId() {
			return carId;
		}

		public void setCarId(Long carId) {
			this.carId = carId;
		}

		public String getCarName() {
			return carName;
		}

		public void setCarName(String carName) {
			this.carName = carName;
		}

		public String getBrandName() {
			return brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}

		public String getModelName() {
			return modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public int getManufacturingYear() {
			return manufacturingYear;
		}

		public void setManufacturingYear(int manufacturingYear) {
			this.manufacturingYear = manufacturingYear;
		}

		public double getSellingPrice() {
			return sellingPrice;
		}

		public void setSellingPrice(double sellingPrice) {
			this.sellingPrice = sellingPrice;
		}

		public int getKm() {
			return km;
		}

		public void setKm(int km) {
			this.km = km;
		}

		public String getFuelType() {
			return fuelType;
		}

		public void setFuelType(String fuelType) {
			this.fuelType = fuelType;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOwnershipType() {
			return ownershipType;
		}

		public void setOwnershipType(String ownershipType) {
			this.ownershipType = ownershipType;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getSellerId() {
			return sellerId;
		}

		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}

		@Override
		public String toString() {
			return "car [carId=" + carId + ", carName=" + carName + ", brandName=" + brandName + ", modelName="
					+ modelName + ", manufacturingYear=" + manufacturingYear + ", sellingPrice=" + sellingPrice
					+ ", km=" + km + ", fuelType=" + fuelType + ", location=" + location + ", description="
					+ description + ", ownershipType=" + ownershipType + ", contactNumber=" + contactNumber
					+ ", status=" + status + ", sellerId=" + sellerId + "]";
		}
		
	    
	    
	    
	    
}    