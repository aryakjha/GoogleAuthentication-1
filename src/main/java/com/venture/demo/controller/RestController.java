package com.venture.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1/demo")
public class RestController {
	
	@GetMapping
	public ResponseEntity<String> welcome(){
		return ResponseEntity.ok("Hello from Arya !!");
	}

}
