package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Controller
public class HomeController {
	

	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;

	@RequestMapping("/")
	public String getLandingPage(){
		return "Header";
	}

	@RequestMapping("/landing")
	public ModelAndView getLanding()
	{
		ModelAndView mv=new ModelAndView("LandingPage");
		List<Product> plist=productDao.getAllproduct();
		mv.addObject("pList", plist);
		System.out.println(plist.size());
		mv.addObject("msg", "Hello world");
		return mv;
	}
	
	@RequestMapping("/home")
	public ModelAndView getHome()
	{
		ModelAndView mv=new ModelAndView("home");
		List<Product> plist=productDao.getAllproduct();
		mv.addObject("pList", plist);
		System.out.println(plist.size());
		mv.addObject("msg", "Hello world");
		return mv;
	}

	@RequestMapping("login")
	public String getLogin()
	{
		return "login";
	}
	
}
