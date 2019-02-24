package com.sd.springboot.example.springbootdemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sd.springboot.example.springbootdemo.model.Product;

@RestController
public class SpringBootDemoRestAPI {

	private static Map<String, Product> productRepo = new HashMap<>();
	static {
		Product honey = new Product();
		honey.setId("1");
		honey.setName("Honey");
		productRepo.put(honey.getId(), honey);

		Product almond = new Product();
		almond.setId("2");
		almond.setName("Almond");
		productRepo.put(almond.getId(), almond);
	}
	
	@RequestMapping(value = "/product/{id}" , method = RequestMethod.GET)
	public ResponseEntity<Object> getProduct(@PathVariable("id") String id) {
		
		if("1".equals(id)) {
			Map<String, Product> productRepo = new HashMap<>();
			Product honey = new Product();
			honey.setId("1");
			honey.setName("Honey");
			productRepo.put(honey.getId(), honey);
			return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
			
		}else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		

		
		
	}

	@RequestMapping(value = "/products" , method = RequestMethod.GET)
	public ResponseEntity<Object> getProducts() {
		return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	   public ResponseEntity<Object> createProduct(@RequestBody Product product) {
	      productRepo.put(product.getId(), product);
	      return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
	   }
	
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
	   public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) { 
	      productRepo.remove(id);
	      product.setId(id);
	      productRepo.put(id, product);
	      return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
	   } 
	
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
	   public ResponseEntity<Object> delete(@PathVariable("id") String id) { 
	      productRepo.remove(id);
	      return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
	   }

}
