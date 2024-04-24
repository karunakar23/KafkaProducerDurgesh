package com.example.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class MyConfiguration {
	
	
	
	
	public NewTopic createTopic() {
		return TopicBuilder.name(AppConstants.TOPICNAME)
				.build();
	}

}
