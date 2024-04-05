package com.natwest.TaskRestfulWebService.repository;


import com.natwest.TaskRestfulWebService.controller.ProductController;
import com.natwest.TaskRestfulWebService.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

    public List<Product> getProductByName(String name);




}
