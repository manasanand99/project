package com.lti.resource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.ClaimsDto;
import com.lti.dto.PolicyDto;
import com.lti.dto.UserDto;
import com.lti.model.Claim;
import com.lti.model.Plan;
import com.lti.model.Policy;
import com.lti.model.User;
import com.lti.model.Vehicle;
import com.lti.service.PolicyService;
import com.lti.service.UserService;

@RestController
public class InsuranceResource {
	
	@Autowired
	PolicyService policyService;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/Users")
	public User addUser(@RequestBody UserDto userDto) {
		User user = new User();
		user.setAddress(userDto.getAddress());
		user.setEmail(userDto.getEmail());
		user.setMobileNumber(userDto.getMobileNumber());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setPolicies(null);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		user.setDateOfBirth(LocalDate.parse(userDto.getDateOfBirth(),formatter));
		return userService.addorUpdateUser(user);
	}
	
	@PostMapping("/ClaimsByPolicy/{policyId}")
	public Claim addClaimToPolicy(@RequestBody ClaimsDto claimsDto,@PathVariable("policyId") int policyId) {
		Claim claim = new Claim();
		claim.setAmount(0);
		claim.setReason("Unchecked");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		claim.setClaimDate(LocalDate.parse(claimsDto.getDate(),formatter));
	
		return policyService.addClaimToPolicy(claim, policyId);
	}
	
	@GetMapping("/ClaimsByPolicy/{policyId}")
	public List<Claim> getClaimsByPolicyId(@PathVariable("policyId") int policyId) {
		return policyService.getClaimsByPolicy(policyId);
	}
	
	@PostMapping("/PolicyByUser/{userid}")
	public User addPolicyByUserId(@RequestBody PolicyDto policyDto, @PathVariable("userid") int userId) {
		Plan plan = new Plan();
		plan.setAmount(policyDto.getAmount());
		plan.setPlanType(policyDto.getPlanType());
		plan.setYear(policyDto.getYear());
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleType(policyDto.getVehicleType());
		vehicle.setManufacturer(policyDto.getManufacturer());
		vehicle.setDrivingLicense(policyDto.getDrivingLicense());
		vehicle.setRegistrationNumber(policyDto.getRegistrationNumber());
		vehicle.setEngineNumber(policyDto.getEngineNumber());
		vehicle.setChasisNumber(policyDto.getChasisNumber());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		vehicle.setPurchaseDate(LocalDate.parse(policyDto.getPurchaseDate(),formatter));
		
		return userService.addPolicyToUser(plan, vehicle, userId);
	}
	
	@GetMapping("/PolicyByUser/{userid}")
	public List<Policy> getPolicyByUserId(@PathVariable("userid") int userId) {
		return policyService.getUserPolicyInfo(userId);
	}
	
	
}
