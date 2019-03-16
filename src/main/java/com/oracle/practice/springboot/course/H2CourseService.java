package com.oracle.practice.springboot.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.practice.springboot.topic.Topic;

@Service 
public class H2CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getCourses(String topicId){
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId)
						.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String topicId, String courseId) {
		return courseRepository.findByTopicId(topicId)
				               .stream()
				               .filter(c -> c.getId().equals(courseId))
				               .findFirst()
				               .get();				               
	}
	
	public void addCourse(Course course, String topicId) {
		// key relationship setter between Topic and Course model
		course.setTopic(new Topic(topicId, "", ""));
		courseRepository.save(course);
	}
	
}
