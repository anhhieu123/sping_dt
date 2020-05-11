package com.hieunguyen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hieunguyen.dao.ProductDao;
import com.hieunguyen.daoImp.ProductImp;
import com.hieunguyen.entity.Products;
@Service
public class ProductService implements ProductImp{
	@Autowired
	ProductDao prodDao;
	@Override
	public List<Products> laydsProducts(int begin) {
		// TODO Auto-generated method stub
		return prodDao.laydsProducts(begin);
	}
	@Override
	public Products laySPTheoProductsId(int pro_id) {
		// TODO Auto-generated method stub
		return prodDao.laySPTheoProductsId(pro_id);
	}

}
