package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.manju.model.Users;
import com.niit.dao.CartDao;
import com.niit.dao.CategoryDao;
import com.niit.dao.ProductDao;
import com.niit.dao.ShippingDao;
import com.niit.dao.UserDao;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Shipping;
import com.niit.model.User;


@Controller
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	@Autowired
	Product product;
	
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	Category category;
	
	@Autowired
	CartDao cartDao;
	@Autowired
    Cart cart;
	
	@Autowired
	UserDao userDao;
	@Autowired
	User user;
	
	@Autowired
	ShippingDao shippingDao;
	@Autowired
	Shipping shipping;
	
//	saveProduct
	@RequestMapping("addProduct")
	public ModelAndView addProduct(@ModelAttribute("prod")Product product)
	{
		
		ModelAndView mv=new ModelAndView("AddProduct");
//	Product products=new Product(); 
		mv.addObject("prod", product);
		return mv;
	}
	

	
		@RequestMapping("saveProduct")
		public String savingProduct(@ModelAttribute("prod") Product product, final RedirectAttributes redirectAttributes){
			ModelAndView mv=new ModelAndView();
		int count=0;
		System.out.println(product.getCategory()+" "+product.getProductname());
		count=productDao.saveOrUpdate(product);
		
		if(count>0){mv.addObject("success", "Product Data Inserted Succefully");}
		
		return "redirect:plisting";
	}
	@RequestMapping("savProduct")
	public String EditProd(@ModelAttribute("prod") Product product, final RedirectAttributes redirectAttributes){
		
		ModelAndView mv=new ModelAndView("AddProduct");
		int count=0;
		System.out.println(product.getCategory()+" "+product.getProductname());
		count=productDao.saveOrUpdate(product);		
		if(count>0){mv.addObject("success", "Product Data Inserted Succefully");}
		
		return "redirect:addProduct";
	}

	   @RequestMapping("plisting")
	   public ModelAndView getAllProduct()
	   {
		   ModelAndView mv=new ModelAndView("ProductTable");
		   List<Product> plist=productDao.getAllproduct();
		   mv.addObject("pList", plist);
		   return mv;
	   }
	   @RequestMapping("delprod")                         
	   public String getDelProduct(@RequestParam(value="Id", required=true) int productId,final RedirectAttributes redirectAttributes)
	   {
		   int x=productDao.deleteProductById(productId);
		   System.out.println("deleted "+productId);
		   return "redirect:plisting";
	   }
	   @RequestMapping("editprod")
	   public ModelAndView getEditProduct(@RequestParam(value="Id", required=true) int productId,final RedirectAttributes redirectAttributes)
	   {
		   product=productDao.getProductBy(productId);
		   System.out.println("dd"+product.getProductname());
		   ModelAndView mv=new ModelAndView("AddProduct");
		   mv.addObject("prod",product);
		   return mv;
	   }
	   @RequestMapping("AddProduct")
	   public ModelAndView takeForm()
	   {
		   ModelAndView mv=new ModelAndView("AddProduct");
		   return mv;   
	   }
	//Cart
	@RequestMapping("addCart")	
	public String addToCart(@RequestParam(value="Id", required=true) int productId,@RequestParam(value="usr") String usr, final RedirectAttributes redirectAttributes)
	{
		product=productDao.getProductBy(productId);
		List<Cart> clist=cartDao.getAllcart();
		int cnt=clist.size();
		cnt=cnt+1;
		cart.setCartid(cnt);
		cart.setId_userid(product.getProductid());
		cart.setCartid(product.getProductid());
		cart.setProductname(product.getProductname());
		cart.setProductprice(555);
		cartDao.saveOrUpdate(cart);
		return "redirect:prodETAIL?Id="+productId;
	}
   @RequestMapping("saveCart")
   public String savingCart(@ModelAttribute("cart") Cart cart, final RedirectAttributes redirectAttributes){
		ModelAndView mv=new ModelAndView("AddCart");
		int count=0;
		System.out.println(cart.getProductname()+" "+cart.getCartid());
		count=cartDao.saveOrUpdate(cart);
		
	if(count>0){mv.addObject("success", "CartData Inserted Succefully");}
		
		return "redirect:/prodETAIL?Id";
}
   //shipping
   
  // @RequestMapping("shippingDetail")
  // public ModelAndView shippingDetail(@ModelAttribute("shippingdetail") Shipping shipping)
  /////	{
  	//	ModelAndView mv=new ModelAndView("AddShipping");
    //     mv.addObject("shippingdetail", shipping);
  	///	return mv;
  	//}
   // @RequestMapping("saveShippingDetail")
   // public String savingUserDetail(@ModelAttribute("shippingdetail")  Shipping shipping, final RedirectAttributes redirectAttributes)
   // {
  //		ModelAndView mv=new ModelAndView("AddShipping");
  	////	int count=0;
  	//	System.out.println(shipping.getUserid()+" "+shipping.getFirstname());
  //		count=shippingDao.saveOrUpdate(shipping);
  	///	
  //	if(count>0){mv.addObject("success", "Users Data Inserted Succefully");}
  		
  //		return "redirect:shipppingDetail";
 // }
   
 //Category
   
   @RequestMapping("addCategory")
   public ModelAndView addCategory(@RequestParam(value="Id", required=true) int productId, final RedirectAttributes redirectAttributes)
	{
		ModelAndView mv=new ModelAndView("AddCategory");
       mv.addObject("category", category);
		return mv;
	}
  @RequestMapping("saveCategory")
 public String savingCategory(@ModelAttribute("category") Category category, final RedirectAttributes redirectAttributes)
  {
		ModelAndView mv=new ModelAndView("AddCategory");
		int count=0;
		System.out.println(category.getCategoryid()+" "+category.getCategory());
		count=categoryDao.saveOrUpdate(category);
		
	if(count>0){mv.addObject("success", "Category Data Inserted Succefully");}
		
		return "redirect:addCategory";
}
   
   @RequestMapping("clisting")
   public ModelAndView getAllCart()
   {
	   ModelAndView mv=new ModelAndView("CartTable");
	   List<Cart> clist=cartDao.getAllcart();
	   mv.addObject("cList", clist);
	   return mv;
   }
   @RequestMapping("prodETAIL")
   public ModelAndView getProDetails(@RequestParam(value="Id", required=true) int productId,final RedirectAttributes redirectAttributes)
{
	   product=productDao.getProductBy(productId);
	   ModelAndView mv=new ModelAndView("ProductDetails");
	   mv.addObject("product",product);
	   return mv;
}
   @RequestMapping("ulisting")
	  public ModelAndView getAllUserList(){
		  ModelAndView mv =new ModelAndView("UserTable");
		  List<User>ulist=userDao.getAlluser();
		  mv.addObject("uList", ulist);
		  return mv;
	  }
   @RequestMapping("gotolanding")
	 public ModelAndView gobacktolanding()
	 {
		 ModelAndView mv=new ModelAndView("LandingPage");
	     return mv;
	 }
   @RequestMapping("tousertable")
   public ModelAndView getAllUsers()
   {
  	  ModelAndView mv=new ModelAndView("UserTable");
  	  List<User> ulist=userDao.getAlluser();
  	  mv.addObject("uList",ulist);
  	  return mv;
   }


}
