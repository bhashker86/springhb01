package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CountryDao;
import com.model.CountryDO;

@Service
public class CountryServImpl implements CountryServ{

	@Autowired
	CountryDao country_dao;
	
	public List<CountryDO> getCountryList(){
	 List<CountryDO> country_list;
    return 	country_list=country_dao.getCountryList(); 
		
	}	
	
	
}
