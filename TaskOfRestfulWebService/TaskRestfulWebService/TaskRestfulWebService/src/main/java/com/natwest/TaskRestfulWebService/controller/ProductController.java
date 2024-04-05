package com.natwest.TaskRestfulWebService.controller;

import com.natwest.TaskRestfulWebService.entity.Product;
import com.natwest.TaskRestfulWebService.exception.InvalidIdException;
import com.natwest.TaskRestfulWebService.exception.InvalidPriceException;
import com.natwest.TaskRestfulWebService.repository.ProductRepository;
import com.natwest.TaskRestfulWebService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/p1")
public class ProductController {


      @Autowired
    ProductService productService;

    @PostMapping("product")
    public ResponseEntity<Product> createNewProduct(@RequestBody Product product) throws InvalidPriceException {
        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.OK);
    }



    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProduct(), HttpStatus.OK);
    }


    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getproductById(@PathVariable int id){
        return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
    }




    @PutMapping("product/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable int id) throws InvalidIdException {

        return new ResponseEntity<>(productService.updateProduct(id, product), HttpStatus.OK);

    }




    @DeleteMapping("product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) throws InvalidIdException{

        return new ResponseEntity<>(productService.deletedById(id), HttpStatus.OK);

    }










}
