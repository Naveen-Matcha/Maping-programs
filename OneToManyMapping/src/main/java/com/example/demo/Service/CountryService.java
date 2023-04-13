package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Country;

@Service
public interface CountryService {

	Country createCountry(Country countryde);

	List<Country> getCountry();

	//Country updateCountry(int id, Country countryde);

	//void deleteCountryById(int id);

}
