package com.oracle.practice.springboot.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	H2CourseService courseService;
	
	@RequestMapping(method=RequestMethod.GET, path="/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		System.out.println(courseService.getClass().getName());
		return courseService.getCourses(topicId);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/topics/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable String topicId, @PathVariable String courseId) {
		return courseService.getCourse(topicId, courseId);
	}

	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		courseService.addCourse(course, topicId);
	}
	
}
