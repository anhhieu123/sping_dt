package com.hieunguyen.daoImp;

import java.util.List;

import com.hieunguyen.entity.Products;

public interface ProductImp {
	List<Products> laydsProducts(int begin);	
	Products  laySPTheoProductsId(int pro_id);
}
