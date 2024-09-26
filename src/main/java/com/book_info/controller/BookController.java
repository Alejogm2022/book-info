package com.book_info.controller;

import com.book_info.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @GetMapping("/book")
    public String getBookDetails(
            @RequestParam(value = "title", required = true) String title,
            @RequestParam(value = "author", required = true) String author,
            @RequestParam(value = "year", required = true) int year,
            Model model) {

        // Crear un objeto Book
        Book book = new Book(title, author, year);

        // Pasar el objeto a la vista
        model.addAttribute("book", book);

        return "bookDetails"; // Nombre de la vista (bookDetails.html)
    }
}

