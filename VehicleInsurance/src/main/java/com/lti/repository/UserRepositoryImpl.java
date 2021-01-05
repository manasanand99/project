package com.lti.repository;

import com.lti.model.Plan;
import com.lti.model.User;
import com.lti.model.Vehicle;

public class UserRepositoryImpl implements UserRepository {

	@Override
	public boolean addorUpdateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addOrUpdateUserWithPolicy(User user, Plan plan, Vehicle vehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addPolicyToUser(Plan plan, Vehicle vehicle, int userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
