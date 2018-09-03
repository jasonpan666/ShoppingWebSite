package onlineShop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String returnHomePage() {
   	 return "index";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error,
   		 @RequestParam(value = "logout", required = false) String logout) {
   	 ModelAndView modelAndView = new ModelAndView();
   	 
   	 if (error != null) {
   		 modelAndView.addObject("error", "Invalid username and Password");
   	 }

   	 if (logout != null) {
   		 modelAndView.addObject("logout", "You have logged out successfully");
   	 }
   	 
   	 modelAndView.setViewName("login");
   	 return modelAndView;
    }
    
    @RequestMapping("/aboutus")
    public String sayAbout() {
   	 return "aboutUs";
    }
}