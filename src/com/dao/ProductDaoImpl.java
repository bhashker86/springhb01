package com.dao;

import java.util.List;
import java.util.*;

import javax.annotation.Resource;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.persister.entity.Queryable;
import org.springframework.stereotype.Repository;

import com.model.CategoryBean;
import com.model.CategoryVO;
import com.model.ProductBean;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Resource(name="sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
           this.sessionFactory = sessionFactory;
    }
    
    
    
	
	public int addProduct(ProductBean product){
		
	 Session session =sessionFactory.openSession();	
	 int id=0;
	 //int id=(int) session.save(product);
	 return  id;
	}
	
	public List<ProductBean> getProducts(){
		List<ProductBean> product_list;
		Session session=sessionFactory.openSession();
		
		Criteria crt=session.createCriteria(ProductBean.class);
		crt.addOrder(Order.asc("name"));
		product_list= (List<ProductBean>)crt.list();
		return product_list;
		
		
	}
	
	
	
	public List getProductByCategory(){
		
	 Map<String,String> avilable_product=new HashMap<String,String>();	
	 Session session=sessionFactory.openSession();
	 String sql_query="from ProductBean as p inner join p.category_id CategoryBean ";
	 Query query=session.createQuery(sql_query);
	 List result=query.list();
	
	 return result;
	 
	}
	
	
	public Long totalProductByCategory(CategoryVO category){
		Session session=sessionFactory.openSession();
		Criteria  ctx=session.createCriteria(ProductBean.class);
		ctx.add(Restrictions.eq("category_id", category.getId()));
		ctx.setProjection(Projections.rowCount());
		Long total_items=(Long)ctx.list().get(0);
		return  total_items;
		
	}
	
	
	
	public List<ProductBean> getProductsByCate(int cat_id){
	 Session session=sessionFactory.openSession();
	 List<ProductBean> product_list= new ArrayList<ProductBean>();
	 
	 Criteria ctx=session.createCriteria(ProductBean.class);
	 ctx.add(Restrictions.eq("category_id", cat_id));
	 product_list=(List<ProductBean>)ctx.list();
	 return product_list;
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
