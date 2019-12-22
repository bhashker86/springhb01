package com.controller;

import java.util.*;

import javax.annotation.Resource;
import org.hibernate.Query;

import com.model.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;  




@Controller
@RequestMapping("employee")
public class EmployeeController {
	
	@Resource(name="sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
           this.sessionFactory = sessionFactory;
    }
	
	
	
@RequestMapping(value="add",method=RequestMethod.GET)
public ModelAndView addEmployee()
{

		Map map=new HashMap();
		map.put("page_title", "Springhb01- Add Employee");
		map.put("page_header","Add Emplyee");
		map.put("form_info", "All Field Are Mandatory");

		ModelAndView mv=new ModelAndView("add_emp_view","command", new Employee());
		mv.addAllObjects(map);
		
		return mv;	

}	


@RequestMapping(value="add_employee_submit", method=RequestMethod.POST  )
public ModelAndView addEmployeeSbmt(@ModelAttribute("employee") Employee employee)
{
	
	Session session=sessionFactory.openSession();
	Transaction txn=session.beginTransaction();
	session.save(employee);
	txn.commit();
	
	
	Map map =new HashMap();
	map.put("employee",employee );
	ModelAndView mv=new ModelAndView("add_emp_success");
	mv.addAllObjects(map);
	return mv;

}

@RequestMapping(value="get_employee/{id}",method=RequestMethod.GET)
public ModelAndView getEmployee(@PathVariable("id") int id){
ModelAndView mv= new ModelAndView("employee_list");
String sql_query="FROM Employee where id=:id";


 Session session=sessionFactory.openSession();
 Map map= new HashMap();
 try{ 
  Query query=session.createQuery(sql_query);
  query.setParameter("id", id);
  Employee emp=(Employee)query.list().get(0);
  System.out.println(emp);
 
  map.put("employee",emp);
  
  } catch(Exception e){
	 
	String except=e.getMessage();
	map.put("exception",except);
 }
 mv.addAllObjects(map);
 
  
  return mv;
 



	
}







}
