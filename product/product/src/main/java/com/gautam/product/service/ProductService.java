package com.gautam.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gautam.product.entity.Product;
import com.gautam.product.repository.ProductRepository;

@Service
public class ProductService {
	
	
    @Autowired
	private ProductRepository repository;
    
    //post save single product
    public Product saveProduct(Product product) {
    	return repository.save(product);
    }
    
  //post save list of product
    public List <Product> saveProducts(List<Product> products) {
    	return repository.saveAll(products);
    }
      
    //Get list of product
    public List<Product> getProducts(){
    	return repository.findAll();
    }
    
  //Get single product by Id
    public Product getProductById(int id){
    	return repository.findById(id).orElse(null);
    }
    
  //Get single product by Name
    public Product getProductByName(String name){
    	return repository.findByName(name);
    }
    
    //delete by id
    public String deleteProduct(int id) {
	 repository.deleteById(id);
		return "product removed" +id;
    	
    }
    
   // update product
//    public Product updateProduct(Product product) {
//		Product existingProduct= repository.findById(product.getId()).orElse(null);
//        existingProduct.setName(product.getName());
//        existingProduct.setQuantity(product.getQuantity());
//        existingProduct.setPrice(product.getPrice());
//		return repository.save(existingProduct);
//    	
//    }
    
}
