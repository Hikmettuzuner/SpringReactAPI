package com.ht.SpringReact.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.SpringReact.business.abstracts.ProductService;
import com.ht.SpringReact.core.utilities.DataResult;
import com.ht.SpringReact.core.utilities.Result;
import com.ht.SpringReact.core.utilities.SuccessDataResult;
import com.ht.SpringReact.core.utilities.SuccessResult;
import com.ht.SpringReact.dataAccess.abstracts.ProductDao;
import com.ht.SpringReact.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(productDao.findAll(), "Data Listelendi");
		// return productDao.findAll();
	}

	@Override
	public Result add(Product product) {
		productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

}
