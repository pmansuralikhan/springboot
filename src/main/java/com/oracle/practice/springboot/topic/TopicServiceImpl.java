package com.oracle.practice.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service @Primary
public class TopicServiceImpl implements TopicServiceInterface{

	private static List<Topic> TOPICS = new ArrayList<Topic>(Arrays.asList(new Topic("java", "Java", "Java Description"),
			new Topic("javascript", "JavaScript", "JavaScript Description"),
			new Topic("spring", "Spring", "Spring Description")));
	
	public List<Topic> getTopics(){
		return TOPICS;
	}
	
	public void addTopic(Topic t) {
		TOPICS.add(t);
	}

}