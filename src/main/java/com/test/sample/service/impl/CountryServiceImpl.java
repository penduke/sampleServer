package com.test.sample.service.impl;

import com.test.sample.model.Country;
import com.test.sample.repository.CountryRepository;
import com.test.sample.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries() {
		System.out.println("CountryServiceImpl --> getAllCountries");
		List<Country> countries=new ArrayList<Country>();
		Iterable<Country> countriesIterable=countryRepository.findAll();
		Iterator<Country> countriesIterator=countriesIterable.iterator();
		while(countriesIterator.hasNext())
		{
			countries.add(countriesIterator.next());
		}
		return countries;
	}

	@Transactional
	public Country getCountry(int id) {
		return countryRepository.findOne(id);
	}

	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}

	@Transactional
	public void updateCountry(Country country) {
		countryRepository.save(country);

	}

	@Transactional
	public void deleteCountry(int id) {
		countryRepository.delete(id);
	}
}
