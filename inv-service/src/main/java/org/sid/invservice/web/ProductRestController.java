package org.sid.invservice.web;

import lombok.AllArgsConstructor;
import org.sid.invservice.entities.Product;
import org.sid.invservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductRestController {
    private ProductRepository productRepository;
@GetMapping("/products")
//@PreAuthorize("hasAuthority('ADMIN')")
    public List<Product>products(){
        return productRepository.findAll();
    }

}
