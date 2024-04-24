package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.MyService;

@Controller
public class MyController {
	
	
	@Autowired
	public MyService service;
	
	
	@PostMapping("/send/{message}")
	public ResponseEntity<String> sendMessages(@PathVariable("message") String message){
		System.out.println(message);
		this.service.sendMessages(message);
		return new ResponseEntity<String>("Sent Succesfully", HttpStatus.ACCEPTED);
	}

}
