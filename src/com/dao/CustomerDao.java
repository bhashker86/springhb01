package com.dao;

import java.util.List;

import com.model.CustomerDo;
import com.model.CustomerVO;

public interface CustomerDao {

public int addCustomer(CustomerDo customer);
public List<CustomerVO> getCustomers();
public int deleteCustomer(int id);
public CustomerDo getCustomer(int id);
public void updateCustomer(CustomerDo customer);
	

}
