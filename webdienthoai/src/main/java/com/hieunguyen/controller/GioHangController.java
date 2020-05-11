package com.hieunguyen.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hieunguyen.entity.GioHang;

@Controller
@RequestMapping("/giohang/")
public class GioHangController {
	@GetMapping
	public String Default(ModelMap modelMap, HttpSession httpSession) {
		
		if (null != httpSession.getAttribute("listGioHang")) {
			@SuppressWarnings("unchecked")
			List<GioHang> gioHangs= (List<GioHang>) httpSession.getAttribute("listGioHang");
			modelMap.addAttribute("soluongSP",gioHangs.size());
			modelMap.addAttribute("giohangs", gioHangs);	
		}
		return"giohang";
	}

}
