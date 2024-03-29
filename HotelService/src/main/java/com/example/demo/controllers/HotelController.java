package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hotel;
import com.example.demo.services.HotelFinderServices;


import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class HotelController {
	@Value("${eureka.instance.instance-id}")
	private String instanceId;
	
	@Autowired
	HotelFinderServices service;
	
	
	@Autowired
	Environment env;

	@GetMapping("/find/{location}")
	public Hotel findHotelByLocation(@PathVariable("location") String location)
	{
		log.info(env.getProperty("local.server.port"));
		Hotel hotel = service.findHotelByLocation(location);
		hotel.setMsg(env.getProperty("local.server.port")+instanceId);
		return hotel;
	}
}
