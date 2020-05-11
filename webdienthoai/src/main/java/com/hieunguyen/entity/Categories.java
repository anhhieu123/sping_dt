package com.hieunguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="vp_categories")
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cate_id;
	String cate_name;
	String cate_slug;
	int parent;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cate_id")
	Set<Products> danhsachSanPhams;
	
	public Set<Products> getDanhsachSanPhams() {
		return danhsachSanPhams;
	}
	public void setDanhsachSanPhams(Set<Products> danhsachSanPhams) {
		this.danhsachSanPhams = danhsachSanPhams;
	}
	public int getCate_id() {
		return cate_id;
	}
	public void setCate_id(int cate_id) {
		this.cate_id = cate_id;
	}
	public String getCate_name() {
		return cate_name;
	}
	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}
	public String getCate_slug() {
		return cate_slug;
	}
	public void setCate_slug(String cate_slug) {
		this.cate_slug = cate_slug;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	
}
