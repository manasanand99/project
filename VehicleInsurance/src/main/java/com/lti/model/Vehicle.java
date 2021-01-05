package com.lti.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_vehicle")
public class Vehicle {
	@Id
	int vehicleId;
	String vehicleType;
	String manufacturer;
	LocalDate purchaseDate; 
	String drivingLicense;
	String registrationNumber;
	String engineNumber;
	String chasisNumber;
	
	@OneToOne(mappedBy="vehicle",cascade=CascadeType.ALL)
	Policy policy;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
	
}
