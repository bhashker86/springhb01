package com.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "categoryies")
public class CategoryBean implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false, length = 9)
	private int category_id;

	@Column(name = "category", unique = true, nullable = false, length = 100)
	private String category;

	@Column(name = "preference", unique = true, nullable = false, length = 2)
	private int preference;

	@OneToMany(mappedBy = "category")
	private Set<ProductBean> product_set;

	public CategoryBean() {

	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPreference() {
		return preference;
	}

	public void setPreference(int preference) {
		this.preference = preference;
	}

	/**
	 * @return the product_set
	 */
	public Set<ProductBean> getProduct_set() {
		return product_set;
	}

	/**
	 * @param product_set the product_set to set
	 */
	public void setProduct_set(Set<ProductBean> product_set) {
		this.product_set = product_set;
	}

}
