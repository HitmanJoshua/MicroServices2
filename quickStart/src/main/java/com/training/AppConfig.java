package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

	@Bean
	@Lazy
	public Doctor doctor()
	{
		Doctor ramesh=new Doctor();
		ramesh.setDoctorId(1020);
		ramesh.setDoctorName("Ramesh");
		ramesh.setPhoneNumber(9940998);
		ramesh.setAddress(address());
		
		
		return ramesh;
	}
	@Bean
	
	public Doctor surgeon()
	{
		Doctor suresh=new Doctor();
		suresh.setDoctorId(1020);
		suresh.setDoctorName("Ramesh");
		suresh.setPhoneNumber(9940998);
		
		
		
		return suresh;
	}
	
	@Bean
	public Address address()
	{
		
		return  new Address("Gandhi Street","Chennai",600117);
	}
	
}
