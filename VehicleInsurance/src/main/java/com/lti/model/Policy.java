package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_plan")
public class Policy {
	@Id
	int policyId;
	
	@OneToOne
	@JoinColumn(name="planId")
	Plan plan;
	
	@OneToOne
	@JoinColumn(name="vehicleId")
	Vehicle vehicle;
	
	@OneToMany
	@JoinColumn(name="claimId")
	Claim claim;
	
	@ManyToOne
	@JoinColumn(name="userId")
	User user;

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Claim getClaim() {
		return claim;
	}

	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
