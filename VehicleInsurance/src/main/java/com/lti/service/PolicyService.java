package com.lti.service;

import java.util.List;

import com.lti.model.Claim;
import com.lti.model.Policy;

public interface PolicyService {

    public Claim addClaimToPolicy(Claim claim, int policyId);
	
	public List<Policy> getUserPolicyInfo(int userId);  //user getting the policy and vehicle details after login
	
	public List<Claim> getClaimsByPolicy(int policyId);
}
