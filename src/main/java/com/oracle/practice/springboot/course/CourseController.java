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
	
	@RequestMapping(method=RequestMethod.GET, path="/topics/{id}/courses")
	public List<Course> getAllCourses() {
		System.out.println(courseService.getClass().getName());
		return courseService.getCourses();
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/topics/{id}/courses/{courseId}")
	public Course getCourse(@PathVariable String id, @PathVariable String courseId) {
		return courseService.getCourse(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/topics/{id}/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
}
