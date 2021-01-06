package com.lti.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lti.service.PolicyService;
import com.lti.service.UserService;

@RestController
public class JointResource {

	@Autowired
	UserService userService;
	
	@Autowired
	PolicyService policyService;
	
	
}
