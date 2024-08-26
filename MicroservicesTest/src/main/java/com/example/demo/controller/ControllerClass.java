package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.City;
import com.example.demo.service.CityRepImpl;

@RestController
public class ControllerClass {

	@Autowired
	CityRepImpl cityservice;
	@GetMapping("/getData")
	public List<City> getData()
	{
		return cityservice.getCityDetails();
		
	}
}
