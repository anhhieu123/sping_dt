package com.hieunguyen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hieunguyen.daoImp.ProductImp;
import com.hieunguyen.entity.Products;



@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ProductDao implements ProductImp {
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Products> laydsProducts(int begin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<Products> listProd= (List<Products>) session.createQuery("from vp_products").setFirstResult(begin).setMaxResults(8).getResultList();
		System.out.println(" "+ listProd.get(1));
		
		return listProd;
	}
	
	@Override
	@Transactional
	public Products laySPTheoProductsId(int pro_id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String queryString = "from vp_products pro where pro.prod_id=" + pro_id;
		Products prod = (Products) session.createQuery(queryString).getSingleResult();	
		
		return prod;
	}

}
