package com.vk.shoppingbackend.dao;

import java.util.List;

import com.vk.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
	
}
