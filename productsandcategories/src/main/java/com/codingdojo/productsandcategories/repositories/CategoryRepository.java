package com.codingdojo.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.Product;


public interface CategoryRepository extends CrudRepository<Category, Long>  {
		Category findByIdIs(Long id);
		List<Category> findAll();
		List<Category> findAllByProducts(Product product);
		List<Category> findByProductsNotContains(Product product);
}
