package main;  
import java.util.HashMap;
import java.util.Map;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import main.*;


@Controller
@RequestMapping("user")
public class Welcome {
	
@RequestMapping(value="add_user",method=RequestMethod.GET)	
public ModelAndView getAddUserForm(){
Map map=new HashMap();
map.put("title", "welcome to add user");
map.put("other_info","Please fill all information");
ModelAndView mv=new ModelAndView("add_user_view");
mv.addAllObjects(map);
//mv.addObject("title", "welcome to add user");
return mv;

}

@RequestMapping(value="add_user_submit",method=RequestMethod.POST)
public ModelAndView addUserSubmit(@ModelAttribute("user") User user){
Map map=new HashMap();
map.put("user", user);
ModelAndView mv=new ModelAndView("add_user_success");
mv.addAllObjects(map);
return mv;
	
	
}
	
	
	
	

}
