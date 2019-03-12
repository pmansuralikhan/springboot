package com.oracle.practice.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicServiceInterface topicService;
	
	@RequestMapping(method=RequestMethod.GET, path="/topics")
	public List<Topic> getAllTopics() {
		System.out.println(topicService.getClass().getName());
		return topicService.getTopics();
	}

	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
}
