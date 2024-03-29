package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PipelineController {
	
	@GetMapping("/home")
	public ResponseEntity<String> getHome(){
		return new ResponseEntity<String>("Welcome",HttpStatus.OK);
	}
	
	@GetMapping("/view")
	public ResponseEntity<String> getView(){
		return new ResponseEntity<String>("AWS Deployment",HttpStatus.OK);
	}
	
	@GetMapping("/events")
	public ResponseEntity<String> getEvents(){
		return new ResponseEntity<String>("Get all the events",HttpStatus.OK);
	}

}
