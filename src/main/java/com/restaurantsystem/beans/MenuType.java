package com.restaurantsystem.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class MenuType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int menu_id;
	
	@Column
	private String menu_name;
	
	@Column
	private String menu_type;
	
	@Column
	private int menu_price;
	
	@Column
	private int restaurant_id;
	
	
	public MenuType() {
		// TODO Auto-generated constructor stub
	}


	public MenuType(int menu_id, String menu_name, String menu_type, int menu_price, int restaurant_id) {
		super();
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.menu_type = menu_type;
		this.menu_price = menu_price;
		this.restaurant_id = restaurant_id;
	}


	public int getMenu_id() {
		return menu_id;
	}


	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}


	public String getMenu_name() {
		return menu_name;
	}


	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}


	public String getMenu_type() {
		return menu_type;
	}


	public void setMenu_type(String menu_type) {
		this.menu_type = menu_type;
	}


	public int getMenu_price() {
		return menu_price;
	}


	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}


	public int getRestaurant_id() {
		return restaurant_id;
	}


	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}


	@Override
	public String toString() {
		return "MenuType [menu_id=" + menu_id + ", menu_name=" + menu_name + ", menu_type=" + menu_type
				+ ", menu_price=" + menu_price + ", restaurant_id=" + restaurant_id + "]";
	}
	
	
	
	
}

