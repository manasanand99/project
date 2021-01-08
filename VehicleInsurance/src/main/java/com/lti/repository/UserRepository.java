package com.lti.repository;

import com.lti.model.Plan;
import com.lti.model.User;
import com.lti.model.Vehicle;

public interface UserRepository {
	public User addorUpdateUser(User user);
	
	public User addOrUpdateUserWithPolicy(User user,Plan plan, Vehicle vehicle);
	
	public User addPolicyToUser(Plan plan, Vehicle vehicle, int userId);

	public boolean validateUserlogin(String emailId, String password);
	
}
