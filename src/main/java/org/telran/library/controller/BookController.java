package org.telran.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.library.model.Book;
import org.telran.library.service.BookService;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{isbn}")
    public Book getByIsbn(@PathVariable(name = "isbn") long isbn) {
        return bookService.findOne(isbn);
    }

    @PostMapping("/return")
    public void returnToLibrary(@RequestBody Book book) {
        bookService.returnToLibrary(book);
    }

    @PostMapping("/borrow/{isbn}")
    public Book borrowFromLibrary(@PathVariable(name = "isbn") long isbn) {
       return bookService.borrowFromLibrary(isbn);
    }
}