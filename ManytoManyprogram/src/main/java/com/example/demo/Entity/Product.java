package com.example.demo.Entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Long product_id;
	@ManyToMany(mappedBy="product" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonBackReference
	private Set<Customer> customer;
	@Column(name="name")
	private String name;
	@Column(name="dept")
	private String dept;
	@Column(name="price")
	private String price;
	public Set<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	

}
