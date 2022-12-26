package com.ht.SpringReact.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.SpringReact.business.abstracts.ProductService;
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
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

}
