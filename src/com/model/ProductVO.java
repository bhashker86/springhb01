package com.model;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ProductVO  implements Serializable {
	
	
	private int     id;
	@NotEmpty
	private String  name;
	@NotEmpty
	//@Pattern(regexp="[A-Za-z]")
	private String  title;
	@NotEmpty
	//@Pattern(regexp="[1-9]")
	@Min(1)
	private String  price;
	private String  color;
	private  String model_number;
    private String  model_name;
    @NotEmpty
	private String  category_id;
	private String  sub_category_id;
	private String  product_url;
	
	
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
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
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
	
	public String getCategory_id() {
		return category_id;
	}
	
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	
	public String getSub_category_id() {
		return sub_category_id;
	}
	
	public void setSub_category_id(String sub_category_id) {
		this.sub_category_id = sub_category_id;
	}
	
	public String getProduct_url() {
		return product_url;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVO other = (ProductVO) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public void setProduct_url(String product_url) {
		this.product_url = product_url;
	}
	
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", title=" + title + ", price=" + price + ", color=" + color
				+ ", model_number=" + model_number + ", model_name=" + model_name + ", category_id=" + category_id
				+ ", sub_category_id=" + sub_category_id + ", product_url=" + product_url + "]";
	}

}
