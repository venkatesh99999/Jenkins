package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CountryRepository;
import com.example.demo.entity.City;

@Service
public class CityRepImpl {

	@Autowired
	CountryRepository countryRepository;
	
	public List<City> getCityDetails()
	{
		return countryRepository.findAll();
	}
}
