package com.example.todoliste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"todolist.todo"})
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories(basePackages = "todolist.todo")
@EntityScan(basePackages = "todolist.todo")


//!!!!!!!ÇOK ÖNMELİ BURASI!!!!!!
public class TodolisteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolisteApplication.class, args);
	}

}
