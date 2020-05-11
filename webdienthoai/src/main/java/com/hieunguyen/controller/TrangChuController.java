package com.hieunguyen.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hieunguyen.entity.Categories;
import com.hieunguyen.entity.Products;
import com.hieunguyen.service.CategoriesService;
import com.hieunguyen.service.ProductService;



@Controller
@RequestMapping("/")
public class TrangChuController {
	@Autowired
	ProductService proService;
	
	@Autowired
	CategoriesService cateService;
	
	@GetMapping
	public String Default(ModelMap modelMap, HttpSession httpSession) {
			
			List<Products> listSanPham = proService.laydsProducts(0);
			modelMap.addAttribute("listSanPham", listSanPham);
			
			List<Categories> listcate=cateService.getDMSP();
			modelMap.addAttribute("listcate", listcate);
			
			return "trangchu";
		}
}
