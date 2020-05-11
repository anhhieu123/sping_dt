package com.hieunguyen.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hieunguyen.daoImp.CommentImp.CommentDsImp;
import com.hieunguyen.entity.Comment;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CommentDao implements CommentDsImp {


	@Autowired
	SessionFactory sessionFactory;
	@Transactional
	@Override
	public List<Comment> getDSCMT() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		String query= "from vp_comment";
		  List<Comment> getDSCMT= (List<Comment>) session.createQuery(query).getResultList();
		return getDSCMT;
	}

}
