package com.example.todoliste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"todolist.todo"})
//!!!!!!!ÇOK ÖNMELİ BURASI!!!!!!
public class TodolisteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolisteApplication.class, args);
	}

}
