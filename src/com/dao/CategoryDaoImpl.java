package com.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.model.CategoryBean;

@Repository 
public class CategoryDaoImpl implements CategoryDao {

	@Resource(name="sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
           this.sessionFactory = sessionFactory;
    }
	
	
    /******Add Category*********************************/
	public int addCategory(CategoryBean category){
	  Session session=sessionFactory.openSession();
	  int id=0;
	  
	 // id=(int)session.save(category);
	  return id;
		 
	}
	
	
	
	public List<CategoryBean> getCategoryies()
	{
       List<CategoryBean> category_list=new  ArrayList<CategoryBean>();
	   Session session=sessionFactory.openSession();
	   Criteria crt=session.createCriteria(CategoryBean.class);
	   
	   crt.addOrder(Order.asc("preference"));
//	   crt.add(Restrictions.like("category", "%l%"));
//	   Criterion crn=Restrictions.eq("category", "Electronics");
//	   Criterion crn_eq=Restrictions.eq("category","Men");
//	   
//	   LogicalExpression exp=Restrictions.or(crn,crn_eq);
//	   crt.add(exp);
	   
	   
	   //crt.setFirstResult(0);
	   //crt.setMaxResults(3);
	   return category_list=(ArrayList<CategoryBean>)crt.list();
    }
	
	
}
