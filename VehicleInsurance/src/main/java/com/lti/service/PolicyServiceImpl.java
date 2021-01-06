package com.lti.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Claim;
import com.lti.model.Policy;
import com.lti.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService{

	@Autowired
	PolicyRepository policyRepository;
	
	public Claim addClaimToPolicy(Claim claim, int policyId) {
		return policyRepository.addClaimToPolicy(claim, policyId);
	}

	public List<Policy> getUserPolicyInfo(int userId) {
		
		return policyRepository.getUserPolicyInfo(userId);
	}

	public List<Claim> getClaimsByPolicy(int policyId) {
		return policyRepository.getClaimsByPolicy(policyId);
	}

}
