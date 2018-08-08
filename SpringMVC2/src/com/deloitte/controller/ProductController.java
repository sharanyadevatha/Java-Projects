package com.deloitte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.dao.ProductDaoImpl;
import com.deloitte.pojo.Product;

@Controller
public class ProductController {

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView Product() {
		Product product = new Product();
		product.setId(1);
		product.setPrice(1000.00);
		product.setName("Mouse");
		return new ModelAndView("Product", "command",product );
	}
	
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("SpringWeb") Product product, ModelMap model) {
		ProductDaoImpl PD = new ProductDaoImpl();
		PD.save(product);
		model.addAttribute("name", product.getName());
		model.addAttribute("price", product.getPrice());
		model.addAttribute("id", product.getId());
		
		return "result";
	}
}