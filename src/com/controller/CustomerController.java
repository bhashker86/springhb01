package com.controller;

import java.util.*;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.hibernate.Query;

import com.dao.CustomerDao;
import com.model.*;

import com.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView; 


@Controller
@RequestMapping("customer")
@SessionAttributes("page_title")
public class CustomerController {

	
	@Autowired
	private CustomerServ customerserv;
	@Autowired
	private CountryServ countryserv;
	
	@Autowired
	private MyMailImpl mail_impl;


@RequestMapping(value="add-customer",method=RequestMethod.GET)	
public ModelAndView addCustomer(ModelMap model){
		
	 ModelAndView mv=new ModelAndView("customer/add_customer_view");
	 Map map=new HashMap();
	 map.put("page_title","- Add Customer");
	 map.put("page_heading", "Add Customer");
	 mv.addAllObjects(map);
	return mv;
		
}

@RequestMapping(value="add",method=RequestMethod.GET)
public ModelAndView addNewCustomer(){

	ModelAndView mav=new ModelAndView("customer/add_new_customer","customer",new CustomerVO());
    Map map=new HashMap();
   
    map.put("page_title", "Add New Customer");
    map.put("page_heading", "Add New Customer");
    map.put("customer", new CustomerVO());
    map.put("country_list", getCountryVOList(countryserv.getCountryList()));
      
    
    mav.addAllObjects(map);
    return mav;
	
}


@RequestMapping(value="add-new-customer",method=RequestMethod.POST)
public ModelAndView addNewCustSbmt(@Valid @ModelAttribute("customer") CustomerVO customer,BindingResult result){
	Map map=new HashMap();
	
	
  if(result.hasErrors())
  {
	ModelAndView mav=new ModelAndView("customer/add_new_customer","customer",customer) ; 
	map.put("page_title", "Add New Customer");
	map.put("page_heading", "Add New Customer");
	map.put("country_list", getCountryVOList(countryserv.getCountryList()));
	mav.addAllObjects(map);
	return mav;
	  
  }
  else
  {
	  if(customerserv.addCustomer(customer)){
			map.put("status", "Sucessfully Added");
			
			mail_impl.sendEMail("bhashkardhari@gmail.com", "bhahkerkumar@outlook.com", "asdf", "asdfas");
			
			
		}else{
			map.put("status", "Not Sucessfully Added");
		}
		
	  ModelAndView mav= new ModelAndView("redirect:customer-list");
	  mav.addAllObjects(map);
	   return mav;
  }

}

@RequestMapping(value="edit-customer/{id}",method=RequestMethod.GET)
public ModelAndView editCustomerView(@PathVariable("id") int id){
	CustomerVO customer=null;
	customer=customerserv.getCustomer(id);
	
	Map map=new HashMap();
	//map.put("page_title", "Changes "+customer.getFirst_name()+" Data");
	map.put("page_heading", "Welcome Back "+customer.getFirst_name());
	map.put("customer", customer);
	map.put("country_list", getCountryVOList(countryserv.getCountryList()));
	
	ModelAndView mav=new ModelAndView("customer/edit_new_customer_view","customer" ,customer);
	mav.addAllObjects(map);
	return mav;
}


@RequestMapping(value="edit-customer-sbmt", method=RequestMethod.POST)
public ModelAndView editCustomerSbmt(@Valid @ModelAttribute("customer") CustomerVO customer,BindingResult result){
	Map map=new HashMap();
	
	if(result.hasErrors()){
	    ModelAndView mav=new ModelAndView("customer/edit_new_customer_view","customer" ,customer);
	  
	    map.put("page_heading", "Welcome Back "+customer.getFirst_name());
		map.put("customer", customer);
		map.put("country_list", getCountryVOList(countryserv.getCountryList()));
		mav.addAllObjects(map);
	  return mav;	
	}
	else{
		customerserv.updateCustomer(customer);
		ModelAndView mav=new ModelAndView("redirect:/customer/customer-list");
		 return mav;
		
	}
 
	
}





@RequestMapping(value="add-customer", method=RequestMethod.POST)
public String addCustomerSbmt(@ModelAttribute("customervo") CustomerVO customervo){
	Map map=new HashMap();

	if(customerserv.addCustomer(customervo)){
		map.put("status", "Sucessfully Added");
	}else{
		map.put("status", "Not Sucessfully Added");
	}
	
return "redirect:customer-list"	;

	
}


@RequestMapping(value="customer-list", method=RequestMethod.GET)
public ModelAndView getCustomers(){
	 Map map= new HashMap();
	 ModelAndView mv= new ModelAndView("customer/customer_list_view");
	 
	 if(!customerserv.getCustomers().isEmpty())
	 {
		 map.put("customers_list", customerserv.getCustomers() );
	 }
	 
	 mv.addAllObjects(map);
	  return mv;
	 
 }

@RequestMapping(value="delete-customer/{id}", method=RequestMethod.GET)
public String deleteCustomer(ModelMap model ,@PathVariable("id")    int id){
	Map map=new HashMap();
	String ret_stirng=null;
	
	
	if(customerserv.deleteCustomer(id)){
		ret_stirng="sucessfully Deleted";	
	}
	else{
		ret_stirng="Not deleted";	
	}
	map.put("status", ret_stirng);
	model.addAllObjects(map);
	
	return "redirect:/customer/customer-list";
	
}


@RequestMapping(value="change-customer/{id}",method=RequestMethod.GET)
public ModelAndView getCustomer(@PathVariable("id") int id){
	ModelAndView mv=new ModelAndView("customer/edit_customer_view");
	Map map =new HashMap();
	CustomerVO customer= new CustomerVO();
	customer=customerserv.getCustomer(id);
	
	
	map.put("page_title", "Change Customer Data");
	map.put("page_heading", "Changes Customer Data");
	map.put("customer", customer);
	mv.addAllObjects(map);
	return mv;
	
}


@RequestMapping(value="change-customer",method=RequestMethod.POST)
public String editCustomer(@ModelAttribute("customer") CustomerVO customer){
customerserv.updateCustomer(customer);
return "redirect:/customer/customer-list";
}
	


/************Convert the country data object to country value object******************/
private List<CountryVO> getCountryVOList(List<CountryDO> country_list){
	List<CountryVO> country_vo_list=new ArrayList<CountryVO>();
	
	if(!country_list.isEmpty()){
		
	
	for(CountryDO country : country_list){
		CountryVO country_vo=new CountryVO();	
		
		country_vo.setId(country.getId());
		country_vo.setCode(country.getCountry_code());
		country_vo.setName(country.getCountry_name());
		
		country_vo_list.add(country_vo);
	}
	
	
	}
	return country_vo_list;
}


/*******************Convert the customerdo to customer do*************************/
private CustomerVO prepareCustVo(CustomerDo customer){
	CustomerVO csutomer_vo=new CustomerVO();
	
	csutomer_vo.setId(customer.getId());
	csutomer_vo.setAge(customer.getAge());
	csutomer_vo.setCountry(customer.getCountry());
	csutomer_vo.setCity(customer.getCity());
	
	csutomer_vo.setFirst_name(customer.getFirst_name());
	csutomer_vo.setLast_name(customer.getLast_name());
	csutomer_vo.setGender(customer.getGender());
	csutomer_vo.setEmail(customer.getEmail());
	
	csutomer_vo.setMobile(customer.getMobile());
	csutomer_vo.setPostal_code(customer.getPostal_code());
	csutomer_vo.setRegion(customer.getRegion());
	csutomer_vo.setDescription(customer.getDescription());
	csutomer_vo.setCreated_at(customer.getCreated_at());
	
	return csutomer_vo;
}












	
	
	

}
