package com.dao;

import com.model.CategoryBean;
import java.util.*;


public interface CategoryDao {
public int addCategory(CategoryBean category);
public List<CategoryBean> getCategoryies();

}
