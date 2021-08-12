package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="beneficiary_details")
public class Beneficiary 
{
	@Id
	private String beneficiaryaccno;
	private String accountNo;
	private String beneficiaryname;
	private String ifsccode;
	private String nickname;
	
	
	public Beneficiary() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Beneficiary(String beneficiaryaccno, String accountNo, String beneficiaryname, String ifsccode,
			String nickname) {
		super();
		this.beneficiaryaccno = beneficiaryaccno;
		this.accountNo = accountNo;
		this.beneficiaryname = beneficiaryname;
		this.ifsccode = ifsccode;
		this.nickname = nickname;
	}

	public String getBeneficiaryaccno() {
		return beneficiaryaccno;
	}
	public void setBeneficiaryaccno(String beneficiaryaccno) {
		this.beneficiaryaccno = beneficiaryaccno;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getBeneficiaryname() {
		return beneficiaryname;
	}
	public void setBeneficiaryname(String beneficiaryname) {
		this.beneficiaryname = beneficiaryname;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
