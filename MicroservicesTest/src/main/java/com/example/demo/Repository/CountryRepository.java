package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.City;

public interface CountryRepository extends JpaRepository<City, Integer> {

}
