package com.example.demo.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;

@Service
public interface ProductService {

	Product createProduct(Product proReq);

	List<Product> getProduct();

	Product updateProduct(long id, Product proReq);

	void deleteProduct(long id);

	Page<Product> getProductPagination(Pageable pageable);

}
