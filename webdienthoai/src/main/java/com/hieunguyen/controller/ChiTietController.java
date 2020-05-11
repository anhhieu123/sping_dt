package com.hieunguyen.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hieunguyen.entity.Categories;
import com.hieunguyen.entity.Comment;
import com.hieunguyen.entity.GioHang;
import com.hieunguyen.entity.Products;
import com.hieunguyen.service.CategoriesService;
import com.hieunguyen.service.CommentService;
import com.hieunguyen.service.ProductService;

@Controller
@RequestMapping("/chitiet/")
@SessionAttributes({"listGioHangs"})
public class ChiTietController {
	
	@Autowired
	CategoriesService cateService;
	
	@Autowired
	ProductService prodService;
	
	@Autowired
	CommentService cmtService;
	
	@GetMapping("{pro_id}")
	public String Default(@PathVariable int pro_id,ModelMap modelMap, HttpSession httpSession) {
		
		Products products = prodService.laySPTheoProductsId(pro_id);
		if (null != httpSession.getAttribute("listGioHangs")) {
			@SuppressWarnings("unchecked")
			List<GioHang> gioHangs= (List<GioHang>) httpSession.getAttribute("listGioHangs");
			modelMap.addAttribute("Giohangs",gioHangs.size());
		}
		
		List<Categories> listcate=cateService.getDMSP();
		List<Comment> listcmt= cmtService.getDSCMT();
		
		modelMap.addAttribute("listcate", listcate);
		modelMap.addAttribute("products",products);
		modelMap.addAttribute("listcmt",listcmt);
		
		
		
		
		return "chitiet";
	}

}
