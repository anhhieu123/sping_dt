package com.hieunguyen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hieunguyen.dao.CategoriesDao;
import com.hieunguyen.daoImp.CategoriesImp.CategoriesProImp;
import com.hieunguyen.entity.Categories;
@Service
public class CategoriesService implements CategoriesProImp {
	
	@Autowired
	CategoriesDao cate;
	@Override
	public List<Categories> getDMSP() {
		// TODO Auto-generated method stub
		return cate.getDMSP();
	}

}
