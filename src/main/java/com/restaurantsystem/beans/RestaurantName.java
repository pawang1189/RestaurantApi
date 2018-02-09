package com.restaurantsystem.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restaurantname")
public class RestaurantName implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int restaurant_id;
	
	@Column
	private String restaurant_name;
	 
	@Column
	private String owner;
	
	@Column
	private String description;
	
	@Column
	private String address;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private int zip;
	
	@Column
	private String food_type;
	
	@Column
	private String service_type;
	
	@Column
	private String website;
	
	@Column
	private String contact;
	
	public RestaurantName() {
		// TODO Auto-generated constructor stub
	}

	public RestaurantName(int restaurant_id, String restaurant_name, String owner, String description, String address,
			String city, String state, int zip, String food_type, String service_type, String website, String contact) {
		super();
		this.restaurant_id = restaurant_id;
		this.restaurant_name = restaurant_name;
		this.owner = owner;
		this.description = description;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.food_type = food_type;
		this.service_type = service_type;
		this.website = website;
		this.contact = contact;
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}

	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getFood_type() {
		return food_type;
	}

	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	
	@Override
	public String toString() {
		return "ResturantName [restaurant_id=" + restaurant_id + ", restaurant_name=" + restaurant_name + ", owner="
				+ owner + ", description=" + description + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", food_type=" + food_type + ", service_type=" + service_type + ", website="
				+ website + ", contact=" + contact + "]";
	}
	
	
	
	
	
	
	
}

