package com.lti.repository;

import com.lti.model.Plan;
import com.lti.model.User;
import com.lti.model.Vehicle;

public interface UserRepository {

	public void addOrUpdateUser(User user);
	//this will generate new policy with plan and vehicle then assign that policy to user
	
	public void addPolicyToUser(Plan plan,Vehicle vehicle,int userId); 
	public void addOrUpdateUserWithPolicy(User user,Plan plan,Vehicle vehicle);

//	public void addTicketToPolicy(Ticket policyId);

	public void getUserPolicyInfo(User user);  //user getting the policy and vehicle details after login

	public void addAClaim(int policyId,User user,Vehicle vehicle);

	public void calculatePremium(String vehicleManufracturer,String vehicleModel,int policyYears);

}
