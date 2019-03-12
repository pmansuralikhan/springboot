package com.oracle.practice.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class DummyTopicServiceImpl implements TopicServiceInterface {
	private static List<Topic> TOPICS = new ArrayList<Topic>(Arrays.asList(new Topic("java", "DUMMYJava", "Java Description"),
			new Topic("javascript", "DUMMYJavaScript", "JavaScript Description"),
			new Topic("spring", "DUMMYSpring", "Spring Description")));
	
	public List<Topic> getTopics(){
		return TOPICS;
	}
	
	public void addTopic(Topic t) {
		TOPICS.add(t);
	}
}
