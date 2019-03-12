package com.oracle.practice.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicServiceInterface{

	private static List<Topic> TOPICS = new ArrayList<Topic>(Arrays.asList(new Topic("java", "Java", "Java Description"),
			new Topic("javascript", "JavaScript", "JavaScript Description"),
			new Topic("spring", "Spring", "Spring Description")));
	
	@Override
	public List<Topic> getTopics(){
		return TOPICS;
	}
	
	@Override	
	public void addTopic(Topic t) {
		TOPICS.add(t);
	}

	@Override
	public Topic getTopic(String id) {
		return TOPICS.stream().filter(t -> t.getId().equals(id)).findFirst().get();		
	}

}
