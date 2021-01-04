package com.lti.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_claim")
public class Claim {
	@Id
	int claimId;
	double amount;
	LocalDate date;
	String response;
	
	@OneToOne(mappedBy="claim",cascade=CascadeType.ALL)
	Policy policy;
}
