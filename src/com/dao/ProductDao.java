package com.dao;

import java.util.List;
import java.util.Map;

import com.model.CategoryVO;
import com.model.ProductBean;

public interface ProductDao {

public int addProduct(ProductBean product);	
public List<ProductBean> getProducts();
public List getProductByCategory();
public Long totalProductByCategory(CategoryVO category);
public List<ProductBean> getProductsByCate(int cat_id);

}
