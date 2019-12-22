package com.dao;

import java.util.List;
import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.model.CountryDO;


@Repository
public class CountryDaoImpl implements CountryDao{

	@Resource(name="sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
           this.sessionFactory = sessionFactory;
    }
	
	
	
	
	public List<CountryDO> getCountryList(){
		
	List <CountryDO> country_list;	
	Session session=sessionFactory.openSession();
	
	String sql_query="from CountryDO";
	Query query=session.createQuery(sql_query);
	return country_list=(List <CountryDO>) query.list();
		
	}		
	
	
}
