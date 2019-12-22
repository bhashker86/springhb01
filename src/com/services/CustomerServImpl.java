package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.CustomerDao;
import com.model.CustomerDo;
import com.model.CustomerVO;

@Service
//@Component
public class CustomerServImpl implements  CustomerServ{

	@Autowired
	private CustomerDao customerdao;
	
	public boolean addCustomer(CustomerVO customer){
		
		Boolean status=false;
		CustomerDo customer_do=prepareCustDo(customer);
		int id=0;
			
		if(customerdao!=null){
		 id=customerdao.addCustomer(customer_do);
		}
		else{
		  System.out.println("customerdao is null");	
		}
		
		if(id>0){
			status=true;	
		}
		
		return status;
		
		
	}
	
	
	public List<CustomerVO> getCustomers(){
     return customerdao.getCustomers();	
		
	}
	
	
	
	public boolean deleteCustomer(int id){
		
		boolean status=false;
		
		if(customerdao.deleteCustomer(id)>0){
			status=true;
		}
		
		return status;
		
	}
	
	
	
	public CustomerVO getCustomer(int id){
		CustomerVO customer=new CustomerVO();
		customer=prepareCustVo(customerdao.getCustomer(id));
		return customer;
		
	}
	
	
	public void updateCustomer(CustomerVO customer){
		
		CustomerDo customer_do= new CustomerDo();
		customer_do=prepareCustDo(customer);
		boolean  status=false;
		customerdao.updateCustomer(customer_do);
		
	}
	
	
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

	private CustomerDo prepareCustDo(CustomerVO customer){
		
		CustomerDo customer_do= new CustomerDo();	
		
		customer_do.setId(customer.getId());
		customer_do.setAge(customer.getAge());
		customer_do.setCountry(customer.getCountry());
		customer_do.setCity(customer.getCity());
		
		customer_do.setFirst_name(customer.getFirst_name());
		customer_do.setLast_name(customer.getLast_name());
		customer_do.setGender(customer.getGender());
		customer_do.setEmail(customer.getEmail());
		
		customer_do.setMobile(customer.getMobile());
		customer_do.setPostal_code(customer.getPostal_code());
		customer_do.setRegion(customer.getRegion());
		customer_do.setDescription(customer.getDescription());
		customer_do.setCreated_at(customer.getCreated_at());
		
		return customer_do;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
