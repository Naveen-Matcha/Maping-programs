package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product/add")
	public ResponseEntity<String> createProduct(@RequestBody Product proReq){
		Product product = productService.createProduct(proReq);
		return ResponseEntity.status(200).body("id is created"+product.getProduct_id());
	}
	@GetMapping("/product/list")
	public List<Product> getProduct(){
		return productService.getProduct();
	}
	@PutMapping("/product/edit/{id}")
	public ResponseEntity<String> updateProduct(@PathVariable long id, @RequestBody Product proReq){
		Product product = productService.updateProduct(id,proReq);
		return ResponseEntity.status(200).body("Id is updated"+product.getProduct_id());
	}
	@DeleteMapping("/product/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable long id){
		productService.deleteProduct(id);
		return ResponseEntity.status(200).body("id is deleted");
	}
	@GetMapping("/pagination/product")
	public ResponseEntity<List<Product>> getProductPagination(@RequestParam Integer pageSize,
			@RequestParam Integer pageNumber){
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		Page<Product> product = productService.getProductPagination(pageable);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<List<Product>>(product.getContent(), headers, HttpStatus.OK);
	}
	

}
