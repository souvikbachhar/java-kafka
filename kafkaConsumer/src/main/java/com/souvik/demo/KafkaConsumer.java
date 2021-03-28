package com.souvik.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics="kafka_example",groupId="group_id")
	public void consume(String message){
		System.out.println(message);
	}
}
