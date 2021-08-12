package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Beneficiary;

public interface BeneficiaryService 
{
	public List<Beneficiary> getBeneficiaries();
	public boolean addBeneficiary(Beneficiary beneficiary);
	public boolean updateBeneficiary(Beneficiary beneficiary);
	public boolean deleteBeneficiary(String beneficiaryaccno);
	
	public Beneficiary findBeneficiary(String beneficiaryaccno);
}
