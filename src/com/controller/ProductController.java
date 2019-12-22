package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

import javax.validation.Valid;

import com.model.CategoryBean;
import com.model.CategoryVO;
import com.model.ProductBean;
import com.model.ProductVO;
import com.services.CategoryServ;
import com.services.ProductServ;

@Controller
@RequestMapping("product")
public class ProductController {
	
@Autowired	
private CategoryServ category_serv;
@Autowired
private ProductServ product_serv;


	
	@RequestMapping(value="create-new", method=RequestMethod.GET)	
	public ModelAndView addProductView(){
	Map map=new HashMap();
	map.put("page_title","- Add Prodcut");
	map.put("page_heading", "Add Prodcut");
	map.put("category_list", getCategoryVO(category_serv.getCategoryies()));
	
		
	ModelAndView mav=new ModelAndView("product/add_product_view","product",new ProductVO());	
	mav.addAllObjects(map);	
	return mav;
	}
	
	
	
	
	
	@RequestMapping(value="create-prodcut-sbmt", method=RequestMethod.POST)
	public ModelAndView addProductSbmt(@Valid @ModelAttribute("product") ProductVO product,BindingResult result){
		     
		
		      Map map=new HashMap();
		      ModelAndView mav;
		      
		      if(result.hasErrors())
		      {
		    	  map.put("page_title","- Add Prodcut");
		      	  map.put("page_heading", "Add Prodcut");
		      	  map.put("category_list", getCategoryVO(category_serv.getCategoryies()));
		      	  mav=new ModelAndView("product/add_product_view","product",product);
		    	  return mav; 
		      }
		      else
		      {
		    	
		    	  if(product_serv.addProduct(getProductBean(product)))
		    	  {
		    		  return  new ModelAndView("redirect:get-product-list");  
			      
		    	  }
		    	  map.put("page_title","- Add Prodcut");
		      	  map.put("page_heading", "Add Prodcut");
		      	  map.put("category_list", getCategoryVO(category_serv.getCategoryies()));
		      	  mav=new ModelAndView("product/add_product_view","product",product);
		    	  return mav;
		      }	
	
	}
	
	
@RequestMapping(value="get-product-list", method=RequestMethod.GET)
public ModelAndView getProductList(){
		 Map map=new HashMap();
	     ModelAndView mav;
		
		
		map.put("page_title","- Product List");
	    map.put("page_heading", "Product List");
	    map.put("product_list",  getProductList( product_serv.getProducts()));
    	mav=new ModelAndView("product/product_list_view");
    	mav.addAllObjects(map);
  	    return mav;	
		
		
	}


@RequestMapping(value="get-product-list-by-category", method=RequestMethod.GET)
public ModelAndView getProductListByCategory(){
		 Map map=new HashMap();
	     ModelAndView mav;
		 Map  product_in_each_cat=new HashMap();
		
		map.put("page_title","- Product List By Category");
	    map.put("page_heading", "Product List By Category");
	    map.put("product_list_by_category", product_serv.getProductByCategory() );
	    
	   
    	mav=new ModelAndView("product/product_list_by_category_view");
    	mav.addAllObjects(map);
  	    return mav;	
		
		
	}
//@ResponseBody
@RequestMapping(value="get-product-by-category", method=RequestMethod.POST)
public String getAllProdcutOfCate(@RequestParam("cate_id") int cate_id, ModelMap map){
	     
	    map.put("page_heading", "asdkfhaskjd fhjadsfh");
	    String product_section="<div class="+"row"+">"+ "skdfhaskj; dfjksdfhj"+"</div>";
	    map.put("product_list", getProductList(product_serv.getProductsByCate(cate_id)));
	    return "product/product_list_ajax_view";	
		
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

private ProductBean getProductBean(ProductVO product){
	
ProductBean product_bean= new ProductBean();

product_bean.setName(product.getName());
product_bean.setTitle(product.getTitle());
product_bean.setPrice(Integer.parseInt(product.getPrice()));
product_bean.setColor(product.getColor());
product_bean.setModel_number(product.getModel_number());
product_bean.setModel_name(product.getModel_name());
product_bean.setCategory_id(Integer.parseInt(product.getCategory_id()));
//product_bean.setSub_category_id(Integer.parseInt(product.getSub_category_id()));
product_bean.setProduct_url(product.getProduct_url());

return product_bean;

} 


private List<ProductVO> getProductList(List<ProductBean> product_bean_list){
	
	List<ProductVO> product_vo_list= new ArrayList<ProductVO>();
	
	if(!product_bean_list.isEmpty())
	 {
		  for(ProductBean product:product_bean_list)	
		   {
				 ProductVO product_vo=new ProductVO();
				 
				 product_vo.setId(product.getId());
				 product_vo.setName(product.getName());
				 product_vo.setTitle(product.getTitle());
				 product_vo.setPrice(Integer.toString(product.getPrice())   );
				 product_vo.setColor(product.getColor());
				 product_vo.setModel_number(product.getModel_number());
				 product_vo.setModel_name(product.getModel_name());
				 product_vo.setCategory_id(Integer.toString(product.getCategory_id()));
				 product_vo.setSub_category_id( Integer.toString(product.getSub_category_id()));
				 product_vo.setProduct_url(product.getProduct_url());
				 
				 product_vo_list.add(product_vo);
		  
		   }
		
	 }
	return product_vo_list;
}






















}
