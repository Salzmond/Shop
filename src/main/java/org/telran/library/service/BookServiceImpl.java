package org.telran.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.library.model.Book;
import org.telran.library.repository.BookRepository;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book findOne(long isbn) {
        return bookRepository.findOne(isbn);
    }

    @Override
    public Book borrowFromLibrary(long isbn) {
        return bookRepository.borrowFromLibrary(isbn);
    }

    @Override
    public boolean returnToLibrary(Book book) {
        return bookRepository.returnToLibrary(book);
    }
}