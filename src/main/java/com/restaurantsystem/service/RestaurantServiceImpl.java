package com.restaurantsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restaurantsystem.beans.MenuItem;
import com.restaurantsystem.beans.MenuType;
import com.restaurantsystem.beans.RestaurantName;
import com.restaurantsystem.dao.RestaurantDao;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantDao restaurantdao;
	
	public void setRestaurantdao(RestaurantDao resturantdao) {
		this.restaurantdao = resturantdao;
	}
	
	@Override
	public List<RestaurantName> getAllResturants() {
		return restaurantdao.getAllResturants();
	}

	@Override
	public List<RestaurantName> getResturantByName(String id) {
		return restaurantdao.getResturantByName(id);
	}

	@Override
	public List<MenuType> getMenu(String resturantid, String menutype) {
		return restaurantdao.getMenu(resturantid, menutype);
	}

	@Override
	public List<MenuItem> getMenuItems(String menuid) {
		return restaurantdao.getMenuItems(menuid);
	}

	
	
}
