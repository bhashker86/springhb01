package com.services;

import java.util.*;

import com.model.CategoryBean;

public interface CategoryServ {

 public boolean addCategory(CategoryBean category);
 public List<CategoryBean> getCategoryies();
	
}
