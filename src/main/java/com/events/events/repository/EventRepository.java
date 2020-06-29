package com.events.events.repository;

import org.springframework.data.repository.CrudRepository;

import com.events.events.models.Events;

public interface EventRepository extends CrudRepository<Events, String>{

	
}
