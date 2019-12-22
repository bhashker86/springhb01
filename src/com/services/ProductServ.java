package com.services;

import java.util.List;

import com.model.*;

public interface ProductServ {
	public boolean addProduct(ProductBean product);	
	public List<ProductBean> getProducts();
	public List<ProductPerCategory> getProductByCategory();
	public List<ProductBean> getProductsByCate(int cat_id);

}
