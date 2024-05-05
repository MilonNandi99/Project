package com.mobileStock.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TopSales")
public class MobileList {

	@Id
	private int id;
	private String name;
	private String brand;
	private String price;
	private int quantity;
	public MobileList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MobileList(int id, String name, String brand, String price,int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.brand=brand;
		this.price = price;
		this.quantity=quantity;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
