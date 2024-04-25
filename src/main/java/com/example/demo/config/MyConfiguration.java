package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class MyConfiguration {
	
	
	
	//CREATING A TOPIC PROGRAMATICALLY
	public NewTopic createTopic() {
		return TopicBuilder.name(AppConstants.TOPICNAME)
				.build();
	}
	public NewTopic createasliTopic() {
		return TopicBuilder.name("asli").partitions(3).replicas(1).build();
	}

	
	public NewTopic createTopicInDetail() {
		//topic name:"javatechie-demo"
		//Partitions 3
		//replications 1
		return new NewTopic("javatechie-demo",5,(short)2);
	}
	
	public NewTopic TopicInDetail() {
		//topic name:"javatechie-demo"
		//Partitions 3
		//replications 1
		return new NewTopic("demo",5,(short)2);
	}

}
