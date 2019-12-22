package com.model;
import org.hibernate.validator.constraints.*;

import javax.validation.constraints.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


public class CustomerVO {
	
	
private int id;

@NotEmpty
@Email
private String email;
@NotEmpty
//@Pattern(regexp = "[A-Za-z]")
private  String first_name;
@NotEmpty
//@Pattern(regexp = "[A-Za-z]")
private  String last_name;
@NotEmpty
private  String gender;
@Min(1) @Max(99) 
private int age;
@Size( min=10,max=12)
private String mobile;
@NotEmpty
private String description;
private String created_at;
private String city;
private String  country;
private String postal_code;
private String region;


public CustomerVO(){
	
	
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
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the first_name
 */
public String getFirst_name() {
	return first_name;
}
/**
 * @param first_name the first_name to set
 */
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
/**
 * @return the last_name
 */
public String getLast_name() {
	return last_name;
}
/**
 * @param last_name the last_name to set
 */
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
/**
 * @return the gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender the gender to set
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return the mobile
 */
public String getMobile() {
	return mobile;
}
/**
 * @param mobile the mobile to set
 */
public void setMobile(String mobile) {
	this.mobile = mobile;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}

/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the created_at
 */
public String getCreated_at() {
	return created_at;
}
/**
 * @param created_at the created_at to set
 */
public void setCreated_at(String created_at) {
	this.created_at = created_at;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the country
 */
public String getCountry() {
	return country;
}
/**
 * @param country the country to set
 */
public void setCountry(String country) {
	this.country = country;
}
/**
 * @return the postal_code
 */
public String getPostal_code() {
	return postal_code;
}
/**
 * @param postal_code the postal_code to set
 */
public void setPostal_code(String postal_code) {
	this.postal_code = postal_code;
}
/**
 * @return the region
 */
public String getRegion() {
	return region;
}
/**
 * @param region the region to set
 */
public void setRegion(String region) {
	this.region = region;
}


/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CustomerVO other = (CustomerVO) obj;
	if (id != other.id)
		return false;
	return true;
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "CustomerVO [id=" + id + ", email=" + email + ", first_name=" + first_name + ", last_name=" + last_name
			+ ", gender=" + gender + ", age=" + age + ", mobile=" + mobile + ", description=" + description
			+ ", created_at=" + created_at + ", city=" + city + ", country=" + country + ", postal_code=" + postal_code
			+ ", region=" + region + "]";
}
	
	

}
