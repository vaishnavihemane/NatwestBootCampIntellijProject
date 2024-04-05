package com.natwest.TaskRestfulWebService.service;

import com.natwest.TaskRestfulWebService.entity.Product;
import com.natwest.TaskRestfulWebService.exception.InvalidIdException;
import com.natwest.TaskRestfulWebService.exception.InvalidPriceException;
import com.natwest.TaskRestfulWebService.repository.ProductRepository;
import com.natwest.TaskRestfulWebService.utility.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{


    @Autowired
    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) throws InvalidPriceException {
        if(product.getPrice()<=0){
            throw new InvalidPriceException(AppConstant.INVALID_PRICE_MESSAGE);
        }

        return productRepository.save(product);

    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElseThrow(() -> new InvalidIdException(AppConstant.ID_NOT_FOUND_MESSAGE));
    }

    @Override
    public String deletedById(int id) throws InvalidIdException{

        if(!productRepository.existsById(id)){
            throw new InvalidIdException(AppConstant.ID_NOT_FOUND_MESSAGE);
        }

        productRepository.deleteById(id);

        return AppConstant.DELETED_MESSAGE;
    }

    @Override
    public List<Product> getProductByProductName(String name) {
        return productRepository.getProductByName(name);
    }

    @Override
    public Product updateProduct(int id, Product product) {

        if(!productRepository.existsById(id)){
            throw new InvalidIdException(AppConstant.ID_NOT_FOUND_MESSAGE);
        }

        return productRepository.save(product);
    }




}
