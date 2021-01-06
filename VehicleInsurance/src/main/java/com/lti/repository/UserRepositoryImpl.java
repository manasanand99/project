package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Plan;
import com.lti.model.Policy;
import com.lti.model.User;
import com.lti.model.Vehicle;

@Repository
public class UserRepositoryImpl implements UserRepository {
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public User addorUpdateUser(User user) {
		return em.merge(user);
	}

	@Transactional
	public User addOrUpdateUserWithPolicy(User user, Plan plan, Vehicle vehicle) {
		Policy policy = new Policy();
		policy.setPlan(plan);
		policy.setVehicle(vehicle);
		policy.setUser(user);
		
		List<Policy> policies = new ArrayList<>();
		policies.add(policy);
		user.setPolicies(policies);
		return em.merge(user);
	}

	@Transactional
	public User addPolicyToUser(Plan plan, Vehicle vehicle, int userId) {
		User user = findUserById(userId);
		if (user==null) return null;
		
		Policy policy = new Policy();
		policy.setPlan(plan);
		policy.setVehicle(vehicle);
		List<Policy> policies = user.getPolicies();
		policies.add(policy);
		
		user.setPolicies(policies);
		return em.merge(user);
	}
	
	public User findUserById(int userId) {
		return em.find(User.class, userId);
	}

}
