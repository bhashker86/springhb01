package com.services;

import java.util.List;

import com.model.*;

public interface CustomerServ {
	
	public boolean addCustomer(CustomerVO customer);		
	public List<CustomerVO> getCustomers();
	public boolean deleteCustomer(int id);
	public CustomerVO getCustomer(int id);
	public void updateCustomer(CustomerVO customer);
	
}
