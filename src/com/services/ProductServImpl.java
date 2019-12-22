package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CategoryDao;
import com.dao.ProductDao;
import com.model.*;

@Service
public class ProductServImpl implements ProductServ {
	
	@Autowired
	private ProductDao product_dao;
	@Autowired
	private CategoryDao category_dao;
	
	public boolean addProduct(ProductBean product){
		int id=0;
		id=product_dao.addProduct(product);
		if(id>0)
		{
			return true;
		}
		else
		{
		     return false;	
		}
		
	}
	
	public List<ProductBean> getProducts(){
	  return product_dao.getProducts();	
	}
	
	public List<ProductPerCategory> getProductByCategory(){
		
	 List<CategoryVO> category_list=(List<CategoryVO>)getCategoryVO(category_dao.getCategoryies());
	 List<ProductPerCategory> ppc=new ArrayList<ProductPerCategory>();
	 
	  for(CategoryVO category:category_list){
		  ProductPerCategory pp=new ProductPerCategory();
		  pp.setCategory_id(category.getId());
		  pp.setCategory_name(category.getCategory());
		  pp.setTotal_count(product_dao.totalProductByCategory(category));
		  ppc.add(pp);
       }
	  return ppc;
	  
	}
	
	
	private List<CategoryVO> getCategoryVO(List<CategoryBean> category_set){
		List<CategoryVO> category_vo_set=new ArrayList<CategoryVO>();
		
		if(!category_set.isEmpty())
		{
			for(CategoryBean category_b:category_set)
			{
			  CategoryVO category_vo=new CategoryVO();
			  category_vo.setId(category_b.getCategory_id());
			  category_vo.setCategory(category_b.getCategory());
			  category_vo.setPreference(  String.valueOf(category_b.getPreference()));
			  
			  category_vo_set.add(category_vo);
		
			}
			
		}
		
		return category_vo_set;
		
	}
	
	public List<ProductBean> getProductsByCate(int cat_id){
		return product_dao.getProductsByCate(cat_id);
	}

	
	

}
