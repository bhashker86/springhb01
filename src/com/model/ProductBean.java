package com.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="product")

public class ProductBean  implements Serializable{

	
	@Id
	@GeneratedValue
	private int     id;
	@Column(name="product_name",nullable=false,length=200)
	private String  name;
	@Column(name="product_title",nullable=false,length=200)
	private String  title;
	
	@Column(name="price",nullable=false,length=10)
	private int  price;
	@Column(name="color",nullable=true,length=200)
	private String  color;
	@Column(name="model_number",nullable=false,length=200)
	private  String model_number;
	@Column(name="model_name",nullable=false,length=200)
    private String  model_name;
	@Column(name="categoryies_id",nullable=false,length=10)
	private int  category_id;
	@Transient
	private int  sub_category_id;
	@Column(name="product_url",nullable=true,length=200)
	private String  product_url;
	
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private CategoryBean category;
	
	
	public  void ProductBean(){
		
		
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getModel_number() {
		return model_number;
	}
	
	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}
	
	public String getModel_name() {
		return model_name;
	}
	
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	
	
	public int getCategory_id() {
		return category_id;
	}
	
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	public int getSub_category_id() {
		return sub_category_id;
	}
	
	public void setSub_category_id(int sub_category_id) {
		this.sub_category_id = sub_category_id;
	}
	
	public String getProduct_url() {
		return product_url;
	}
	
	public void setProduct_url(String product_url) {
		this.product_url = product_url;
	}
	
	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", name=" + name + ", title=" + title + ", price=" + price + ", color=" + color
				+ ", model_number=" + model_number + ", model_name=" + model_name + ", category_id=" + category_id
				+ ", sub_category_id=" + sub_category_id + ", product_url=" + product_url + "]";
	}



	/**
	 * @return the category
	 */
	public CategoryBean getCategory() {
		return category;
	}



	/**
	 * @param category the category to set
	 */
	public void setCategory(CategoryBean category) {
		this.category = category;
	}
	
	
	
}
