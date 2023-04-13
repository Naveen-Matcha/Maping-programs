package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Country;
import com.example.demo.Repository.CountryRepository;
import com.example.demo.Service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	CountryRepository countryRepository;

	@Override
	public Country createCountry(Country countryde) {
		// TODO Auto-generated method stub
		return countryRepository.save(countryde);
	}

	@Override
	public List<Country> getCountry() {
		// TODO Auto-generated method stub
		return countryRepository.findAll();
	}

	/*
	 * @Override public Country updateCountry(int id, Country countryde) { // TODO
	 * Auto-generated method stub Country str = countryrepository.getById(id);
	 * countryde.setCid(countryde.getCid()); countryde.setName(countryde.getName());
	 * return countryrepository.save(countryde); }
	 */

	/*
	 * @Override public void deleteCountryById(int id) { // TODO Auto-generated
	 * method stub countryrepository.deleteById(id); }
	 */
	
	




}
