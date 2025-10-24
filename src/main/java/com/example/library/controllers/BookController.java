package com.example.library.controllers;

import com.example.library.DTO.BookDTO;
import com.example.library.models.Book;
import com.example.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public Book createBook(@RequestBody BookDTO bookDTO){
        return bookService.saveNewBook(bookDTO);
    }

    @GetMapping
    public List<Book> findAllBooks(){
        return bookService.getAllBooks();
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id){
        bookService.deleteBookById(id);
    }

    @GetMapping("/{id}")
    public Optional<Book> findBookById(@PathVariable Long id){
        return bookService.findById(id);
    }
}
