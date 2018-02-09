package com.restaurantsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.restaurantsystem.beans.MenuItem;
import com.restaurantsystem.beans.MenuType;
import com.restaurantsystem.beans.RestaurantName;
import com.restaurantsystem.service.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	public void setRestaurantService(RestaurantService resturantService) {
		this.restaurantService = resturantService;
	}
	
	@RequestMapping(value = "/")
	public ResponseEntity<?> testData(ModelAndView model, String userid) throws Exception
	{
		List<RestaurantName> resturantdata=restaurantService.getAllResturants();
		return ResponseEntity.ok().body(resturantdata);
	}
	
	
	@RequestMapping(value = "/resturantName/{id}")
	public ResponseEntity<?> testData(@PathVariable("id") String id,ModelAndView model, String userid) throws Exception
	{
		List<RestaurantName> resturantdata=restaurantService.getResturantByName(id);
		return ResponseEntity.ok().body(resturantdata);
	}
	
	@RequestMapping(value = "/resturantName/{id}/{menu}")
	public ResponseEntity<?> testData(@PathVariable("id") String id, @PathVariable("menu") String menu,ModelAndView model, String userid) throws Exception
	{
		List<MenuType> menudata=restaurantService.getMenu(id, menu);
		return ResponseEntity.ok().body(menudata);
	}
	
	@RequestMapping(value = "/resturantName/{id}/{menu}/{menuid}")
	public ResponseEntity<?> testData(@PathVariable("id") String id, @PathVariable("menuid") String menuid, @PathVariable("menu") String menu,ModelAndView model, String userid) throws Exception
	{
		List<MenuItem> menudata=restaurantService.getMenuItems(menuid);
		return ResponseEntity.ok().body(menudata);
	}
}
