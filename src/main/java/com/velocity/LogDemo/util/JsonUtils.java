package com.velocity.LogDemo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.velocity.LogDemo.model.Person;

public class JsonUtils {
	
	public static final Logger LOG =LoggerFactory.getLogger(JsonUtils.class);

    public static void main(String[] args) {
		
				
    	 ObjectMapper mapper = new ObjectMapper();
         try {
        	  String sample = "{\"name\":\"Mohan\",\"profession\":\"Backend Developer-java\",\"age\":\"24\",\"mobileNumber\":\"8669774968\"}"; 

    	        Person person=mapper.readValue(sample,Person.class);
    	        LOG.info("Person as JSON : {} ",person);
    	} catch (JsonProcessingException e) {
    		e.printStackTrace();
    	}
       }
}


