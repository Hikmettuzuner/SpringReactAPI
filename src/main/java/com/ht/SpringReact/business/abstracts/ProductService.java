package com.ht.SpringReact.business.abstracts;

import java.util.List;

import com.ht.SpringReact.core.utilities.DataResult;
import com.ht.SpringReact.core.utilities.Result;
import com.ht.SpringReact.entities.concretes.Product;

public interface ProductService {

	DataResult<List<Product>> getAll();

	Result add(Product product);

	// List<Product> getAll();

}
