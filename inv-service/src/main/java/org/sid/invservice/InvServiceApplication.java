package org.sid.invservice;

import org.sid.invservice.entities.Product;
import org.sid.invservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class InvServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvServiceApplication.class, args);
    }
@Bean
    public CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("PC").price(123444).quantity(122).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("tel").price(9444).quantity(32).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("tv").price(8944).quantity(54).build());



        };
}
}
