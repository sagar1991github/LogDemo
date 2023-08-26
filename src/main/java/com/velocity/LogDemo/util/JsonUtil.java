package com.velocity.LogDemo.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.velocity.LogDemo.model.Address;
import com.velocity.LogDemo.model.Person;

public class JsonUtil {

  public static final Logger LOG =LoggerFactory.getLogger(JsonUtil.class);
	
	public static void main(String[] args) {
    
	    Person person = new Person();
	    person.setName("sagar");
	    person.setProfession("Backend Developer");
	    person.setAge(26);
	    person.setMobileNumber(852369154);
	    
	    Address address =new Address();
	    address.setCity("pune");
	    address.setHouseNo(123);
	    address.setStreet("karvengar");
	    person.setAddress(address);
	    List<String>kycList = new ArrayList<>();
	    kycList.add("Aadhar");
	    kycList.add("pan");
	    person.setKyc(kycList);
	   Map<String,String>detailsMap= new HashMap<>();  
	   detailsMap.put("Aadhar","523456877");
	   detailsMap.put("pan", " HGUJJ3445");
	   person.setKycdetails(detailsMap);
     LOG.info("Person is a java object :  {}",person );
     
     ObjectMapper mapper = new ObjectMapper();
     try {
	        String json =mapper.writeValueAsString(person);
	        LOG.info("Person as JSON : {} ", json);
	} catch (JsonProcessingException e) {
		e.printStackTrace();
	}
   }

}
