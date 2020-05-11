
package com.hieunguyen.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="vp_products")
public class Products {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int prod_id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "prod_cate")
	Categories cate;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name ="com_id")
	Set<Comment> dscomment;
	

	public Set<Comment> getDscomment() {
		return dscomment;
	}
	public void setDscomment(Set<Comment> dscomment) {
		this.dscomment = dscomment;
	}
	String prod_name;
	String prod_slug;
	String prod_price;
	String prod_img;
	String prod_warranty;
	String prod_accessories;
	String prod_condition;

	String prod_promotion;
	byte prod_status;
	String prod_description;
	byte prod_featured;
	int prod_soluong;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "prod_id")
	Set<Comment> com;
	
	
	public Products() {
		super();
	}
	public Products( Categories cate, Set<Comment> dscomment, String prod_name, String prod_slug,
			String prod_price, String prod_img, String prod_warranty, String prod_accessories, String prod_condition,
			String prod_promotion, int prod_status, String prod_description, byte prod_featured, Set<Comment> com) {
		super();
		
		this.cate = cate;
		this.dscomment = dscomment;
		this.prod_name = prod_name;
		this.prod_slug = prod_slug;
		this.prod_price = prod_price;
		this.prod_img = prod_img;
		this.prod_warranty = prod_warranty;
		this.prod_accessories = prod_accessories;
		this.prod_condition = prod_condition;
		this.prod_promotion = prod_promotion;
		this.prod_status = (byte) prod_status;
		this.prod_description = prod_description;
		this.prod_featured = prod_featured;
		this.com = com;
	}
	public Categories getCate() {
		return cate;
	}
	public void setCate(Categories cate) {
		this.cate = cate;
	}
	public Set<Comment> getCom() {
		return com;
	}
	public void setCom(Set<Comment> com) {
		this.com = com;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_slug() {
		return prod_slug;
	}
	public void setProd_slug(String prod_slug) {
		this.prod_slug = prod_slug;
	}
	public String getProd_price() {
		return prod_price;
	}
	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}
	public String getProd_img() {
		return prod_img;
	}
	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}
	public String getProd_warranty() {
		return prod_warranty;
	}
	public void setProd_warranty(String prod_warranty) {
		this.prod_warranty = prod_warranty;
	}
	public String getProd_accessories() {
		return prod_accessories;
	}
	public void setProd_accessories(String prod_accessories) {
		this.prod_accessories = prod_accessories;
	}
	public String getProd_condition() {
		return prod_condition;
	}
	public void setProd_condition(String prod_condition) {
		this.prod_condition = prod_condition;
	}
	public String getProd_promotion() {
		return prod_promotion;
	}
	public void setProd_promotion(String prod_promotion) {
		this.prod_promotion = prod_promotion;
	}
	public String getProd_description() {
		return prod_description;
	}
	public void setProd_description(String prod_description) {
		this.prod_description = prod_description;
	}
	public byte getProd_featured() {
		return prod_featured;
	}
	public void setProd_featured(byte prod_featured) {
		this.prod_featured = prod_featured;
	}
	public byte getProd_status() {
		return prod_status;
	}
	public void setProd_status(byte prod_status) {
		this.prod_status = prod_status;
	}
	public int getProd_soluong() {
		return prod_soluong;
	}
	public void setProd_soluong(int prod_soluong) {
		this.prod_soluong = prod_soluong;
	}
	
	
}
