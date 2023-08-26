package com.velocity.LogDemo.model;

import java.util.List;
import java.util.Map;

public class Person {
	String name;
	String profession;
	Integer age;
	Long MobileNumber;
	List<String>kyc;
	Map<String,String>kycdetails;
	Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long MobileNumber) {
		this.MobileNumber=MobileNumber;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", profession=" + profession + ", age=" + age + ", MobileNumber=" + MobileNumber
				+ ", kyc=" + kyc + ", kycdetails=" + kycdetails + ", address=" + address + "]";
	}
	public List<String> getKyc() {
		return kyc;
	}
	public void setKyc(List<String> kyc) {
		this.kyc = kyc;
	}
	public Map<String, String> getKycdetails() {
		return kycdetails;
	}
	public void setKycdetails(Map<String, String> kycdetails) {
		this.kycdetails = kycdetails;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
		
}
	


