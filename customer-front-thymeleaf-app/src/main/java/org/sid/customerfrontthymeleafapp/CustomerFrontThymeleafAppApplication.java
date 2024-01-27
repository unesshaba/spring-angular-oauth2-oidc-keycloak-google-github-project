package org.sid.customerfrontthymeleafapp;

import org.sid.customerfrontthymeleafapp.entities.Customer;
import org.sid.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
	}
@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(Customer.builder().name("youness").email("youness@gmail.com").build());
			customerRepository.save(Customer.builder().name("karim").email("karim@gmail.com").build());
			customerRepository.save(Customer.builder().name("test").email("test@gmail.com").build());
		};
	}
}
