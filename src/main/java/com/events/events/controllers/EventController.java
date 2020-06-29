package com.events.events.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.events.events.models.Events;
import com.events.events.repository.EventRepository;

@Controller
public class EventController {
	
	@Autowired
	private EventRepository er;
	
	@RequestMapping(value = "/registerEvent", method = RequestMethod.GET)
	public String form() {
		return "event/formEvent";
	}
	
	@RequestMapping(value = "/registerEvent", method = RequestMethod.POST)
	public String form(Events event) {
		
		er.save(event);
		
		return "redirect:/registerEvent";
	}
}
