package com.model;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

public class CategoryVO implements Serializable{

private int id;
@NotEmpty
private String category;
@NotEmpty
@Min(1)
@Max(10)
@Pattern(regexp="[1-9]")
private String preference;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public String getPreference() {
	return preference;
}

public void setPreference(String preference) {
	this.preference = preference;
}

@Override
public String toString() {
	return "CategoryVO [id=" + id + ", Category=" + category + ", preference=" + preference + "]";
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	result = prime * result + id;
	result = prime * result + ((preference == null) ? 0 : preference.hashCode());
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
	CategoryVO other = (CategoryVO) obj;
	if (category == null) {
		if (other.category != null)
			return false;
	} else if (!category.equals(other.category))
		return false;
	if (id != other.id)
		return false;
	if (preference == null) {
		if (other.preference != null)
			return false;
	} else if (!preference.equals(other.preference))
		return false;
	return true;
}



}
