package com.lti.mypack.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.mypack.model.Beneficiary;
import com.lti.mypack.repository.BeneficiaryRepository;

@Service
@Transactional
public class BeneficiaryServiceImpl implements BeneficiaryService
{

	@Autowired
	BeneficiaryRepository beneRepo;
	
	
	@Override
	public List<Beneficiary> getBeneficiaries() {
		return beneRepo.findAll();
	}
	
	@Override
	public boolean addBeneficiary(Beneficiary beneficiary) {
		beneRepo.save(beneficiary);
		return true;
	}

	@Override
	public boolean updateBeneficiary(Beneficiary beneficiary) {
		//Beneficiary newp = beneRepo.findById(beneficiary.getBeneficiaryaccno()).get();
		//newp = beneficiary;
		beneRepo.save(beneficiary);
		return true;
	}

//	@Override
//	public boolean deleteBeneficiary(Beneficiary beneficiary) {
//		beneRepo.delete(beneficiary);
//		return true;
//	}

	@Override
	public Beneficiary findBeneficiary(String beneficiaryaccno) {
		return beneRepo.findById(beneficiaryaccno).get();
	}

	@Override
	public boolean deleteBeneficiary(String beneficiaryaccno) {
		beneRepo.deleteById(beneficiaryaccno);
		return true;
	}

	

}
