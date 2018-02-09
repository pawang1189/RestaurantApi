package com.restaurantsystem.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.restaurantsystem.beans.MenuItem;
import com.restaurantsystem.beans.MenuType;
import com.restaurantsystem.beans.RestaurantName;


@Repository
public class RestaurantDaoImpl implements RestaurantDao {

    private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<RestaurantName> getAllResturants() {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="from RestaurantName";
		Query query=session.createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<RestaurantName> data= query.list();
		tx.commit();
		session.flush();
		return data;
	}

	@Override
	public List<RestaurantName> getResturantByName(String id) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="from RestaurantName as RN where RN.restaurant_id=:id";
		Query query=session.createQuery(hql);
		query.setString("id", id);
		@SuppressWarnings("unchecked")
		List<RestaurantName> data= query.list();
		tx.commit();
		session.flush();
		return data;
	}

	@Override
	public List<MenuType> getMenu(String resturantid, String menutype) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="from MenuType as M where M.restaurant_id=:id and M.menu_type=:menu";
		Query query=session.createQuery(hql);
		query.setString("id", resturantid);
		query.setString("menu", menutype);
		@SuppressWarnings("unchecked")
		List<MenuType> data= query.list();
		tx.commit();
		session.flush();
		return data;
	}

	@Override
	public List<MenuItem> getMenuItems(String menuid) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="from MenuItem as M where M.menu_id=:id";
		Query query=session.createQuery(hql);
		query.setString("id", menuid);
		@SuppressWarnings("unchecked")
		List<MenuItem> data= query.list();
		tx.commit();
		session.flush();
		return data;
	}

}
