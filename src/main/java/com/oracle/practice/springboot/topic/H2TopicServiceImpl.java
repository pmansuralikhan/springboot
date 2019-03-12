package com.oracle.practice.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service @Primary
public class H2TopicServiceImpl implements TopicServiceInterface {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getTopics(){
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
}
