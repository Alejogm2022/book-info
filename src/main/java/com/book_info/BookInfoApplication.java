package com.book_info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookInfoApplication.class, args);
	}

}

// URL para prueba despues de levantar el proyecto:: http://localhost:8080/book?title=CienA%C3%B1osDeSoledad&author=Gabo&year=1967