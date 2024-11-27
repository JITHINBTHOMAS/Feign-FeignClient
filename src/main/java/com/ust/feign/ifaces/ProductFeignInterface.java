package com.ust.feign.ifaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.feign.model.Product;

@FeignClient(value="productFeignClient",url="http://localhost:8090/product/api1.0")
public interface ProductFeignInterface {
	
	@GetMapping("/productsinfo")
	public List<Product> getAllProducts();
	
	@GetMapping("/product/{id}")
	public Product getById(@PathVariable int id);
	
	@GetMapping("/product/Brand/{name}")
	public List<Product> getByBrand(@PathVariable String name);
	
	@PostMapping("/addProduct")
	public Product addprod(@RequestBody Product prod);
}
