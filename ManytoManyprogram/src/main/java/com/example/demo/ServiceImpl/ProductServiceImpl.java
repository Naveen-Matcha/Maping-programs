package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;
import com.example.demo.Service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product createProduct(Product proReq) {
		// TODO Auto-generated method stub
		return productRepository.save(proReq);
	}

	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(long id, Product proReq) {
		// TODO Auto-generated method stub
		Product prod = productRepository.getById(id);
		prod.setProduct_id(proReq.getProduct_id());
		prod.setName(proReq.getName());
		prod.setDept(proReq.getDept());
		prod.setPrice(proReq.getPrice());
		return productRepository.save(proReq);
	}

	@Override
	public void deleteProduct(long id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}

	@Override
	public Page<Product> getProductPagination(Pageable pageable) {
		// TODO Auto-generated method stub
		return productRepository.findAll(pageable);
	}

}
