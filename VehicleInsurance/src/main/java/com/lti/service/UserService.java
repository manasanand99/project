package com.lti.service;

import com.lti.model.Plan;
import com.lti.model.User;
import com.lti.model.Vehicle;

public interface UserService {

public User addorUpdateUser(User user);
	
	public User addOrUpdateUserWithPolicy(User user,Plan plan, Vehicle vehicle);
	
	public User addPolicyToUser(Plan plan, Vehicle vehicle, int userId);
	
	public boolean validateUserLogin(String emailId, String password);
	
}
