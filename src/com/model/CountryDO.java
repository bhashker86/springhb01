package com.model;

import javax.persistence.*;

@Entity
@Table(name="countries")
public class CountryDO {
	
@Id
@GeneratedValue
private int id;
private String country_code;
private String country_name;



public CountryDO(){
	
	
}


/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the country_code
 */
public String getCountry_code() {
	return country_code;
}
/**
 * @param country_code the country_code to set
 */
public void setCountry_code(String country_code) {
	this.country_code = country_code;
}
/**
 * @return the country_name
 */
public String getCountry_name() {
	return country_name;
}
/**
 * @param country_name the country_name to set
 */
public void setCountry_name(String country_name) {
	this.country_name = country_name;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "CountryDO [id=" + id + ", country_code=" + country_code + ", country_name=" + country_name + "]";
}


}
