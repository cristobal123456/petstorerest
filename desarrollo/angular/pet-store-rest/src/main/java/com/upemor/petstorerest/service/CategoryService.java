package com.upemor.petstorerest.service;

import java.util.List;

import com.upemor.petstorerest.model.Category;

public interface CategoryService {
	List<Category> listAllCategories();

	Category findById(int id);

	boolean createCategory(Category category);

	Category updateCategory(int id, Category category);

	void deleteCategory(int id);
}

