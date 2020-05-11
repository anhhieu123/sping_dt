package com.hieunguyen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hieunguyen.dao.CommentDao;
import com.hieunguyen.daoImp.CommentImp.CommentDsImp;
import com.hieunguyen.entity.Comment;

@Service
public class CommentService implements CommentDsImp{
	
	@Autowired
	CommentDao cmtdao;
	@Override
	public List<Comment> getDSCMT() {
		// TODO Auto-generated method stub
		return cmtdao.getDSCMT();
	}

}
