package com.hieunguyen.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hieunguyen.entity.GioHang;

@Controller
@RequestMapping("api/")
@SessionAttributes({"listGioHangs"})
public class APIController {
	
	@GetMapping("AddGioHang")
	@ResponseBody
	private String ThemGioHang(@RequestParam int masp,
			@RequestParam int soluong, @RequestParam String tensp,
			@RequestParam String giatien,HttpSession httpSession) {

		if (null == httpSession.getAttribute("listGioHangs")) {
			List<GioHang> listGioHangs = new ArrayList<GioHang>();
			GioHang gioHang = new GioHang();
			gioHang.setMasp(masp);
			gioHang.setSoluong(1);
			gioHang.setTensp(tensp);
			gioHang.setGiatien(giatien);
			listGioHangs.add(gioHang);

			httpSession.setAttribute("listGioHang", listGioHangs);
			return listGioHangs.size() + "";

		} else {

			@SuppressWarnings("unchecked")
			List<GioHang> listGioHangs = (List<GioHang>) httpSession.getAttribute("listGioHang");
			int vitri = checkSPTonTai(listGioHangs, masp, httpSession);
			if (vitri == -1) {

				GioHang gioHang = new GioHang();
				gioHang.setMasp(masp);
				gioHang.setSoluong(1);
				gioHang.setTensp(tensp);
				gioHang.setGiatien(giatien);

				listGioHangs.add(gioHang);
			} else {

				int soluongcu = listGioHangs.get(vitri).getSoluong();
				listGioHangs.get(vitri).setSoluong(soluongcu + 1);
			}

			return listGioHangs.size() + "";

		}	
		
		
	}
	private int checkSPTonTai(List<GioHang> listGiohang, int masp,  HttpSession httpSession) {
		@SuppressWarnings("unchecked")
		List<GioHang> listGioHangs = (List<GioHang>) httpSession.getAttribute("listGioHang");
		for (int i = 0; i < listGioHangs.size(); i++) {

			if (listGioHangs.get(i).getMasp() == masp) {	
				return i;
			}
		}

		return -1;
	}

}
