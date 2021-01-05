package com.lti.repository;

import java.util.List;

import com.lti.model.Claim;
import com.lti.model.Policy;
import com.lti.model.User;

public interface PolicyRepository {
	
	public boolean addClaimToPolicy(Claim claim, int policyId);
	
	public Policy getUserPolicyInfo(User user);  //user getting the policy and vehicle details after login
	
	public List<Claim> getClaimsByPolicy(int policyId);
}
