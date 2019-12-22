package com.model;

public class ProductPerCategory {

	private int category_id;
	private String category_name;
	private  Long  total_count;
	
	
	/**
	 * @return the category_id
	 */
	public int getCategory_id() {
		return category_id;
	}
	/**
	 * @param category_id the category_id to set
	 */
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	/**
	 * @return the category_name
	 */
	public String getCategory_name() {
		return category_name;
	}
	/**
	 * @param category_name the category_name to set
	 */
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	/**
	 * @return the total_count
	 */
	public Long getTotal_count() {
		return total_count;
	}
	/**
	 * @param total_count the total_count to set
	 */
	public void setTotal_count(Long total_count) {
		this.total_count = total_count;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProductPerCategory [category_id=" + category_id + ", category_name=" + category_name + ", total_count="
				+ total_count + "]";
	}
	
}
