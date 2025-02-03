package git.tiensang.nba_shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import git.tiensang.nba_shop.models.Product;
import git.tiensang.nba_shop.services.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // API lay tat ca san pham
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
