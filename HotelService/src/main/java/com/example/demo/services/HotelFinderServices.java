package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;

import com.example.demo.model.Hotel;

@Service
@EnableDiscoveryClient
public class HotelFinderServices {

	@Autowired
	private Hotel hotel;
	
	public Hotel findHotelByLocation(String location)
	{
		hotel.setHotelName("Hilton");
		hotel.setId(2020);
		
		if(location.equalsIgnoreCase("vellore"))
		{
			hotel.setId(3030);
			hotel.setHotelName("Millinium Plaza");
		}
		return hotel;
	}
}
