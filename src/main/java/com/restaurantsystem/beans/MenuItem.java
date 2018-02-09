package com.restaurantsystem.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu_item")
public class MenuItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int item_id;
	
	@Column
	private int menu_id;
	 
	@Column
	private String item_name;
	
	@Column
	private double price;
	
	@Column
	private String size;
	
	@Column
	private String calories;
	
	@Column
	private String ingredients;
	
	@Column
	private String image_url;
	
	@Column
	private String description;
	
	public MenuItem() {
		// TODO Auto-generated constructor stub
	}

	public MenuItem(int item_id, int menu_id, String item_name, double price, String size, String calories,
			String ingredients, String image_url, String description) {
		super();
		this.item_id = item_id;
		this.menu_id = menu_id;
		this.item_name = item_name;
		this.price = price;
		this.size = size;
		this.calories = calories;
		this.ingredients = ingredients;
		this.image_url = image_url;
		this.description = description;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "MenuItem [item_id=" + item_id + ", menu_id=" + menu_id + ", item_name=" + item_name + ", price=" + price
				+ ", size=" + size + ", calories=" + calories + ", ingredients=" + ingredients + ", image_url="
				+ image_url + ", description=" + description + "]";
	}
	
	
	
	
	
	
	
	
}

