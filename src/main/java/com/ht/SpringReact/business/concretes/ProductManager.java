package com.ht.SpringReact.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(productDao.getByProductName(productName), "Data Listelendi");
		// return productDao.findAll();
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<Product>(
				productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(
				productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>(productDao.getByCategoryIn(categories), "Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameContains(productName),
				"Data Listelendi");

	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>(productDao.getByProductNameStartsWith(productName),
				"Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable = (Pageable) PageRequest.of(pageNo - 1, pageSize);
		return new SuccessDataResult<List<Product>>(productDao.findAll(pageable).getContent());
	}

}
