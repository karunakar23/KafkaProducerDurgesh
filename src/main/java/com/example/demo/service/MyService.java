package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.config.AppConstants;

@Service
public class MyService {
	@Autowired
	public KafkaTemplate<String,String> kafkaTemplate;
	
	public void sendMessages(String messages) {
		this.kafkaTemplate.send(AppConstants.TOPICNAME, messages);
	}

}
