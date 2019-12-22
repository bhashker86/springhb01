package com.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class CustomerDo {
	
@Id
@GeneratedValue
private  int id;
private  String email;


private  String first_name;
private  String last_name;
private  String gender;
private  int    age;
private  String mobile;
private  String description;
private  String created_at;
private  String city;
private  String  country;
private  String postal_code;
private  String region;


public CustomerDo(){
	
	
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getFirst_name() {
	return first_name;
}

public void setFirst_name(String first_name) {
	this.first_name = first_name;
}

public String getLast_name() {
	return last_name;
}

public void setLast_name(String last_name) {
	this.last_name = last_name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}

public String getCreated_at() {
	return created_at;
}

public void setCreated_at(String created_at) {
	this.created_at = created_at;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getPostal_code() {
	return postal_code;
}

public void setPostal_code(String postal_code) {
	this.postal_code = postal_code;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
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
	CustomerDo other = (CustomerDo) obj;
	if (id != other.id)
		return false;
	return true;
}


@Override
public String toString() {
	return "CustomerVO [id=" + id + ", email=" + email + ", first_name=" + first_name + ", last_name=" + last_name
			+ ", gender=" + gender + ", age=" + age + ", mobile=" + mobile + ", description=" + description
			+ ", created_at=" + created_at + ", city=" + city + ", country=" + country + ", postal_code=" + postal_code
			+ ", region=" + region + "]";
}
	


}
