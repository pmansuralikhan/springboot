package com.oracle.practice.springboot.topic;

import java.util.List;

public interface TopicServiceInterface {
	public List<Topic> getTopics();
	
	public void addTopic(Topic t);
}
