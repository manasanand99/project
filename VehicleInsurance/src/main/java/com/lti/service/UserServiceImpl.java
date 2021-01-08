package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Plan;
import com.lti.model.User;
import com.lti.model.Vehicle;
import com.lti.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	public User addorUpdateUser(User user) {
		return userRepository.addorUpdateUser(user);
	}

	public User addOrUpdateUserWithPolicy(User user, Plan plan, Vehicle vehicle) {
		return userRepository.addOrUpdateUserWithPolicy(user, plan, vehicle);
	}

	public User addPolicyToUser(Plan plan, Vehicle vehicle, int userId) {
		return userRepository.addPolicyToUser(plan, vehicle, userId);
	}

	@Override
	public boolean validateUserLogin(String emailId, String password) {
		return userRepository.validateUserlogin(emailId, password);
	}

}
