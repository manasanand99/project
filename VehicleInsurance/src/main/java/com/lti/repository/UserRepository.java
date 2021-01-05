package com.lti.repository;

import com.lti.model.Plan;
import com.lti.model.User;
import com.lti.model.Vehicle;

public interface UserRepository {
	public boolean addorUpdateUser(User user);
	
	public boolean addOrUpdateUserWithPolicy(User user,Plan plan, Vehicle vehicle);
	
	public boolean addPolicyToUser(Plan plan, Vehicle vehicle, int userId);
	
}
