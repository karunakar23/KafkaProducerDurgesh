package com.example.demo.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import com.example.demo.config.AppConstants;
import com.example.demo.dto.User;

@Service
public class MyService {
	@Autowired
	public KafkaTemplate<String,Object> kafkaTemplate;
	
//	public void sendMessages(String messages) {
//		this.kafkaTemplate.send(AppConstants.TOPICNAME, messages);
//	}
	
	
	//CREATING A TOPIC AUTOMATICALLY
	
//	public void sendMessageToTopic(String messages) {
//		CompletableFuture<SendResult<String, String>> future=this.kafkaTemplate.send("AutomaticTopic", messages);
//		future.whenComplete((data,error)->{
//			if(error==null) {
//				System.out.println("Sent Message=["+messages+
//						"] with offset=["+data.getRecordMetadata().offset()+"]");
//			}else {
//				System.out.println("Unable to send message=["+
//			messages+" ] due to : "+error.getMessage());
//				
//			}
//		});
//	}
//	public void sendLargeMessage(String messages) {
//		this.kafkaTemplate.send("user-demo",messages);
//	}
	
	public void sendObjects(User user) {
		this.kafkaTemplate.send("karuna",user);
	}

}
