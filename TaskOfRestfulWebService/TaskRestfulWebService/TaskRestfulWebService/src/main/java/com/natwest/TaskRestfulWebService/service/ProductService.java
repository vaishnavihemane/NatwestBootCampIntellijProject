package com.natwest.TaskRestfulWebService.service;

import com.natwest.TaskRestfulWebService.entity.Product;
import com.natwest.TaskRestfulWebService.exception.InvalidIdException;
import com.natwest.TaskRestfulWebService.exception.InvalidPriceException;

import java.util.List;

public interface ProductService {


    public Product addProduct(Product product) throws InvalidPriceException;
    public List<Product> getAllProduct();
    public Product getProductById(int id) throws InvalidIdException;
    public String deletedById(int id) throws InvalidIdException;
    public List<Product> getProductByProductName(String name);

    public Product updateProduct(int id, Product product);



}
