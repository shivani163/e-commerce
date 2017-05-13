package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
import com.niit.model.User;


@Controller
public class LoginController {
	@Autowired
	User user;
	@Autowired
	ProductDao productDao;
	

	 //Spring Security related******
	 @RequestMapping("/auth")
		public String getAuthenticate()
		{
			return "auths";
		}
	 @RequestMapping("/logins")
		public String getLog()
		{
			return "SignInPage";
		}
	 @RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
		public ModelAndView defaultPage() {
		 	System.out.println("");
		 	
			List<Product> plist=productDao.getAllproduct();
			ModelAndView model = new ModelAndView("LandingPage");
			model.addObject("pList", plist);
			System.out.println(plist.size());
			System.out.println("");
			return model;

		}
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
		public String getLogin(@RequestParam(value = "error", required = false) String error,
				@RequestParam(value = "logout", required = false) String logout, final RedirectAttributes redirectAttributes) {
		 		System.out.println("login page");
			ModelAndView model = new ModelAndView();
			if (error != null) {
				model.addObject("error", "Invalid username and password!");
				System.out.println("Error");
				model.setViewName("SignInPage");
				return "SignInPage";
			}

			else if (logout != null) {
				model.addObject("msg", "you have loggedout successfully");
				System.out.println("LogOut");
			model.setViewName("LandingPage");
				return "redirect:landing";
				
			}
			else
			{
			System.out.println("some error");
			model.setViewName("auths");
			return "auths";
			}
			

		}
	 
	 

}


