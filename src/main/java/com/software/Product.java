package com.software;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int id;
	private String name;
	private String type;
	private String place;
	private String warranty;
	
	public Product() {
		
	}

	public Product(int id, String name, String type, String place, String warranty) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.place = place;
		this.warranty = warranty;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", place=" + place + ", warranty=" + warranty
				+ "]";
	}
	

}
