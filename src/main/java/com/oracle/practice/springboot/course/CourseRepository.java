package com.oracle.practice.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	List<Course> findByTopicId(String topicId);
}
