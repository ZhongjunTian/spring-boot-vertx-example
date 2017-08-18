package com.jontian.examples.vertx.verticle;

import com.jontian.examples.vertx.db.Product;
import com.jontian.examples.vertx.db.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhongjun on 8/17/17.
 */
@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/products")
    public List<Product> products(){
        return productService.getAllProducts();
    }
}
