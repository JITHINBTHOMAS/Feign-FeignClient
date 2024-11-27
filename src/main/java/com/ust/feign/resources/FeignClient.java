package com.ust.feign.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.feign.ifaces.ProductFeignInterface;
import com.ust.feign.model.Product;

@RestController
@RequestMapping("/client")
public class FeignClient {
	
	@Autowired
	private ProductFeignInterface productFeignClient;
	
	@GetMapping("/products")
	public List<Product> getAll(){
		return productFeignClient.getAllProducts();
	}
	
	@GetMapping("/prod/{id}")
	public Product getOne(@PathVariable int id) {
		return productFeignClient.getById(id);
	}
	
	@GetMapping("/brand/{name}")
	public List<Product> getBrand(@PathVariable String name){
		return productFeignClient.getByBrand(name);
	}
	
	@PostMapping("/add")
	public Product addprod(@RequestBody Product prod) {
		return productFeignClient.addprod(prod);
	}
}
