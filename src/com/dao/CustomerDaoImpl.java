package com.dao;

import java.util.List;

import javax.annotation.Resource;
import org.hibernate.Session;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.CustomerDo;
import com.model.CustomerVO;

@Repository
//@Component
public class CustomerDaoImpl implements CustomerDao {
	
	
	@Resource(name="sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
           this.sessionFactory = sessionFactory;
    }
	
	
    
	public int addCustomer(CustomerDo customer){
		int status=0;
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		
		session.saveOrUpdate(customer);
		txn.commit();
//		if(id!=0 && id>0){
//			status=	id;
//		}
		
		return status;
	}
	
	public List<CustomerVO> getCustomers(){
	List<CustomerVO> customer_list;	
	Session session=sessionFactory.openSession();
	String sql_query="FROM CustomerDo";
	Query query=session.createQuery(sql_query);
	customer_list=(List<CustomerVO>)query.list();
	
	return customer_list;
		
		
	}
	
	
	public int deleteCustomer(int id){
		
		Session session=sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		String sql_query="delete from CustomerDo where id=:customer_id";
		int deleted_id=0;
		Query query=session.createQuery(sql_query);
		query.setParameter("customer_id", id);
		
		
		try
		{
		   deleted_id=query.executeUpdate();
		}
		catch(Exception exp)
		{
			exp.getMessage();
		}
		
		txn.commit();
		return deleted_id;
		
	}
	
	
	public CustomerDo getCustomer(int id){
		
	Session session =sessionFactory.openSession();
	CustomerDo customer=new CustomerDo();
	try{
	    customer=(CustomerDo)session.get(CustomerDo.class, new Integer(id));
	}
	catch(Exception exp){
		exp.getMessage();
		exp.getStackTrace();
	}
	
	return customer;
		
		
		
	}
	
	public void updateCustomer(CustomerDo customer){
	
		Session session =sessionFactory.openSession();
		Transaction txn=session.beginTransaction();
		session.update(customer);
		txn.commit();
	}

	
	
	
	
	
	
	
	
	

}
