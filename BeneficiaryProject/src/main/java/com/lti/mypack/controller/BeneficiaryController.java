package com.lti.mypack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.mypack.model.Beneficiary;
import com.lti.mypack.service.BeneficiaryService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/beneficiaryRest/api")
public class BeneficiaryController 
{

	@Autowired
	BeneficiaryService beneService;
	
	@GetMapping("/beneficiaries")
	public List<Beneficiary> getAll()
	{
		return beneService.getBeneficiaries();
	}
	
	@GetMapping("/beneficiaries/{beneficiaryaccno}")
	public Beneficiary getBeneficiaryById(@PathVariable(value= "beneficiaryaccno") String beneficiaryaccno)
	{
		return beneService.findBeneficiary(beneficiaryaccno);
	}
	
	@PutMapping("/beneficiaries")
	public boolean updateBeneficiary(@RequestBody Beneficiary beneficiary)
	{
		System.out.println(beneficiary.getAccountNo());
		return beneService.updateBeneficiary(beneficiary);
	}
	
	@DeleteMapping("/beneficiaries/{beneficiaryaccno}")
	public boolean deleteBeneficiary(@PathVariable(value= "beneficiaryaccno") String beneficiaryaccno)
	{
		return beneService.deleteBeneficiary(beneficiaryaccno);
	}
	
	@PostMapping("/beneficiaries")
	public boolean addBeneficiary(@RequestBody Beneficiary beneficiary)
	{
		return beneService.addBeneficiary(beneficiary);
	}
}
