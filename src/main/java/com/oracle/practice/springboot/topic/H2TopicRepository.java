package com.oracle.practice.springboot.topic;

import org.springframework.data.repository.CrudRepository;

public interface H2TopicRepository extends CrudRepository<Topic, String> {

}
