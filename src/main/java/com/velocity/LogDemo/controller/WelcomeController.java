package com.velocity.LogDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/welcome")
public class WelcomeController {
	

	private static final Logger LOG = LoggerFactory.getLogger(WelcomeController.class);
	

	@GetMapping("/{name}")
	public ResponseEntity<String> getWelcome(@PathVariable String name){
	
		LOG.trace("Start:WelcomeController---->getWelcome------>:"+name);
		LOG.debug("Start:WelcomeController---->getWelcome------>:"+name);
		LOG.info("Start:WelcomeController---->getWelcome------>:"+name);
		LOG.warn("Start:WelcomeController---->getWelcome------>:"+name);
		LOG.error("Start:WelcomeController---->getWelcome------>:"+name);
		String output ="welcome"+ name;
		LOG.trace("End:WelcomeController---->getWelcome------>:"+name);
		LOG.debug("End:WelcomeController---->getWelcome------>:"+name);
		LOG.info("End:WelcomeController---->getWelcome------>:"+name);
		LOG.warn("End:WelcomeController---->getWelcome------>:"+name);
		LOG.error("End:WelcomeController---->getWelcome------>:"+name);
		
		
	
		return new ResponseEntity<String>(output,HttpStatus.OK);
	}
}
