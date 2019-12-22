package com.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.*;
import com.dao.*;

@Service
public class CategoryServImpl implements CategoryServ {
	
	@Autowired
	CategoryDao category_dao;
	
	
	
	public boolean addCategory(CategoryBean category){
	    int id=0;
	
	    id=category_dao.addCategory(category);
	    if(id>0){
	    	return true;
	    }
	    return false;
   }
	
	
	
	public List<CategoryBean> getCategoryies()
	 {
		return category_dao.getCategoryies();
     }
	
}
