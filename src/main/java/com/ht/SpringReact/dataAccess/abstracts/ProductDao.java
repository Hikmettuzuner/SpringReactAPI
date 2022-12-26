package com.ht.SpringReact.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ht.SpringReact.entities.concretes.Product;



public interface ProductDao extends JpaRepository<Product, Integer> {

	
}
