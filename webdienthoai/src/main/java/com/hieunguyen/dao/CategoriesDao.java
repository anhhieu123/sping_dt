package com.hieunguyen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hieunguyen.daoImp.CategoriesImp.CategoriesProImp;
import com.hieunguyen.entity.Categories;


@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CategoriesDao implements CategoriesProImp {
	
	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	public List<Categories> getDMSP() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		String query= "from vp_categories";
		  List<Categories> getDMSP= (List<Categories>) session.createQuery(query).getResultList();
		// TODO Auto-generated method stub
		return getDMSP;
	}

}
