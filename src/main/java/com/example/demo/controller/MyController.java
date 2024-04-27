package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.User;
import com.example.demo.service.MyService;

@Controller
public class MyController {
	
	
	@Autowired
	public MyService service;
//
//	
//	@PostMapping("/send/{message}")
//	public ResponseEntity<String> sendMessages(@PathVariable("message") String message){
//		System.out.println(message);
//		this.service.sendMessages(message);
//		return new ResponseEntity<String>("Sent Succesfully", HttpStatus.ACCEPTED);
//	}
//	
//	@PostMapping("/sendCreateTopicAutomatically/{message}")
//	public ResponseEntity<String> sendCreateTopicAutomatically(@PathVariable("message") String message){
//		System.out.println(message);
//		//this.service.sendMessageToTopic(message);
//		return new ResponseEntity<String>("Sent Succesfully", HttpStatus.ACCEPTED);
//	}
//	@GetMapping("/largeMessages")
//	public ResponseEntity<String> largeMessages(){
//		
//		for(int i=0;i<70000;i++) {
//			this.service.sendLargeMessage("Karunakar");
//		}
//		return new ResponseEntity<String>("Sent Succesfully", HttpStatus.ACCEPTED);
//	}
//	
	@PostMapping("/sendAnObject")
	public ResponseEntity<String> sendObject(@RequestBody User user){
		this.service.sendObjects(user);
		return new ResponseEntity<String>("Sent Succesfully", HttpStatus.OK);
		
	}

}
