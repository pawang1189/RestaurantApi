package com.restaurantsystem.dao;

import java.util.List;

import com.restaurantsystem.beans.MenuItem;
import com.restaurantsystem.beans.MenuType;
import com.restaurantsystem.beans.RestaurantName;

public interface RestaurantDao {

	public List<RestaurantName> getAllResturants();
	public List<RestaurantName> getResturantByName(String id);
	public List<MenuType> getMenu(String resturantid, String menutype);
	public List<MenuItem> getMenuItems(String menuid);
}
