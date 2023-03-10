package com.ht.SpringReact.business.abstracts;

import java.util.List;

import com.ht.SpringReact.core.utilities.DataResult;
import com.ht.SpringReact.core.utilities.Result;
import com.ht.SpringReact.entities.concretes.Product;

public interface ProductService {

	DataResult<List<Product>> getAll();

	DataResult<List<Product>> getAll(int pageNo, int pageSize);

	Result add(Product product);

	DataResult<Product> getByProductName(String productName);

	DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);

	DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);

	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains(String productName);

	DataResult<List<Product>> getByProductNameStartsWith(String productName);

	// List<Product> getAll();

}
